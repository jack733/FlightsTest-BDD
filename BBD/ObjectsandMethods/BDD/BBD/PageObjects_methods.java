package BDD.BBD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageObjects_methods {

    public static WebDriver driver;

    
 // Browser Properties
  
    public static void StartBrowserProprties() {
    	System.setProperty("webdriver.gecko.driver","C:\\Xiaomi\\geckodriver-v0.27.0-win64/geckodriver.exe");
    	driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.get("https://www.ixigo.com/flights");    
    	}
    
 //Search Flight
    public static void search() throws InterruptedException {
    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
 driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[6]/div/div/div[1]/div/div[1]/input")).sendKeys("New Delhi");
 driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[6]/div/div/div[1]/div/div[1]/input")).sendKeys(Keys.ENTER); 

Thread.sleep(5000);

driver.findElement(By.xpath("//div[@class='dstn u-ib u-v-align-bottom u-text-left']//input[@placeholder='Enter city or airport']")).sendKeys("Hyderabad");

Thread.sleep(5000);
driver.findElement(By.xpath("//div[@class='dstn u-ib u-v-align-bottom u-text-left']//input[@placeholder='Enter city or airport']")).sendKeys(Keys.ENTER); 
    	
driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
    }

    public static void sortthefares() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

driver.findElement(By.xpath("//i[@class='ixi-icon-caret u-ib c-dropdown-caret sorting-caret c-dropdown-caret-up']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath(" //li[contains(@class,'dropdown-list-item')]//span[contains(text(),'CHEAPEST')]")).click();
    	
    	
    }
    
    
    
    // Quit Driver
    public static void Quit(){
    	driver.quit();  
    }

    
}
