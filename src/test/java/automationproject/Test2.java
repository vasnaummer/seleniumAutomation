package automationproject;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 extends Base {
	
	@BeforeMethod
	public void clickElements() {
		driver.navigate().to("https://demoqa.com/elements");
	}
	
	@Test
	public void checkBox() {
	
		WebElement checkBoxCard=driver.findElement(By.xpath("(//span[@class='text'])[2]"));
		checkBoxCard.click();
		System.out.println("Clicked on Check Box card");

		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement clickCheckBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='rct-checkbox']")));
		clickCheckBox.click();
		System.out.println("clicked on check box");
		
		/*TakesScreenshot screenshot=(TakesScreenshot) driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		
		File savedestination = new File("ScreenshotCheckBox.png");
		
		try {
			 Files.copy(source.toPath(), savedestination.toPath());
		} catch (IOException e) {
			
			e.printStackTrace();//print Exception Details
		}*/
	}

}
