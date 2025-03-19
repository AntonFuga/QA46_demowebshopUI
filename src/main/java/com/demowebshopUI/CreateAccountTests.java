package com.demowebshopUI;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test(enabled = false)
    public void newTestUserRegistrationPositive() {
        click(By.cssSelector("[href='/login']"));

        type(By.name("email"), "antonfuga1991@gmail.com");
        type(By.name("password"), "Anton0807!$");

        click(By.name("registration"));

        Assert.assertTrue(isElementPresent(By.xpath("//button[.='Sign Out']")), "Sign Out кнопка не найдена!");
    }
}
