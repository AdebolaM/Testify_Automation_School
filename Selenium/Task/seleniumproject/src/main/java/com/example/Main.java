package com.example;

import static java.lang.Thread.sleep;

import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        // Stsrting up my browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\livea\\OneDrive\\Documents\\Contacts\\Documents\\Testify_Automation_School\\Selenium\\Task\\Task7\\src\\main\\resources\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //opening the first url
        driver.get("https://www.automationexercise.com/");
        sleep(5000);

        driver.findElement(By.linkText("Sign Up")).click(); // Assuming the "Sign Up" link is available
        // Fill in the account information
        driver.findElement(By.id("firstName")).sendKeys("John");
        driver.findElement(By.id("lastName")).sendKeys("Doe");
        // Fill in other fields, select radio buttons, and check checkboxes as needed
        // Submit the form
        driver.findElement(By.id("submit")).click(); // Assuming the submit button has id "submit"
        // Assert that account creation was successful
        WebElement successMessage = driver.findElement(By.className("success-message"));
        Assert.assertTrue(successMessage.isDisplayed(), "Account creation was not successful.");

        // Step 2: Purchase a Top from Women's Section
        driver.findElement(By.linkText("Products")).click(); // Assuming there is a link to the products section
        // Navigate to the women's section and select a top
        // Add the top to the cart
        // Assert that the item has been successfully added to the cart

        // Step 3: Proceed to Checkout
        driver.findElement(By.linkText("Cart")).click(); // Assuming there is a link to the cart section
        driver.findElement(By.linkText("Proceed to Checkout")).click(); // Assuming there is a button/link to proceed to checkout
    }

}