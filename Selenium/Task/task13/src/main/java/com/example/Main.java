package com.example;

import static java.lang.Thread.sleep;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\livea\\OneDrive\\Documents\\Contacts\\Documents\\Testify_Automation_School\\Selenium\\Task\\Task7\\src\\main\\resources\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium08.blogspot.com/ ");
        sleep(5000);

        WebElement searchkey = driver.findElement(By.xpath("//div[contains(text(),'Search')]"));
        //WebElement searchbox = driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]"));
        Actions button = new Actions(driver);
        
        button.click(searchkey).sendKeys("Demo dropdown").sendKeys(Keys.ENTER).build().perform();
        WebElement dropdownlink = driver.findElement(By.xpath("//a[contains(text(),'Demo Dropdown List')]"));
        dropdownlink.click();
        WebElement countryselect = driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/select[1]"));
        WebElement monthselect = driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/select[1]"));

        Select select = new Select(countryselect); 
        select.selectByVisibleText("Nigeria");
        Select anotherslect =new Select(monthselect);
    
        anotherslect.selectByIndex(1);
        anotherslect.selectByIndex(2);
        anotherslect.selectByIndex(3);


        



    }
}