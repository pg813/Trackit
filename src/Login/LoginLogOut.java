package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LoginLogOut {
	
 public static WebDriver driver;

 
    public static void blunch(){

		 System.setProperty("webdriver.chrome.driver", "C:\\seleniumclass\\Drivers\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://vw-pun-trt-qa02.dsl.bmc.com/trackit");
    }
    

    public static void login() throws InterruptedException {
	driver.findElement(By.xpath("//input[@id='login-user-inputEl']")).sendKeys("AUTOSATECH4");
	driver.findElement(By.xpath("//input[@id='login-password-inputEl']")).sendKeys("welcome");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//span[@id='login-button-btnInnerEl']")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//span[@id='login-button-btnInnerEl']")).click();
	  Thread.sleep(10000);
	  driver.findElement(By.xpath("//a[@id='ti-add-new-button']")).click();
	 // driver.findElement(By.xpath("//span[text()='Ticket']")).click();
	  
	/*  Thread.sleep(10000);
	  
	  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mainFrame0']")));
	  driver.switchTo().frame(driver.findElement(By.xpath(" //frame[@id='66'] ")));
	  driver.findElement(By.xpath("//input[@id='22']")).sendKeys("welcome bmc");
	  
	  */
	 
  }

  public static void logout() throws InterruptedException {
	  Thread.sleep(10000);
	  driver.findElement(By.xpath("//span[@id='usersFirstName-btnWrap']")).click();
	  
	 driver.findElement(By.id("logout-menuItem-itemEl")).click();
	
	/* //a[@id='logout-menuItem-itemEl']    //span[text()='ADD NEW']
	 //hello bmc software, how  are u?
	  * 
	  * 
	  * @Test
	public void start() throws InterruptedException {
	LoginLogOut l=new LoginLogOut();
	l.Lunchbrowser();
	l.login();
	
	}
*/
  }
  
  
}

