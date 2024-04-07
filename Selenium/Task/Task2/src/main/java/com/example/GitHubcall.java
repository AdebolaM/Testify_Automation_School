package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHubcall {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\livea\\OneDrive\\Documents\\Contacts\\Documents\\Testify_Automation_School\\Selenium\\Task\\separatecalls\\src\\main\\resources\\chromedriver.exe");

        // Initialize a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.github.com/");
    }
}
