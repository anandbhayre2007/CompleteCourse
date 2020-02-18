package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {
		
		Map<Integer, String> map= new HashMap<>();		
		map.put(1, "Shivaji");
		map.put(2, "Nikhil");
		map.put(1, "Hari");
		map.put(null, "Pratibha");
		System.out.println(map.get(1));
		System.out.println(map.get(null));
		
		map= new Hashtable<>();		
		map.put(1, "Shivaji");
		map.put(2, "Nikhil");
		map.put(1, "Hari");	
		map.put(null, "Pratibha");
		System.out.println(map.get(1));
		System.out.println(map.get(null));
		

	}

}
