package CollectionDemo;

import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
		Set<Object> set = new HashSet<Object>();
		Person p1 = new Person();
		Person p2 = new Person();
		set.add(p2);
		set.add(p1);
		set.add("helixin");
		set.add("helixin");
		System.out.println(set.size());
		
		
		Map<Person,Integer> map = new HashMap<Person,Integer>(); 
		map.put(p1, 1);
		map.put(p2, 2);
		System.out.println(map.get(p1)+map.get(p2));
		
		InputStreamReader i = null;
	}
}
