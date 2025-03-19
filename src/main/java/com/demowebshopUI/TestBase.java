package com.demowebshopUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.NoSuchElementException;

import java.time.Duration;

public class TestBase {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    public boolean isElementPresent(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void click(By locator) {
        if (isElementPresent(locator)) {
            driver.findElement(locator).click();
        } else {
            System.out.println("Элемент не найден: " + locator);
        }
    }

    public void type(By locator, String text) {
        if (isElementPresent(locator)) {
            driver.findElement(locator).clear();
            driver.findElement(locator).sendKeys(text);
        } else {
            System.out.println("Can't enter text,element not found: " + locator);
        }
    }
}
