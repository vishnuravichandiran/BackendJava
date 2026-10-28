package com.java.basic;

public class EmployeeCounter {
	
	    static int count = 0;

	    void register() {
	        count++;
	        System.out.println("Employee Registered");
	    }

	    public static void main(String[] args) {
	    	EmployeeCounter e1 = new EmployeeCounter();
	    	EmployeeCounter e2 = new EmployeeCounter();
	    	EmployeeCounter e3 = new EmployeeCounter();

	        e1.register();
	        e2.register();
	        e3.register();

	        System.out.println("Total Employees: " + count);
	    }
}
