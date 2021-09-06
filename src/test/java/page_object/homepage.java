package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class homepage {
	WebDriver driver;
  @Test
  public void homepage(WebDriver driver) throws Exception{
	  this.driver = driver;
  }
  public void addhomepage() throws Exception{
	  findElement(By.id("welcome")).click();
	  findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a")).click();
	 
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
