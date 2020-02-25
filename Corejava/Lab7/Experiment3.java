package Lab7;

import java.util.HashMap;

public class Experiment3 {
	public static void getSquares(int x[]) {
		HashMap<Integer, Integer> hashMap=new HashMap<Integer, Integer>();
		for(int i=0;i<x.length;i++) {
		hashMap.put(x[i], x[i]*x[i]);
		}
		System.out.println(hashMap);
		}
		public static void main(String[] args) {
		int a[]= {1,2,3,4};
		getSquares(a);
		}
}
