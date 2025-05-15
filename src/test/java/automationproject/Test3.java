package automationproject;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test3 extends Base{
		
	@BeforeMethod
	public void clickOnElements() {
		driver.navigate().to("https://demoqa.com/elements");
	}
	@Test
	public void clickOnRadioButtonCard() {
		WebElement radioButtonCard= driver.findElement(By.xpath("//span[text()='Radio Button']"));
		radioButtonCard.click();
		
		System.out.println("Clicked on radio button card");
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement radioButtonImpressive=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='impressiveRadio']")));
		
		Actions a=new Actions(driver);
		a.moveToElement(radioButtonImpressive).click().perform();
		
		System.out.println("Clicked impressive button");
		
	}	
	}

