package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.Employee;
import Entities.OutsourcedEmployee;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);




List<Employee> emp = new ArrayList<>();

System.out.print("Enter the number of employyes: ");
int quant = sc.nextInt();

for (int i = 0; i < quant; i++) {

	System.out.println("Employye #"+(i+1) + " data:");
	System.out.print("Outsourced(y/n): ");
	String resp = sc.next();
		sc.nextLine();
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Hours: ");
		int hours = sc.nextInt();
		System.out.print("Value per hour: ");
		double value = sc.nextDouble();
		if(resp.equalsIgnoreCase("y")) {
			 sc.nextLine();
		System.out.print("Additional charge: ");
		double add = sc.nextDouble();
		Employee outSourceEmployee = new OutsourcedEmployee(name,hours,value,add);
		emp.add(outSourceEmployee);
		System.out.println("\n");
	} else {
		Employee employee = new Employee(name,hours,value);
		emp.add(employee);
		System.out.println("\n");
	}
	
}

System.out.println("Payments: ");
for (Employee e : emp) {
	
	System.out.println(e);
	
}


sc.close();
	}

}
