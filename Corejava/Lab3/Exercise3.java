package Lab3;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		String str;
		int a=0,c=0;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();

		char ch[]=str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
		c=1;
		for (int j = i+1; j < ch.length; j++) {
		if(ch[i]==ch[j]) {
		ch[j]=' ';
		c++;
		}

		}
		if(ch[i]!=' ') {
		System.out.printf("%c is %d times",ch[i],c);
		System.out.println();
		}
		}
	}
}
