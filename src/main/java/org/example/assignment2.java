package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment2 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        String nameXpath="//div[@class='form-group']//input[@name='name']";
        String emailXpath="//div[@class='form-group']//input[@name='email']";
        String passwordXpath="//div[@class='form-group']//input[@id='exampleInputPassword1']";
        String checkboxXpath="//div[@class='form-check']//input[@id='exampleCheck1']";
        String dropdownXpath="//div[@class='form-group']//select[@id='exampleFormControlSelect1']";
        String femaleDropdownXpath="//div[@class='form-group']//select[@id='exampleFormControlSelect1']//option[text()='Female']";
        String studentXpath="//div[@class='form-group']//input[@id='inlineRadio1']";
        String dateXpath="//div[@class='form-group']//input[@type='date']";
        String submitXpath="//input[@type='submit']";
        String messageXpath="//div[@class='alert alert-success alert-dismissible']";


        driver.findElement(By.xpath(nameXpath)).sendKeys("Akhil");
        driver.findElement(By.xpath(emailXpath)).sendKeys("j6KtH@example.com");
        driver.findElement(By.xpath(passwordXpath)).sendKeys("123456");
        driver.findElement(By.xpath(checkboxXpath)).click();
        driver.findElement(By.xpath(dropdownXpath)).click();
        driver.findElement(By.xpath(femaleDropdownXpath)).click();
        driver.findElement(By.xpath(studentXpath)).click();
        driver.findElement(By.xpath(dateXpath)).sendKeys("01-01-2023");
        driver.findElement(By.xpath(submitXpath)).click();

        System.out.println(driver.findElement(By.xpath(messageXpath)).getText());

        driver.quit();

    }
}
