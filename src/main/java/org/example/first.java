package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first {
    public static void main(String[] args) throws InterruptedException {
     //invoking chrome browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\archi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());


        Thread.sleep(5000);
        driver.close();
    }
}
