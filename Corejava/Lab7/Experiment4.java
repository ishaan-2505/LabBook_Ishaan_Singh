package Lab7;
import java.io.CharConversionException;
import java.util.HashMap;
import java.util.Set;
public class Experiment4 {
	static HashMap<Integer,String> countCharacter(HashMap<Integer,Integer>hashmap)
	{
		HashMap<Integer,String> hashMap1=new HashMap<>();
		Set<Integer> reg_set=hashmap.keySet();
		
		String medal=null;
		int marks;
		for(Integer key : reg_set) {
			marks=hashmap.get(key);
			
			if(marks>=90)
				medal="Gold";
			else if(marks >= 80 && marks<90)
				medal="silver";
			else if(marks >=70 && marks <80)
				medal="Bronze";
			hashMap1.put(key, medal);
		}
		return hashMap1;
	}
}
