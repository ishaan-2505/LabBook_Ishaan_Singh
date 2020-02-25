package Lab7;
import java.util.Arrays;
import java.util.HashMap;

public class Exercise5 {
	static int getSecondSmallest(int ar[])
	{
		Arrays.parallelSort(ar);
		return ar[1];
	}
	
	public static void main(String[] args) {
		int arr[]= {23,64,1,67,45,3};
		System.out.println(getSecondSmallest(arr));
		
	}
}
