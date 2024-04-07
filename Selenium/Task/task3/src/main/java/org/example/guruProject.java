package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class guruProject {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\livea\\OneDrive\\Documents\\Contacts\\Documents\\Testify_Automation_School\\Selenium\\Task\\task3\\src\\main\\resources\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/ ");
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//*[@id=\"save\"]/span[1]/div/span")).click();
        driver.findElement(By.linkText("Security Project")).click();
        driver.findElement(By.cssSelector("table:nth-child(2) tbody:nth-child(1) tr:nth-child(1) td:nth-child(2) > input:nth-child(1)")).sendKeys("ade@ade.com");

        driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("abdcge");
        //driver.close();
    }
}

