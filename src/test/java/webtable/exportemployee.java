package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import ExcelUtil.ExcelApiTest3;

public class exportemployee {
	WebDriver driver;
  @Test
  public void exportemployee(WebDriver driver) throws Exception{
	  this.driver = driver;
  }
  public void export_all_employees() throws Exception{
	  
	  //No. of columns
		 String Empcoloums=" //*[@id='resultTable']/thead/tr/th";
		 List<WebElement>  columns = driver.findElements(By.xpath(Empcoloums)); 
	      System.out.println("No of columns in WebTable : " + columns.size());

		//*[@id="resultTable"]/tbody/tr[1]/td[2]/a
		 
		 
     //No.of rows 
		 String EmpRows="//*[@id='resultTable']/tbody/tr/td[2]";
     List<WebElement>   rows = driver.findElements(By.xpath(EmpRows)); 
     System.out.println("No of rows in WebTable : " + rows.size());
     
     
     			ExcelApiTest3 eat = new ExcelApiTest3();
     			
      		    for ( int i=1 ; i<=rows.size() ;i++)  // i=1;  1<=40 ; i=i+1
				    {
				    	  for ( int j=2 ,k=0; j<=columns.size() ;j++,k++) //j=2 ; J<=8 ; j++
				    	   {
				      		   String str1="//*[@id='resultTable']/tbody/tr["  + i +  "]"  + "/td" + "[" + j +"]";
				      		   
				      	
				      		   
				      		   //*[@id="resultTable"]/tbody/tr[1]/td[2]
				      		   
				      		    //*[@id="resultTable"]/tbody/tr[1]/td[2]
				      		  WebElement Ele=driver.findElement(By.xpath(str1));
				    		    
				    		    Thread.sleep(50);
				    		   
				    	        String WebElementText = Ele.getText();
				    	       //System.out.println("Get Text Value is from the WebElement: " + valueIneed1);
				    	        
				    	        if (WebElementText !=null)
				    	        eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_EMPExport.xls","Sheet4",i,k,WebElementText);
				    	        else
				    	        eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_EMPExport.xls","Sheet4",i,k,"Blank Data");
				    	        	
				    	   }
				    }
      		    

	
	}
	
	
  }

