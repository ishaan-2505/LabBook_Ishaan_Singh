package Lab7;

import java.util.Arrays;

public class Experiment7 {

	public static int[] getSorted(int ar[]) {
		int ar3[]=new int[ar.length];
		int p=0;
		for(Integer i: ar) {
		String s=new String(i.toString());
		String k=new StringBuffer(s).reverse().toString();
		ar3[p++]=Integer.parseInt(k);
		}
		Arrays.sort(ar3);
		return ar3;
		}
		public static void main(String[] args) {
		System.out.println("After sorting: ");
		int arr1[]= getSorted(new int[] {123,45,67});
		for(Integer j: arr1) {
		System.out.println(j);
		}
		}
		}


