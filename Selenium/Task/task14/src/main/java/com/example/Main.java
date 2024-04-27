package com.example;

import static java.lang.Thread.sleep;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

//Navigate to https://www.toolsqa.com/ 
//close the dialogue box that pops up after a few seconds 
//Click on the tutorial button on the top left corner of the page
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\livea\\OneDrive\\Documents\\Contacts\\Documents\\Testify_Automation_School\\Selenium\\Task\\Task7\\src\\main\\resources\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.toolsqa.com/");
        
        WebDriverWait wait = new WebDriverWait(driver, 3); 
       
        driver.findElement(By.xpath("#accept-cookie-policy")).click();

        WebElement tutorialButton = driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[4]/a[1]"));
        tutorialButton.click();


        sleep(5000);
    }
}