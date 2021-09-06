//import MercuryDemoTours;
import ExcelUtil.ExcelApiTest3;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.*;

/*
1. Open Chrome browser
2. open Orange Application urL
3. login
4. Navigate to employee screen
5. Export Employees to Excel sheet
5. logout and Quit
*/
 
public class ExportEmployees
{
	public String UserName,Password;

	
	
	public  int iRow;
	
	WebDriver driver;


	public void ExportEmployees(WebDriver driver )throws Exception
	{  
		this.driver=driver;
		
	}
	
	// Draws a red border around the found element. Does not set it back anyhow.
		public WebElement findElement(By by)throws Exception {
		    WebElement elem = driver.findElement(by);
		 
		    // draw a border around the found element
		    if (driver instanceof JavascriptExecutor) {
		        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		    } 
		    Thread.sleep(10);
		    
		    return elem;
		}
		
		
	
	
	
	@Test
	public  void ExportAllEmployees( )throws Exception
	{  
		

	    //driver=TestBrowser.OpenChromeBrowser();
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		
		call_allmethods(1);
				
				 
	}
	
				 
				 
				 public void call_allmethods(int iRow )throws Exception
					{  
			
					 
					String str=String.valueOf(iRow);
					
					login l1=new login();
						l1.login(driver);
						l1.openorangehrm();
						l1.loginorangehrm("Admin","admin123");
						
						
						
						 Actions actions = new Actions(driver);
						 WebElement ele=findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b"));
				         actions.moveToElement(ele).click().perform();
						 
						 findElement(By.xpath("//*[@id=\"menu_pim_viewEmployeeList\"]")).click();
						 findElement(By.xpath("//*[@id=\"searchBtn\"]")).click();
					
						 exportemployee Ae=new  exportemployee();		
						 Ae.exportemployee(driver);
						 Ae.export_all_employees();
						 System.gc();
						
						
					}
					
				 
}
					
		





















						
						


	