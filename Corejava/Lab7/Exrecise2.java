package Lab7;
import java.util.*;

public class Exrecise2 {
	static HashMap<Character,Integer> countCharacter(Character ar[]){
		HashMap<Character,Integer> hashMap=new HashMap<>();
		List<Character> list1=Arrays.asList(ar);
		int c=0;
		for(Character character : list1) {
			c=0;
			c=Collections.frequency(list1, character);
			hashMap.put(character,c);
		}
		return hashMap;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character character[]= {'a','b','c','d','e','b','c','a','d'};
		System.out.println(countCharacter(character));
	}

}
