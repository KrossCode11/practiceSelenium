package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import java.util.List;

public class assignment1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.xpath("(//div[@id='checkbox-example']//input)[1]")).click();

        Assert.assertTrue(driver.findElement(By.xpath("(//div[@id='checkbox-example']//input)[1]")).isSelected());

        driver.findElement(By.xpath("(//div[@id='checkbox-example']//input)[1]")).click();

        Assert.assertFalse(driver.findElement(By.xpath("(//div[@id='checkbox-example']//input)[1]")).isSelected());

        List<WebElement> checkboxesList= driver.findElements(By.xpath("//div[@id='checkbox-example']//input"));
        System.out.println("Size: "+checkboxesList.size());

        driver.close();
    }
}
