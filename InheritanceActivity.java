class Employee1{
    long employeeId;
    String employeeName;
    String employeeAddress;
    long employeePhone;
    double basicSalary;
    double specialAllowance=250.80;
    double HRA = 100.50;
    Employee1(long id, String name, String address, long phone){
        this.employeeId=id;
        this.employeeName=name;
        this.employeeAddress=address;
        this.employeePhone=phone;
    }

    public void calculate_salary(){
        double salary = (basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*HRA/100));
        System.out.println(employeeName+" Your salary is "+ salary);
    }

    public void getData(){
        System.out.println("Name: "+employeeName+" Id: "+employeeId+" Address: "+employeeAddress+" Phone Number: "+ employeePhone);
    }

    public void calculatetravelallowance() {
        double travelallowance =  (basicSalary * 10 / 100);
        System.out.println(employeeName+" travel allowance is " + travelallowance);
    }
}

class Manager extends Employee1{
    Manager(long id, String name, String address, long phone,double salary) {
        super(id, name, address, phone);
        this.basicSalary=salary;
    }
    public void calculatetravelallowance() {
        double travelallowance =  (basicSalary * 15 / 100);
        System.out.println(employeeName+" travel allowance is " + travelallowance);
    }
}

class Trainee extends Employee1{
    Trainee(long id, String name, String address, long phone,double salary) {
        super(id, name, address, phone);
        this.basicSalary = salary;
    }
    public void travelallowance() {
        double travelallowance = (basicSalary * 10 / 100);
        System.out.println(employeeName+" Traniee travel allowance is " + travelallowance);
    }
}
public class InheritanceActivity{
    public static void main(String[] args) {
        Manager mg = new Manager(126534,"Peter","Chennai Indian",237844,65000);
        mg.getData();
        mg.calculatetravelallowance();
        mg.calculate_salary();

        Trainee tr1 = new Trainee(29846,"Jack","Mumbai India",442085,45000);
        tr1.getData();
        tr1.calculatetravelallowance();
        tr1.calculate_salary();
    }
}
