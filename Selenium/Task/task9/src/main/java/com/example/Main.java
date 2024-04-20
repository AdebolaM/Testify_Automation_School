package com.example;

import static java.lang.Thread.sleep;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\livea\\OneDrive\\Documents\\Contacts\\Documents\\Testify_Automation_School\\Selenium\\Task\\Task7\\src\\main\\resources\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        sleep(2000);
        
        //loginhttps://www.saucedemo.com/

        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("#login-button")).click();
        sleep(2000);

        //go back to login page 

        driver.navigate().back();
        sleep(1000);

        String loginpage = driver.findElement(By.cssSelector("#login-button")).getAttribute("value");
        System.out.println(loginpage);
        sleep(1000);

        //for forward
        driver.navigate().forward();
        sleep(1000);

        //print out the name of a product

        String product = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/div[1]")).getText();
        System.out.println(product);


    }
}