package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Asset extends LoginLogOut{
	
	@BeforeTest
	public void init() throws InterruptedException {
		LoginLogOut.blunch();
        LoginLogOut.login();
        
	}
	
	@Test
       public void create_Asset() throws InterruptedException{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Asset']")).click();
		Thread.sleep(100000);
		
	LoginLogOut.driver.switchTo().frame(LoginLogOut.driver.findElement(By.xpath("//iframe[@id='mainFrame0']")));
	LoginLogOut.driver.switchTo().frame(LoginLogOut.driver.findElement(By.xpath(" //frame[@id='117'] ")));
	LoginLogOut.driver.findElement(By.xpath("//iframe[@id='mainFrame0']")).sendKeys("abc");	
	}

}
