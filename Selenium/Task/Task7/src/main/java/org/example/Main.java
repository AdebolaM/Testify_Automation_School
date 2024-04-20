//Navigate to https://worldweather.wmo.int/en/home.html. 
//Search for your city in the search field. When the result loads, 
//print the days and weather description for each of the days shown in a readable and understandable manner.


package org.example;

import static java.lang.Thread.sleep;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\livea\\OneDrive\\Documents\\Contacts\\Documents\\Testify_Automation_School\\Selenium\\Task\\Task7\\src\\main\\resources\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://worldweather.wmo.int/en/home.html");
        sleep(1000);

        driver.findElement(By.xpath("//input[@id='q_search']")).sendKeys("London");
        driver.findElement(By.name("submit")).click();

        // Wait for the search results to load
       sleep(1000);
       

        List<WebElement> dayElements = driver.findElements(By.className("city_fc_date"));
        List<WebElement> descriptionElements = driver.findElements(By.className("city_fc_desc"));
        
        for (int i = 0; i < dayElements.size(); i++) {
           String day = dayElements.get(i).getText();
           String description = descriptionElements.get(i).getText();
           System.out.println("Day: " + day + ", Weather: " + description);
        }

    }
}