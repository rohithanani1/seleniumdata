package pagefactorymodel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class homepage {
	WebDriver driver;
  @Test
  public void homepage(WebDriver driver) throws Exception {
	  this.driver = driver;
	  PageFactory.initElements(driver,this);
  }
  @FindBy(name="txtUsername")
  WebElement UserName;  

  @FindBy(name="txtPassword")
  WebElement Password;  
  
  @FindBy(id="btnLogin")
  WebElement Button; 
  
  public void loginpage() throws Exception
  {
	  UserName.sendKeys("Admin");
	  Password.sendKeys("admin123");
	  Button.click();
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
