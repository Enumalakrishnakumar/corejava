package com.krishnakumar.assignment.employee;
import java.util.Scanner;
public class Manager {
	public void managerdisplay() {
	System.out.println("enter manager NAME");
	Scanner scanner = new Scanner(System.in);
	String Mname =scanner.nextLine();//M is employee:
	System.out.println("enter manager ID");
	int Mid =scanner.nextInt();//M is employee:
	System.out.println("enter manager SALARY");
	float Msalary =scanner.nextFloat();//M is employee:
	System.out.println("Thank you!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager();
		manager.managerdisplay();
	}
	}
