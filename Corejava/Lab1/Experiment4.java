package Lab1;
import java.util.*;
import java.lang.*;
public class Experiment4 {
	public boolean checkNumber(int n)
	{
		int i=0,flag=0;
		while(n>=Math.pow(2,i))
		{
			if(Math.pow(2, i)==n) {
				flag++;
				break;
			}
			else
				i++;
		}
		if(flag>0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Experiment4 exp4=new Experiment4();
		System.out.println("Enter a no.");
		int n=sc.nextInt();
		boolean b=exp4.checkNumber(n);
		System.out.println(b);
		
	}

}
