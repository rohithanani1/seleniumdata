package return_single_value;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

public class multipleusingset {
  @Test
  public void myset() {
	  
	  Set<String> s1 = new HashSet<>();
	  s1=page1();
	  System.out.println(s1);
	
  }
  
  

private void page2(Set<String> s1) {
	// TODO Auto-generated method stub
	
}



private void page2(String String1,String String2,String String3) {
	
	   System.out.println(" Element data 0  :  " + String1);
	   System.out.println(" Element data 1  :  " + String2);
	   System.out.println(" Element data 2  :  " + String3);
}



public  void page2(List<String> page_li) {
	// TODO Auto-generated method stub
	
	System.out.println(page_li);
	
	for(String str5:page_li){  
		 System.out.println("The value is " +str5);  
		}  
	
	
	   System.out.println(" Element data 0  :  " + page_li.get(0));
	   System.out.println(" Element data 1  :  " + page_li.get(1));
	   System.out.println(" Element data 2  :  " + page_li.get(2));
	   

}
public Set<String> Page1()    {
	
	 Set<String> Page_list1 = new HashSet<String>();
   
   Page_list1.add("Order");
   Page_list1.add("11");
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

}
