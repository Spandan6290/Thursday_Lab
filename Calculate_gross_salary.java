package oops;
import java.util.Scanner;
public class Calculate_gross_salary {

	public static void main(String[] args) {
		Scanner spandan = new Scanner(System.in);
		System.err.println("Enter your Salary");
		int basic_salary = spandan.nextInt();
		if(basic_salary>1500) {
			int hra=20;
			int da = 90;
			int gross_salary = basic_salary+((basic_salary*hra)/100)+((basic_salary*da)/100);
			System.out.println("Your GROSS1 Salary is "+gross_salary);
		}
		
		else{
			int hra=500;
			int da = 70;
			int gross_salary = basic_salary+hra+((basic_salary*da)/100);
			System.out.println("Your GROSS2 Salary is "+gross_salary);
		}

	}

}
