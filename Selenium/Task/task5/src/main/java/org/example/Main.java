/*
Navigate to https://www.saucedemo.com/
Login using username and password.
Click on the login button,
click on the "add to cart" button of any product (Add only one item)
click the cart icon on the top right.
Click on checkout.  USE ONLY XPATH LOCATION STRATEGY
*/
package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\livea\\OneDrive\\Documents\\Contacts\\Documents\\Testify_Automation_School\\Selenium\\Task\\task5\\src\\main\\resources\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        sleep(2000);

        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();
        driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")).click();
        driver.findElement(By.xpath("//button[@id='checkout']")).click();
        driver.close();

    }
}