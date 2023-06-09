package com.ait.qa23.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.List;

public class TableTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/css/css_table.asp");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test
    public void tableTest() {

        List<WebElement> elements = driver.findElements(By.cssSelector("table"));
        System.out.println(elements.size());


        WebElement element = driver.findElement(By.cssSelector("tr:nth-child(7) td:nth-child(3)"));
        System.out.println(element.getText());
    }
}
