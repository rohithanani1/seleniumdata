package mypackage;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ExcelUtil.ExcelApiTest4;


public class fileupload_download {
	
 WebDriver driver;

	@DataProvider(name ="fileupload")
 public static  Object[][] Authentication1() throws Exception{
		
		ExcelApiTest4 eat= new ExcelApiTest4();
        Object[][] testObjArray = eat.getTableArray("C:\\HTML Report\\OrangeHRM6\\TC02_Photo.xlsx","Sheet1");
         System.out.println(testObjArray.length);
          return (testObjArray); 
	}

	@Test(dataProvider="fileupload")
	public void my_file(String username, String password, String id, String photopath) throws Exception 
	{

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	 driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		openarngeHrm(username, password);
		loginpage(id);
        photopathpage(photopath);
	}

	public void openarngeHrm(String username, String password) throws Exception {
		findElement(By.id("txtUsername")).sendKeys(username);
		findElement(By.id("txtPassword")).sendKeys(password);
		findElement(By.id("btnLogin")).click();

	}

	public void loginpage(String id) throws Exception {

		findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b")).click();
		findElement(By.id("menu_pim_viewEmployeeList")).click();
		findElement(By.id("empsearch_id")).sendKeys(id);
		findElement(By.id("searchBtn")).click();
		findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[2]/a")).click();
		
		
	 	 
	}

	public void photoupload() throws Exception{
		findElement(By.id("btnAddAttachment")).click();
		findElement(By.name("ufile")).sendKeys("C:\\HTML Report\\EMP_Photos\\image2.JPG");
		
		
	 	
	
	}
	public void photopathpage(String PhotoPath) throws Exception{
	StringSelection sel = new StringSelection(PhotoPath);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
	
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	Thread.sleep(2000);
	
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	Thread.sleep(2000);
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	
	findElement(By.id("btnSave")).click();
	
	Thread.sleep(2000);
	}
	
	public WebElement findElement(By by) throws Exception {
		WebElement elem = driver.findElement(by);

		// draw a border around the found element
		if (driver instanceof JavascriptExecutor) {
			((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		}
		Thread.sleep(10);

		return elem;
	}

}
