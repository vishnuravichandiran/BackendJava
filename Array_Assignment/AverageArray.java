package com.java.cls;

public class AverageArray {
	
	    public static void main(String[] args) {
	        int a[] = {10, 20, 30, 40, 50};

	        int sum = 0;
	        double average;

	        for (int i = 0; i < a.length; i++) {
	            sum = sum + a[i];
	        }

	        average = (double) sum / a.length;

	        System.out.println("Sum: " + sum);
	        System.out.println("Average: " + average);
	    }
	}

