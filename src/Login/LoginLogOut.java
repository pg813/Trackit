package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginLogOut {
	
	WebDriver driver;
	
  @BeforeTest
  public void Lunchbrowser() {
	  
	 System.setProperty("webdriver.chrome.driver", "C:\\seleniumclass\\Drivers\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	driver.get("http://vw-pun-trt-qa02.dsl.bmc.com/trackit");
	 
}
  
  @Test
  public void login() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//input[@id='login-user-inputEl']")).sendKeys("AUTOSATECH4");
	  driver.findElement(By.xpath("//input[@id='login-password-inputEl']")).sendKeys("welcome");
	  
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//span[@id='login-button-btnInnerEl']")).click();
	  driver.findElement(By.xpath("//span[@id='login-button-btnInnerEl']")).click();
  }
  
  @AfterTest
  public void logout() throws InterruptedException {
	  Thread.sleep(10000);
	  driver.findElement(By.id("usersFirstName-btnWrap")).click();
	  
	 driver.findElement(By.id("logout-menuItem-itemEl")).click();
	
	 //a[@id='logout-menuItem-itemEl']

  }
  
  
}

