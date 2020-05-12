package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Solution extends LoginLogOut{
	

	@BeforeClass
	public void init() throws InterruptedException {
		LoginLogOut.blunch();
        LoginLogOut.login();
        
	
	}


	@Test
	public void create_sol() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Solution']")).click();
		
		 Thread.sleep(10000);
		  
			LoginLogOut.driver.switchTo().frame(LoginLogOut.driver.findElement(By.xpath("//iframe[@id='mainFrame0']")));
			LoginLogOut.driver.switchTo().frame(LoginLogOut.driver.findElement(By.xpath(" //frame[@id='52'] ")));
		
			LoginLogOut.driver.findElement(By.id("5")).sendKeys("welcome bmc");
			
			LoginLogOut.driver.findElement(By.xpath("//img[@title='Select topic']")).click();
			
			LoginLogOut.driver.switchTo().defaultContent();
			LoginLogOut.driver.findElement(By.xpath("//span[@id='popupGridDialog-save-btn-btnEl']")).click();

			
			LoginLogOut.driver.switchTo().frame(LoginLogOut.driver.findElement(By.xpath("//iframe[@id='mainFrame0']")));
			LoginLogOut.driver.switchTo().frame(LoginLogOut.driver.findElement(By.xpath(" //frame[@id='52'] ")));
			
		
				
			//reach text box
		WebElement richtext= LoginLogOut.driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, 6']"));
		LoginLogOut.driver.switchTo().frame(richtext);
			
	//		LoginLogOut.driver.switchTo().frame(LoginLogOut.driver.findElement(By.xpath("//*[contains(@class,'cke_contents cke_reset')]/iframe")));
			LoginLogOut.driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("welcome to bmc software");

			
			LoginLogOut.driver.switchTo().defaultContent();    //move to main window
			LoginLogOut.driver.switchTo().frame(LoginLogOut.driver.findElement(By.xpath("//iframe[@id='mainFrame0']")));
			LoginLogOut.driver.switchTo().frame(LoginLogOut.driver.findElement(By.xpath(" //frame[@id='52'] ")));
			
			
			LoginLogOut.driver.findElement(By.xpath("//input[@id='TOOLBUTTON_Save']")).click();
			
			LoginLogOut.driver.switchTo().defaultContent(); 
	}

	
	@AfterClass
	
	public void logout1() throws InterruptedException {
		
		
		Thread.sleep(10000);
		LoginLogOut.logout();
	}
	
	
}



