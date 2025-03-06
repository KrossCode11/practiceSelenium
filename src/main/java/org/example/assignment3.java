package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class assignment3 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");


        String usernameXpath="//input[@id='username']";
        String userXpath="//span[@class='radiotextsty' and text()=' User']";
        String passwordXpath="//input[@id='password']";
        String dropdownXpath="//select[@class='form-control']";
        String consultantXpath="(//select[@class='form-control']//option)[3]";
        String termsXpath="//input[@id='terms']";
        String signInButtonXpath="//input[@id='signInBtn']";
        String popupButtonXpath="//button[@id='okayBtn']";


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(usernameXpath)));
        driver.findElement(By.xpath(usernameXpath)).sendKeys("rahulshettyacademy");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(passwordXpath)));
        driver.findElement(By.xpath(passwordXpath)).sendKeys("learning");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(userXpath)));
        driver.findElement(By.xpath(userXpath)).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(popupButtonXpath)));
        driver.findElement(By.xpath(popupButtonXpath)).click();



        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dropdownXpath)));
        driver.findElement(By.xpath(dropdownXpath)).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(consultantXpath)));
        driver.findElement(By.xpath(consultantXpath)).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(termsXpath)));
        driver.findElement(By.xpath(termsXpath)).click();

        driver.findElement(By.xpath(signInButtonXpath)).click();

        String addButton="//div[@class='card-footer']/button";

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(addButton)));

        List<WebElement> addButtonList= driver.findElements(By.xpath(addButton));
        for(int i=0;i<addButtonList.size();i++) {
            addButtonList.get(i).click();
        }

        String checkoutButton="//li[@class='nav-item active']//a";

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(checkoutButton)));
        driver.findElement(By.xpath(checkoutButton)).click();
        driver.quit();
    }
}
