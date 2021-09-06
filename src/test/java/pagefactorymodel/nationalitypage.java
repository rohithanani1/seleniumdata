package pagefactorymodel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class nationalitypage {
	WebDriver driver;

	@Test
	public void nationalitypage(WebDriver driver) throws Exception {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "menu_admin_viewAdminModule")
	WebElement Admin;

	@FindBy(id = "menu_admin_nationality")
	WebElement nationality;

	@FindBy(id = "btnAdd")
	WebElement button;

	@FindBy(id = "nationality_name")
	WebElement nationalityname;

	@FindBy(id = "btnSave")
	WebElement buttonsave;

	
	public void addnationalitypage() throws Exception {
		Admin.click();
		nationality.click();
		button.click();
		nationalityname.sendKeys("indian89");
		buttonsave.click();
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
