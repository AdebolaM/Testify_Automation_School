package com.example;

import static java.lang.Thread.sleep;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

//Go to google. 
//search for "testify ltd" 
//Click on the search that result with www.testifyltd.com 
//sroll down the testify website and click on the linkedIn icon. 
//Get the description text on the userpage.(image; https://i.imgur.com/PmrWDXa.png ) 


public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\livea\\OneDrive\\Documents\\Contacts\\Documents\\Testify_Automation_School\\Selenium\\Task\\Task7\\src\\main\\resources\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        sleep(1000);
        //accept alert
        driver.switchTo().alert();

        driver.findElement(By.id("L2AGLb")).click();
        

        // google search

        driver.findElement(By.name("q")).sendKeys("testify ltd");
        driver.findElement(By.name("btnK")).click();
        //click on testify
        

        driver.findElement(By.xpath("//a[(@href,'https://testify.com')]")).click();

        //scrolldown

        JavascriptExecutor scrolling = (JavascriptExecutor)driver;
        scrolling.executeScript("window.scrollBy(0,1000)");

        //click on linkedin

        driver.findElement(By.xpath("//a[contains(@href,'linkedin.com')]")).click();

        //printout description

        String description = driver.findElement(By.xpath("//body/div[5]/div[3]/div[1]/div[2]/div[1]/div[2]/main[1]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/p[1]")).getText();
        System.out.println(description);



    }
}