package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class login {
	WebDriver driver;
  @Test
  public void login(WebDriver driver) throws Exception {
	  this.driver = driver;
  }
  public void openorangehrm() throws Exception {
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	  
}
  public void loginorangehrm(String username,String password) throws Exception {
	  findElement(By.id("txtUsername")).sendKeys(username);
	  findElement(By.id("txtPassword")).sendKeys(password);
	  findElement(By.id("btnLogin")).click();
	  
  }
  
  public  WebElement findElement(By by) throws Exception {
		
	    WebElement elem = driver.findElement(by);
	    	    
	    // draw a border around the found element
	    if (driver instanceof JavascriptExecutor) {
	        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	        
	  //  TH3.HTMLScreenShot("Screen Shot","Click Here","Pass", HtmlOutputFileName,driver);
	        
	    }
	    return elem;
	}
}
