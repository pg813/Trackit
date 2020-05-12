package Login;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PO extends LoginLogOut {
	
	

	@BeforeClass
	public void init() throws InterruptedException {
		LoginLogOut.blunch();
        LoginLogOut.login();
        
	
	}

	@Test
	public void create_CR() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Purchase Order']")).click();
		
		 Thread.sleep(10000);
		  
			LoginLogOut.driver.switchTo().frame(LoginLogOut.driver.findElement(By.xpath("//iframe[@id='mainFrame0']")));
			LoginLogOut.driver.switchTo().frame(LoginLogOut.driver.findElement(By.xpath(" //frame[@id='30'] ")));
			
			LoginLogOut.driver.findElement(By.xpath("//img[@id='POPUPIMG_15']")).click();
			
			LoginLogOut.driver.switchTo().defaultContent();
			LoginLogOut.driver.findElement(By.xpath("//span[@id='popupGridDialog-save-btn-btnEl']")).click();
			
        
			LoginLogOut.driver.switchTo().frame(LoginLogOut.driver.findElement(By.xpath("//iframe[@id='mainFrame0']")));
			LoginLogOut.driver.switchTo().frame(LoginLogOut.driver.findElement(By.xpath(" //frame[@id='30'] ")));
			
			LoginLogOut.driver.findElement(By.xpath("//input[@title='Enter Purchase Order Number']")).sendKeys("1021");
			LoginLogOut.driver.findElement(By.xpath("//input[@title='Create/Update Purchase Order']")).click();
			
			LoginLogOut.driver.switchTo().defaultContent(); 
}
	@AfterClass
	
	public void logout1() throws InterruptedException {
		
		
		Thread.sleep(10000);
		LoginLogOut.logout();
	}
	
}