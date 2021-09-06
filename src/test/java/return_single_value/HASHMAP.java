package return_single_value;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class HASHMAP {
  @Test
  public void myhashmap() throws Exception{
	  
	Map<String,Integer> map1 = new HashMap<>();  
	map1=getHahMap();
	System.out.println("map1");
	
	
  }

public Map<String, Integer> getHahMap() throws Exception{
	Map<String,Integer> map = new HashMap<>();
	map.put("rohitha",10);
	map.put("venkatesh",20);
	map.put("nallamothu",30);
	System.out.println("the map size is :" +map.size());
	return map;
}
}
