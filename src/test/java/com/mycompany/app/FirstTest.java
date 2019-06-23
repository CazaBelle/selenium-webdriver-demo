package com.mycompany.app;



import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;


public class FirstTest {

    @Test
    public void driverTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.keenonlanguages.com");
        assertTrue(driver.getTitle().startsWith("Keen On Languages"));
        driver.close();

    }

}