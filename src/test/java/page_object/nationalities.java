package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class nationalities {
	WebDriver driver;
  @Test
  public void nationalities(WebDriver driver) throws Exception{
	  this.driver = driver;
  }
  public void Addnationalities() throws Exception{
	  
	  findElement(By.xpath("//*[contains(text(),'Admin')]")).click();
	  findElement(By.xpath("//*[contains(text(),'Nationalities')]")).click();
	  findElement(By.id("btnAdd")).click();
	  findElement(By.id("nationality_name")).sendKeys("indian1234");
	  findElement(By.id("btnSave")).click();
	  
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
