package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		set.add("anand");
		set.add("techbodhi");
		set.add("bhayre");
		set.add("anand");
		for (String s : set) {
			System.out.println(s);
		}
		System.out.println("************************");
		set = new LinkedHashSet<>();
		set.add("anand");
		set.add("techbodhi");
		set.add("bhayre");
		set.add("anand");
		for (String s : set) {
			System.out.println(s);
		}
		System.out.println("************************");

		set = new TreeSet<>();
		set.add("anand");
		set.add("techbodhi");
		set.add("bhayre");
		set.add("anand");
		for (String s : set) {
			System.out.println(s);
		}
		System.out.println("************************");

	}

}
