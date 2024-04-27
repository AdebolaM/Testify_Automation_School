import static java.lang.Thread.sleep;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class B2Bsignup {
    private WebDriver driver;
    @BeforeClass
    public void startup() throws InterruptedException{
        
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\livea\\OneDrive\\Documents\\Contacts\\Documents\\Testify_Automation_School\\Selenium\\Task\\Task7\\src\\main\\resources\\chromedriver.exe");
    
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("stage.guinnessworldrecords.com");
    sleep(1000);
    }
    //click on business page
    @Test(priority =1)
    public void validSubmission() throws InterruptedException{
        driver.findElement(By.xpath("//a[contains(text(),'BUSINESS SOLUTIONS')]")).click();
    //scroll down
    JavascriptExecutor scroll = (JavascriptExecutor)driver;
    scroll.executeAsyncScript("window.scrollBy 1800");

    //click on the newsletter signup

    driver.findElement(By.xpath("//h2[contains(text(),'Sign up to our B2B newsletter')]")).click();
     // Define a list of locators for the elements to verify
     List<By> formelements = new ArrayList<>();
     formelements.add(By.xpath("//body[1]/main[1]/div[1]
     /div[2]/div[2]/div[1]/div[1]/form[1]/section[1]/div[1]/div[1]/input[1]")); 
     formelements.add(By.xpath("//body[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/section[2]/div[1]/div[1]/input[1]")); // Change the XPath expression to match the element
     formelements.add(By.xpath("//body[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/section[3]/div[1]/div[1]/input[1]"));
     formelements.add(By.xpath("//body[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/section[4]/div[1]/div[1]/div[1]"));
     formelements.add(By.xpath("//body[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/section[4]/div[1]/div[1]/div[1]"));
     formelements.add(By.xpath("//body[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/section[5]/button[1]"));
     // Add more locators for additional elements as needed
     boolean allElementsDisplayed = areAllElementsDisplayed(driver, formelements);
         if (allElementsDisplayed) {
             System.out.println("All elements are displayed on the page.");
         } else {
             System.out.println("Not all elements are displayed on the page.");
         }
         
         //fillout the form

        fillOutForm("John", "Doe", "john.doe@ajoke.testinator.com", "United States");

        sleep(5000);

        // Submit the form
        submitForm();

        // Verify success message is displayed
        WebElement successMessage = driver.findElement(By.xpath("//body[1]/main[1]/div[1]/div[2]"));
        Assert.assertTrue(successMessage.isDisplayed(), "Success message is not displayed after form submission");
    }


    // verify all elements are displayed
    
    

    //method to check if elements are displayed 

    public static boolean areAllElementsDisplayed(WebDriver driver, List<By> locators) {
        for (By locator : locators) {
            WebElement element = driver.findElement(locator);
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }

    //fillout form method

    private void fillOutForm(String firstname, String lastname, String email, String country) {
        // Fill out the form with provided data
        WebElement firstnameField = driver.findElement(By.id("firstname"));
        WebElement lastnameField = driver.findElement(By.id("lastname"));
        WebElement emailField = driver.findElement(By.id("email"));
        WebElement countryField = driver.findElement(By.id("country"));

        firstnameField.sendKeys(firstname);
        lastnameField.sendKeys(lastname);
        emailField.sendKeys(email);
        countryField.sendKeys(country);
    }
    private void submitForm() {
        // Submit the form
        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        submitButton.click();
    }

    private boolean validateField(String fieldName, String fieldValue) {
        // Fill out a single field with provided data and verify if it's accepted without errors
        fillOutForm(fieldValue, "Doe", "john.doe@example.com", "United States");

        // Submit the form
        submitForm();

        // Check if error message is displayed for the field
        WebElement errorMessage = driver.findElement(By.xpath("//div[@class='error-message' and contains(text(), '" + fieldName + "')]"));
        return errorMessage.isDisplayed();
    }
}

