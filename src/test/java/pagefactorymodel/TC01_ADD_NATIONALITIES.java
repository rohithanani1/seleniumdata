package pagefactorymodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC01_ADD_NATIONALITIES {
	
	
	WebDriver driver;
	
	@BeforeTest
	 public void openchrome() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
	}
	
  @Test
  public void mytest()throws Exception {
	  
	  homepage h1 = new homepage();
	  h1.homepage(driver);
	  h1.loginpage();
	  
	  
	  nationalitypage n1 = new nationalitypage();
	  n1.nationalitypage(driver);
	  n1.addnationalitypage();
	  
	  logoutpage l1 = new logoutpage();
	  l1.logoutpage(driver);
	  l1.mylogoutpage();
	  
  }
  
  @AfterTest
  public void close()throws Exception {
	  driver.close();
  }
}








