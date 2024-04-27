import static java.lang.Thread.sleep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragnresize {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\livea\\OneDrive\\Documents\\Contacts\\Documents\\Testify_Automation_School\\Selenium\\Task\\Task7\\src\\main\\resources\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/resizable/");
        sleep(1000);
        driver.switchTo().frame(0);
        WebElement drag = driver.findElement(By.xpath("//body/div[@id='resizable']/div[1]"));
        Actions mouse = new Actions(driver);
        mouse.clickAndHold(drag).moveByOffset(234,143).build().perform();
    }
}
