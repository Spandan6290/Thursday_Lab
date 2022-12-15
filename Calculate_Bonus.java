package oops;
class Emp3{
	String emp_name;
	int basic_salary;
	public void setData(String employee_name,int Basic_salary) {
		emp_name=employee_name;
		basic_salary=Basic_salary;
	}
	
	public void getData() {
		System.out.println("Employee name "+emp_name+" Employee name "+basic_salary);
	}
	public void calculate_bonus(int served_year) {
		if(served_year>3) {
			System.out.println("Your bonus is "+ 2500);
		}
		else {
			System.out.println("Sorry no bonus");
		}
	}
}
public class Calculate_Bonus {

	public static void main(String[] args) {
		Emp3 spandan = new Emp3();
		spandan.calculate_bonus(4);
	}

}
