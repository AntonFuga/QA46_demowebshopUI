package com.demowebshopUI;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test
    public void newTestUserRegistrationPositive() {

            click(By.cssSelector("[href='/register']"));

            type(By.name("email"), "antonfuga19911@gmail.com");

            type(By.name("password"), "Anton08017!$");
            //click on Registration
            click(By.name("registration"));

            //verify SingOut button is displayed
            Assert.assertTrue(isElementPresent(By.xpath("//button[.='Sign Out']")));

        }
    }

