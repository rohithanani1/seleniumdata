package page_object;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TC01_Add_Nationalities {
	WebDriver driver;

	@BeforeTest
	public void openbrowser() throws Exception {
		/*
		 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
		 * driver.manage().window().maximize();
		 */
		
		//driver = TestBrowser.OpenChromeBrowser();
		//System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	@Test
  public void page_object1() throws Exception {
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  loginpage l1 = new loginpage();
	 l1.loginpage(driver);
	  l1.login();
	  
	  
	  nationalities n1 = new nationalities();
	  n1.nationalities(driver);
	  n1.Addnationalities();
	  
	  homepage h1 = new homepage();
	  h1.homepage(driver);
	  h1.addhomepage();
  }
	@AfterTest 
	 public void logout() throws Exception {
  driver.close();
}
}