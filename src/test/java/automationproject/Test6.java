package automationproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test6 extends Base{
	@Test
	public void uploadDownload() {
		
		driver.navigate().to("https://demoqa.com/upload-download");
		
		WebElement download = driver.findElement(By.id("downloadButton"));
		download.click();
		
		WebElement uploadFile = driver.findElement(By.xpath("//input[@id='uploadFile']"));
		uploadFile.sendKeys("C:\\Users\\Shiyas\\Downloads\\Entri Agreement signed.pdf");
	}

}