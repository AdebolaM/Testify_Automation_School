//Navigate to https://jqueryui.com/ 
//click on the dialog menu from the left pane 
//click on the close icon to close the dialogue box in the middle    

package com.example;

import static java.lang.Thread.sleep;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\livea\\OneDrive\\Documents\\Contacts\\Documents\\Testify_Automation_School\\Selenium\\Task\\Task7\\src\\main\\resources\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/");
        sleep(1000);

        //click on dialog
        driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[2]/aside[2]/ul[1]/li[7]/a[1]")).click();
        
        //switch to iframe

        driver.switchTo().frame(driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]")));
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/button[1]/span[1]")).click();



    }
}