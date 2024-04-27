package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Main {
    ChromeDriver driver = new ChromeDriver();
   @BeforeTest
    public void startup(){
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\livea\\OneDrive\\Documents\\Contacts\\Documents\\Testify_Automation_School\\Selenium\\Task\\Task7\\src\\main\\resources\\chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("https://www.toolsqa.com/");
    }
    @Test
    public void verifyContactDetails() {
        // Get the contact details from the footer
        WebElement emailElement = driver.findElement(By.xpath("//div[@class='footer']//li[contains(text(), 'EMAIL')]"));
        WebElement locationElement = driver.findElement(By.xpath("//div[@class='footer']//li[contains(text(), 'LOCATION')]"));
        WebElement phoneElement = driver.findElement(By.xpath("//div[@class='footer']//li[contains(text(), 'PHONE')]"));

        SoftAssert verify = SoftAssert();

        // Assert that the contact details are correct
        verify.assertTrue(emailElement.getText().contains("EMAIL: info@testifyltd.co.uk"), "Incorrect email");
        verify.assertTrue(locationElement.getText().contains("LOCATION: Nigeria"), "Incorrect location");
        verify.assertTrue(phoneElement.getText().contains("PHONE: (+234)904-882-0971"), "Incorrect phone number");
        verify.assertAll();
    }
    private SoftAssert SoftAssert() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'SoftAssert'");
    }
   
}