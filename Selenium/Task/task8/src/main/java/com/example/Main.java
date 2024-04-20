//Navigate to https://idorenyinankoh.github.io/loginPage/ 
//check if the " create account" button is enabled" 
//fill all the fields 
//check if the "create account"is enabled  
package com.example;

import static java.lang.Thread.sleep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
   
        @SuppressWarnings("unused")
        public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\livea\\OneDrive\\Documents\\Contacts\\Documents\\Testify_Automation_School\\Selenium\\Task\\Task7\\src\\main\\resources\\chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://idorenyinankoh.github.io/loginPage/");
            sleep(1000);
            WebElement createbutton = driver.findElement(By.cssSelector("#create"));
            //confimr button is enabled 
            boolean enabledbutton = createbutton.isEnabled();

            if (enabledbutton = false) {
                System.out.println("button is enabled");
            } else {
                System.out.println("button is disabled");
            }
           
            sleep(2000);

            //filling the fields

            driver.findElement(By.cssSelector("#firstName")).sendKeys("Adebola");
            driver.findElement(By.cssSelector("#lastName")).sendKeys("Oritu");
            driver.findElement(By.cssSelector("#email")).sendKeys("Adebola.oritu@abc.com");
            driver.findElement(By.cssSelector("#female")).click();
            driver.findElement(By.cssSelector("#password")).sendKeys("abcds");
            driver.findElement(By.cssSelector("#confirmPass")).sendKeys("abcds");
            driver.findElement(By.cssSelector("#xpLevel")).sendKeys("I am automating");

        

            if (enabledbutton = true) {
                System.out.println("button is enabled");
            } else {
                System.out.println("button is disabled");
            }
           

    }
}
