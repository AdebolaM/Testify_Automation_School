package com.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KongaCall {
    public static void main(String[] args) {
        // Set the system property for ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\livea\\OneDrive\\Documents\\Contacts\\Documents\\Testify_Automation_School\\Selenium\\Task\\separatecalls\\src\\main\\resources\\chromedriver.exe");

        // Initialize a WebDriver instance
        WebDriver driver = new ChromeDriver();

        // Navigate to the Guinness World Records website
        driver.get("https://www.Konga.com/");
    }
}

