package Lab5.com.cg.eif.exception;

import java.util.Scanner;

public class EmployeeException {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float salary=sc.nextFloat();
		if(salary<3000)
			throw new Exception("Salary cant be below 3000");
	}

}
