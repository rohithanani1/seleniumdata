package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class loginpage {
	WebDriver driver;
  @Test
  public void loginpage(WebDriver driver) throws Exception{
	  this.driver = driver;
  }
  public void login() throws Exception{
	  
	  findElement(By.id("txtUsername")).sendKeys("Admin");
	  findElement(By.id("txtPassword")).sendKeys("admin123");
	  findElement(By.id("btnLogin")).click();
	  
  }
  public   WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		return elem;
	}
}
