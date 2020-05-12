package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateTicket extends LoginLogOut {
	
	
	

	@BeforeClass
	public void init() throws InterruptedException {
		LoginLogOut.blunch();
        LoginLogOut.login();
        
	
	}
	@Test 
	public void create_ticket() throws InterruptedException {
		 Thread.sleep(10000);
		 driver.findElement(By.xpath("//span[text()='Ticket']")).click();
		 Thread.sleep(10000);
		  
		LoginLogOut.driver.switchTo().frame(LoginLogOut.driver.findElement(By.xpath("//iframe[@id='mainFrame0']")));
		LoginLogOut.driver.switchTo().frame(LoginLogOut.driver.findElement(By.xpath(" //frame[@id='66'] ")));
		LoginLogOut.driver.findElement(By.xpath("//input[@id='22']")).sendKeys("welcome bmc");
		 
	LoginLogOut.driver.findElement(By.xpath("//img[@title='Select category']")).click();
	//LoginLogOut.driver.findElement(By.xpath("//span[text()='Auto Category 3']")).click();
	LoginLogOut.driver.switchTo().defaultContent(); 
	LoginLogOut.driver.findElement(By.xpath("//span[@id='helpdesk-selectCategory-save-btn-btnInnerEl']")).click();

	
	LoginLogOut.driver.switchTo().frame(LoginLogOut.driver.findElement(By.xpath("//iframe[@id='mainFrame0']")));
	LoginLogOut.driver.switchTo().frame(LoginLogOut.driver.findElement(By.xpath(" //frame[@id='66'] ")));
	
	LoginLogOut.driver.findElement(By.xpath("//input[@id='TOOLBUTTON_Save']")).click();
		
	LoginLogOut.driver.switchTo().defaultContent(); 
		
		
		
	}

	
	@AfterClass
	
	public void logout1() throws InterruptedException {
		
		
		Thread.sleep(10000);
		LoginLogOut.logout();
	}
}
