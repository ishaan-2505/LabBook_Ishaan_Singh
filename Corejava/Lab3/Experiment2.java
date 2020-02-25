package Lab3;

import java.util.Arrays;

public class Experiment2 {
	public String[] Sorting(String str[])
	{
		Arrays.parallelSort(str);
		if(str.length%2==0)
		{
			for(int i=0;i<str.length/2;i++)
				str[i]=str[i].toLowerCase();
			for(int i=(str.length/2);i<str.length;i++)
				str[i]=str[i].toUpperCase();
		}
		else {
			for(int i=0;i<=str.length/2;i++)
				str[i]=str[i].toLowerCase();
			for(int i=(str.length/2)+1;i<str.length;i++)
				str[i]=str[i].toUpperCase();
		}
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"himani","abhinav","aiman"};
		Experiment2 exp2=new Experiment2();
		String str[]=exp2.Sorting(arr);
		for(int i=0;i<str.length;i++)
			System.out.print(str[i]+" ");
	}

}
