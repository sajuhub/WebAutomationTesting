package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.saucedemo.com");
	
	driver.findElement(By.id("user-name")).sendKeys("standard_user"); 
	driver.findElement(By.id("password")).sendKeys("secret_sauce"); 
	driver.findElement(By.id("login-button")).click(); 
	Thread.sleep(3000);
	
	driver.navigate().back();

	driver.findElement(By.id("user-name")).sendKeys("locked_out_user"); 
	driver.findElement(By.id("password")).sendKeys("secret_sauce"); 
	driver.findElement(By.id("login-button")).click(); 
	driver.navigate().forward();
	Thread.sleep(3000);
	
	driver.navigate().back();

	driver.findElement(By.id("user-name")).sendKeys("problem_user"); 
	driver.findElement(By.id("password")).sendKeys("secret_sauce"); 
	driver.findElement(By.id("login-button")).click(); 
	driver.navigate().forward();
	Thread.sleep(3000);
	
	driver.navigate().back();
	
	driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user"); 
	driver.findElement(By.id("password")).sendKeys("secret_sauce"); 
	driver.findElement(By.id("login-button")).click(); 
	driver.navigate().forward();
	Thread.sleep(3000);
	
	driver.navigate().back();
	
	driver.findElement(By.id("user-name")).sendKeys("error_user"); 
	driver.findElement(By.id("password")).sendKeys("secret_sauce"); 
	driver.findElement(By.id("login-button")).click(); 
	driver.navigate().forward();
	Thread.sleep(3000);
	
	driver.navigate().back();
	
	driver.findElement(By.id("user-name")).sendKeys("visual_user"); 
	driver.findElement(By.id("password")).sendKeys("secret_sauce"); 
	driver.findElement(By.id("login-button")).click(); 
	driver.navigate().forward();
  
	}

}