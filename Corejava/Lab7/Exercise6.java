package Lab7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Exercise6 {
	public static List isEligible(HashMap<String,Integer> hashMap) {
		List<String> idList=new ArrayList<>();
		Set<String> keySet=hashMap.keySet();
		for(String key : keySet)
		{
			int age=hashMap.get(key);
			if(age>=18)
				idList.add(key);
		}
		return idList;
	}
	
	public static void main(String[] args) {
		HashMap<String,Integer>inHash=new HashMap<String,Integer>();
		inHash.put("12A", 13);
		inHash.put("13B", 21);
		List<String> idList=new ArrayList<>();
		idList=isEligible(inHash);
		System.out.println(idList);
	}
}
