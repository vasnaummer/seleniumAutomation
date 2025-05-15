package automationproject;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 extends Base {

    @BeforeMethod
    public void browserUrl() {
        driver.navigate().to("https://demoqa.com/");
    }
    @Test
    public void firstTest() {
    	WebElement elements=driver.findElement(By.xpath("(//div[@class='card-up'])[1]"));
		elements.click();
		System.out.println("Clicked on Elements");
		
		WebElement elementCard = driver.findElement(By.xpath("(//div[@class='header-text'])[1]"));
		elementCard.click();
		System.out.println("Clicked on Element Card");
    	
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		WebElement textBoxClick=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='header-text'])[1]")));
		
		Actions action=new Actions(driver);
		action.moveToElement(textBoxClick).perform();
		System.out.println("Clicked on Text Box ");
		
	}
    @Test
    public void passingValuesToTextBox() {
		
    	driver.navigate().to("https://demoqa.com/text-box");
    	WebDriverWait wait2= new WebDriverWait(driver, Duration.ofSeconds(10));
    	
    	driver.findElement(By.xpath("//input[@id='userName']"));
		
		WebElement fullName = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("userName")));
		fullName.sendKeys("Vasna Ummer");
		
		WebElement eMail=driver.findElement(By.xpath("//input[@type='email']"));
		eMail.sendKeys("vasnashiyas@email.com");
		
		WebElement currentAddress= driver.findElement(By.id("currentAddress"));
	    currentAddress.sendKeys("Chakkolayil House, Mannarkkad, Palakkad");
	    
	    WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
	    permanentAddress.sendKeys("Chakkolayil House, Mannarkkad, Palakkad");
	    
	    WebElement submitButton= driver.findElement(By.xpath("//button[@id='submit']"));
		submitButton.submit();
		System.out.println("Clicked Submit");
    }
}