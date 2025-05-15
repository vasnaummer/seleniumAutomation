package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SauceDemo {
		WebDriver driver;
		
		@Test
		public void loginWithValidCredentials() {
			
			driver= new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			
			WebElement userName=driver.findElement(By.id("user-name"));
			userName.sendKeys("standard_user");
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("secret_sauce");
			
			WebElement login=driver.findElement(By.id("login-button"));
			login.click();
		}

}
