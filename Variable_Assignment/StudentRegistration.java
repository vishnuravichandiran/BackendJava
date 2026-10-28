package com.java.basic;

public class StudentRegistration {
	
	    String name;
	    int rollNo;

	    void register(String n, int r) {
	        name = n;
	        rollNo = r;

	        System.out.println("Name: " + name);
	        System.out.println("Roll Number: " + rollNo);
	    }

	    public static void main(String[] args) {
	    	StudentRegistration s1 = new StudentRegistration();
	    	StudentRegistration s2 = new StudentRegistration();
	    	StudentRegistration s3 = new StudentRegistration();

	        s1.register("Vishnu", 101);
	        s2.register("Ravi", 102);
	        s3.register("Kumar", 103);
	    }
	
}
