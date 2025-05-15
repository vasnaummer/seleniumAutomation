package automationproject;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Test4 extends Base{
	
	@Test
	public void clickOnAlerts() {
		driver.navigate().to("https://demoqa.com/alertsWindows");
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement alertCard=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Alerts']")));
		alertCard.click();
		System.out.println("clicked");
		
		WebElement simpleAlert=driver.findElement(By.id("alertButton"));
		simpleAlert.click();
		driver.switchTo().alert().accept();
		System.out.println("clicked");
		
		 WebElement confirmAlert = driver.findElement(By.id("confirmButton"));
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", confirmAlert);
		 wait.until(ExpectedConditions.elementToBeClickable(confirmAlert)).click();
		 System.out.println("Clicked confirm alert button");
		 
		 Alert alert = driver.switchTo().alert();
		 alert.accept();
		
	}

}
