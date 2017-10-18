package conductor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
 
public class SeleniumTestClass {
 
 public static void main(String[] args) {
 
 /*declaration and instantiation of objects/variables*/
	 
	 System.setProperty("webdriver.gecko.driver", "C:\\java\\webdrivers\\geckodriver.exe");
	 System.setProperty("webdriver.chrome.driver", "C:\\java\\webdrivers\\chromedriver.exe");


 WebDriver driver = new ChromeDriver();
 String baseWebUrl = "http://preprod.intshop.com/";
 String expectedLoginPageTitle = "IntShop";
 
 
 /*Launch browser and browse the Base URL*/
 driver.get(baseWebUrl);
 driver.findElement(By.xpath("//a[@title='Login']")).click();;

 String actualLoginPageTitle = driver.getTitle(); 

 
 if (actualLoginPageTitle.contentEquals(expectedLoginPageTitle)){
 System.out.println("Test Passed!");
 } else {
 System.out.println("Test Failed!");
 }
 
 /*closing Browser*/
 driver.close();
 
 /*Exiting the System*/
 System.exit(0);
 }
}