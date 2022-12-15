package oops;
import java.util.Scanner;
class Emp2{
	int emp_id;
	String emp_name;
	int basic_salary;
	public void setData(int employee_id,String employee_name,int Basic_salary) {
		emp_id=employee_id;
		emp_name=employee_name;
		basic_salary=Basic_salary;
	}
	
	public void getData() {
		System.out.println("Employee id "+emp_id+" Employee name "+emp_name+" Employee name "+basic_salary);
	}
	
	public void getAppraisal(int served_year) {
		int new_salary;
		if(served_year==1) {
			new_salary=((basic_salary*10)/100)+basic_salary;
			System.out.println("The new salary is "+new_salary);
		}
		else if(served_year>=2) {
			new_salary=((basic_salary*15)/100)+basic_salary;
			System.out.println("The new salary is "+new_salary);
		}
	}
	public void travel_allowance() {
		System.out.println("Enter your post");
		Scanner str = new Scanner(System.in);
		String post = str.nextLine();
		System.out.println(post);
		if(post.equals("manager")) {
			System.out.println("Your tarvel allowance is "+3000);
		}
		else{
			System.out.println("Your tarvel allowance is "+1500);
		}
	}
}


public class Employee_Project1 {

	public static void main(String[] args) {
		Emp2 spandan = new Emp2();
		spandan.setData(4, "Spandan", 25000);
		spandan.getData();
		spandan.getAppraisal(1);
		spandan.travel_allowance(); 
	}

}
