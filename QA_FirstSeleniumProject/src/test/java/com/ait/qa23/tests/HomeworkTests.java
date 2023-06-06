package com.ait.qa23.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeworkTests {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test
    public void findElementsByCssTest() {

        driver.findElement(By.cssSelector("#flyout-cart"));

        driver.findElement(By.cssSelector(".header"));

        driver.findElement(By.cssSelector("[type='submit']"));

        driver.findElement(By.cssSelector("#dialog-notifications-success"));

        driver.findElement(By.cssSelector("#ui-id-1"));

        driver.findElement(By.cssSelector("[href*='/cart']"));

        driver.findElement(By.cssSelector("[href*='/gift-cards']"));

        driver.findElement(By.cssSelector("#dialog-notifications-error"));

        driver.findElement(By.cssSelector("#bar-notification"));

        driver.findElement(By.cssSelector("[href*='/computers']"));

    }

    @Test
    public void findElementByXpathTest() {

        driver.findElement(By.xpath("//*[@id='flyout-cart']"));

        driver.findElement(By.xpath("//*[@id='dialog-notifications-success']"));

        driver.findElement(By.xpath("//*[contains(text(),'Information')]"));

        driver.findElement(By.xpath("//*[contains(text(),'Copyright © 2023 Tricentis Demo Web Shop. All righ')]"));

        driver.findElement(By.xpath("//*[@id='dialog-notifications-success']"));

        driver.findElement(By.xpath("//*[@id='ui-id-1']"));

        driver.findElement(By.xpath("//*[@id='dialog-notifications-error']"));

        driver.findElement(By.xpath("//*[@id='bar-notification']"));

        driver.findElement(By.xpath("//*[@class='header']"));

        driver.findElement(By.xpath("//*[@id='bar-notification']"));


    }
}