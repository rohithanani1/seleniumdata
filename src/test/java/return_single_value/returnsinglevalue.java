package return_single_value;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class returnsinglevalue {
	
  @Test
  public void myvalues() {
	  returnsinglevalue rs = new returnsinglevalue();
	  String str = rs.addstring("HELLO");
	  System.out.println("the string is" +str);
	  
	  int i = rs.addnum(2000,5600);
	  System.out.println("addition of two numbers" +i);
	  System.out.println("___****Sum ****_____" );
	  
	  int s = rs.subract(2000,5600);
	  System.out.println("supraction of two numbers" +s);
	  
	  int m = rs.multifly(2000,5600);
	  System.out.println("multification of two numbers" +m);
	  System.out.println("___****Mul ****_____" );
  }

public int multifly(int a, int b) {
	int m = a*b;
	
	return m;
}

public int subract(int a, int b) {
	int s = a-b;
	return s;
}

public int addnum(int a, int b) {
	int i = a+b;
	return i;
}

public String addstring(String str) {
	String str2 = str+"WORLD";
	return str2;
}
}
