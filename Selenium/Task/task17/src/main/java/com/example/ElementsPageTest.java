package com.example;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;


public class ElementsPageTest {
    ChromeDriver driver = new ChromeDriver();
    @BeforeTest
     public void startup(){
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\livea\\OneDrive\\Documents\\Contacts\\Documents\\Testify_Automation_School\\Selenium\\Task\\task17\\src\\main\\resources\\chromedriver.exe");
     driver.manage().window().maximize();
     driver.get("https://www.toolsqa.com/");
 }
}
