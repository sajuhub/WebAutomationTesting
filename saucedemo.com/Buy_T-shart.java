package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.saucedemo.com");
	
	//Login
	driver.findElement(By.id("user-name")).sendKeys("standard_user"); 
	Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	Thread.sleep(2000);
	driver.findElement(By.id("login-button")).click(); 
	Thread.sleep(2000);
	
	//Add TO Cart
	driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[6]/div[2]/div[2]/button")).click();
	Thread.sleep(2000);
	//Cart Button
	driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
	Thread.sleep(2000);
	//Check Out
	driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/button[2]")).click();
	Thread.sleep(2000);
	
	//Check Out Details
	driver.findElement(By.id("first-name")).sendKeys("Md Saju Islam"); 
	Thread.sleep(2000);
	driver.findElement(By.id("last-name")).sendKeys("Nirob"); 
	Thread.sleep(2000);
	driver.findElement(By.id("postal-code")).sendKeys("5100");
	Thread.sleep(2000);
	
	//Continue Button
	driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[2]/input")).click();
	Thread.sleep(2000);
	
	//Finish 
	driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
	
	
	}

}