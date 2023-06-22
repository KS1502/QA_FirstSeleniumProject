package com.phonebook.tests;

//package com.phonebook.tests;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HomePageTests extends TestBase {

        @Test
        public void openHomePageTest() {

            Assert.assertTrue(app.getHomePage().isHomeComponentPresent());
        }

    }
