package Lab1;

import java.util.Scanner;

public class Experiment3 {
	public boolean checkNumber(int number)
	{
		Integer arr[]=new Integer[10];
		int i=0,c=0,p=0;
		while(number!=0)
		{
			int n=number%10;
			number=number/10;
			arr[i++]=n;
		}
		for(int j=0;j<i-1;j++)
		{
			c=0;
			for(int k=j+1;k<i;k++)
			{
				if(arr[j]>arr[k])
					c++;
			}
			if(c==i-j-1)
				p++;
		}
		if(p==i-1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Experiment3 exp3=new Experiment3();
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		boolean ans=exp3.checkNumber(number);
		System.out.println(ans);
	}

}
