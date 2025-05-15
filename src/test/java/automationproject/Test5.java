package automationproject;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Test5 extends Base{
	@Test
	public void negativeTestInTextBox() {
		
		driver.navigate().to("https://demoqa.com/text-box");
    	WebDriverWait wait2= new WebDriverWait(driver, Duration.ofSeconds(10));
    	
    	driver.findElement(By.xpath("//input[@id='userName']"));
		
		WebElement fullName = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("userName")));
		fullName.sendKeys("   ");
		
		WebElement eMail=driver.findElement(By.xpath("//input[@type='email']"));
		eMail.sendKeys("0*%^&4");
		
		WebElement currentAddress= driver.findElement(By.id("currentAddress"));
	    currentAddress.sendKeys("    ");
	    
	    WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
	    permanentAddress.sendKeys("    ");
	    
	    WebElement submitButton= driver.findElement(By.xpath("//button[@id='submit']"));
		submitButton.submit();
		System.out.println("Clicked Submit");
		
	}		
}