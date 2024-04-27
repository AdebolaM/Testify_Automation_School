package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//Structure your TestNG file to run Naviagte to google and search for testify. 
//close the browser 
//Naviagate to https://www.mcdonalds.com/us/en-us.html . 
//print out the colour - code of the order now button. 
//All test should be done in one class and 
//utilize your knowldge of tesNG annotation)
public class Main {
    ChromeDriver driver = new ChromeDriver();
   @BeforeTest
    public void startup(){
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\livea\\OneDrive\\Documents\\Contacts\\Documents\\Testify_Automation_School\\Selenium\\Task\\Task7\\src\\main\\resources\\chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("https://www.toolsqa.com/");
    }
    @Test(priority = 1)
        public void googleSearchTest() {
            // Navigate to Google
            driver.get("https://www.google.com");
    
            // Perform Google search for "testify"
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("testify");
            searchBox.submit();
        }
    
    @Test(priority = 2)
        public void closeBrowserTest() {
            // Close the browser
            driver.quit();
        }
    
    @Test(priority = 3)
        public void mcdonaldsOrderNowButtonColorTest() {
            // Navigate to McDonald's website
            driver.get("https://www.mcdonalds.com/us/en-us.html");
    
            // Get the color code of the Order Now button
            WebElement orderNowButton = driver.findElement(By.id("button-ordernow"));
            String buttonColor = orderNowButton.getCssValue("background-color");
            System.out.println("Color code of the Order Now button: " + buttonColor);
        }
     @AfterTest
        public void completetest(){
            driver.close();
            System.out.println("test completed");
        }
    
        
    }

    