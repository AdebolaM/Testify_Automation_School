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

        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("#login-button")).click();
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.cssSelector("div.page_wrapper div:nth-child(1) div.header_container div.primary_header div.shopping_cart_container:nth-child(3) > a.shopping_cart_link")).click();
        driver.findElement(By.cssSelector("#checkout")).click();
        driver.close();
    }
}