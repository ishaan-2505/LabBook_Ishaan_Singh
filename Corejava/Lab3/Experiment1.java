package Lab3;

import java.util.Arrays;

public class Experiment1 {

	public int getSecondSmallest(int arr[])
	{
		Arrays.parallelSort(arr);
		return arr[1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Experiment1 exp1=new Experiment1();
		int arr[]= {23,6,7,1,3,9};
		System.out.println(exp1.getSecondSmallest(arr));
	}

}
