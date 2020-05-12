package Login;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CR extends LoginLogOut{
	
	

	@BeforeClass
	public void init() throws InterruptedException {
		LoginLogOut.blunch();
        LoginLogOut.login();
        
	
	}

	@Test
	public void create_CR() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Change Request']")).click();
		
		 Thread.sleep(10000);
		  
			LoginLogOut.driver.switchTo().frame(LoginLogOut.driver.findElement(By.xpath("//iframe[@id='mainFrame0']")));
			LoginLogOut.driver.switchTo().frame(LoginLogOut.driver.findElement(By.xpath(" //frame[@id='56'] ")));
			
			
			LoginLogOut.driver.findElement(By.xpath("//input[@title='Change Summary']")).sendKeys("CR 1");
	        LoginLogOut.driver.findElement(By.xpath("//img[@id='POPUPIMG_22']")).click();
	        
            LoginLogOut.driver.switchTo().defaultContent();  //move to default page
	          
	        LoginLogOut.driver.findElement(By.xpath("//span[@id='popupGridDialog-save-btn-btnEl']")).click();
	        
	        LoginLogOut.driver.switchTo().frame(LoginLogOut.driver.findElement(By.xpath("//iframe[@id='mainFrame0']")));
			LoginLogOut.driver.switchTo().frame(LoginLogOut.driver.findElement(By.xpath(" //frame[@id='56'] ")));
			  
           
			LoginLogOut.driver.findElement(By.xpath("//input[@title='Save Change Request']")).click();
	
			LoginLogOut.driver.switchTo().defaultContent(); 
}
	
	
	
	@AfterClass
	
	public void logout1() throws InterruptedException {
		
		
		Thread.sleep(10000);
		LoginLogOut.logout();
	}
}
