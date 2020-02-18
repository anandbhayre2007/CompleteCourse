package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterface {

	public static void main(String[] args) {
		
		List<String> list= new ArrayList<>();		
		list.add("anand");
		list.add("techbodhi");
		list.add("bhayre");
		list.add("anand");
		for(String s:list)
		{
			System.out.println(s);
		}
		System.out.println("***************************");
		
		list= new LinkedList<>();		
		list.add("anand");
		list.add("techbodhi");
		list.add("bhayre");	
		list.add("anand");
		for(String s:list)
		{
			System.out.println(s);
		}
		System.out.println("***************************");
		list= new Vector<>();		
		list.add("anand");
		list.add("techbodhi");
		list.add("bhayre");	
		list.add("anand");
		for(String s:list)
		{
			System.out.println(s);
		}

	}

}
