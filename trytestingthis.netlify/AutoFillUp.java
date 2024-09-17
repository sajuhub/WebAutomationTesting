package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestT {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://trytestingthis.netlify.app/");
		
		
		//Auto Scroll.......
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	        boolean continueScrolling = true;
	        long lastHeight = (long) js.executeScript("return document.body.scrollHeight");

	        while (continueScrolling) {
	            js.executeScript("window.scrollBy(0, window.innerHeight)");

	            try {
	                WebElement timeDropdown = driver.findElement(By.id("time"));
	                js.executeScript("arguments[0].scrollIntoView(true);", timeDropdown);
	                timeDropdown.sendKeys("11:00");
	                
	            } catch (Exception e) {
	                e.printStackTrace();
	            }

	            try {
	                Thread.sleep(2000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	            long newHeight = (long) js.executeScript("return document.body.scrollHeight");
	            if (newHeight == lastHeight) {
	                continueScrolling = false;
	            }
	            lastHeight = newHeight;
	        }
	        
	        
		
		//FirstName&LastName
		driver.findElement(By.id("fname")).sendKeys("Md Saju Islam"); 
		Thread.sleep(1000);
		driver.findElement(By.id("lname")).sendKeys("Nirob"); 
		Thread.sleep(1000);
		
		//RadioButton
		WebElement radiobutton= driver.findElement(By.id("male"));
		radiobutton.click();
		Thread.sleep(1000);
		
		//verify
		assert radiobutton.isSelected();
		System.out.println(radiobutton.isSelected());
		Thread.sleep(1000);
		
		//dropdown1
		WebElement testdropdown=driver.findElement(By.id("option"));
		Select dropdown = new Select(testdropdown);
		dropdown.selectByIndex(1);
		Thread.sleep(1000);
		
		//dropdown2
		WebElement testdropdown2=driver.findElement(By.id("owc"));
		Select dropdown2= new Select(testdropdown2);
		dropdown2.selectByIndex(2);
		Thread.sleep(1000);
		
		//Checklist
		WebElement checklist1 = driver.findElement(By.name("option3"));
		checklist1.click();
		assert checklist1.isSelected();
		Thread.sleep(1000);

		//message
		 WebElement messageField = driver.findElement(By.name("message"));

		 messageField.clear();

	     // Input a new message
	     String newMessage = ("Seeking vibrant, innovative company for QA engineer role.");
	     messageField.sendKeys(newMessage);

	     //print the length of the input to verify
	     System.out.println("New message length: " + newMessage.length());
	 
		
	}

}
