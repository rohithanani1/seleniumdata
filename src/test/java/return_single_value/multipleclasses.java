package return_single_value;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

public class multipleclasses {
	@Test
	public void test1() throws Exception {
		List<String> s1 = new ArrayList<String>();
		s1 = Page1();
		System.out.println(" Element data 0  :  " + s1.get(0));
		System.out.println(" Element data 1  :  " + s1.get(1));
		System.out.println(" Element data 2  :  " + s1.get(2));
		
		
		page2(s1);
	}

	
	private void page2(String String1,String String2,String String3)throws Exception {
		System.out.println(" Element data 0  :  " + String1);
		   System.out.println(" Element data 1  :  " + String2);
		   System.out.println(" Element data 2  :  " + String3);
		
	}
	private void page2(List<String> page_li) throws Exception{
		System.out.println(page_li);
		for(String str5:page_li){  
			 System.out.println("The value is " +str5);  
			}  
		
		
		   System.out.println(" Element data 0  :  " + page_li.get(0));
		   System.out.println(" Element data 1  :  " + page_li.get(1));
		   System.out.println(" Element data 2  :  " + page_li.get(2));
		
	}
public List<String> Page1()    {
		
	    List<String> Page_list1 = new ArrayList<String>();
	    
	    Page_list1.add("rohitha");
	    Page_list1.add("nani11");
	    Page_list1.add("Indian777");
	    Page_list1.add("Indian777");
	    
	    return Page_list1;
	   
	   }
public void printList(List<String> list){
    for(String elem : list){
        System.out.println(elem+"  ");
    }
}



public  void printList1(List<String> list)
{
for (int i=0; i<list.size(); i++)
    System.out.println(list.get(i));
}



	private Map<String, Integer> getHashMap() {

		// TODO Auto-generated method stub
		return null;
	}
}
