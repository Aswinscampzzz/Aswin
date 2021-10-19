package com.concept;

public class Concept {
	
public static void main(String[] args) {
	String s = "Have a nice day";
	
	int length = s.length();
	System.out.println(length);
	
	boolean equals = s.equals("Have a nice day");
	System.out.println(equals);
	
	boolean equalsIgnoreCase = s.equalsIgnoreCase("have a nice day");
	System.out.println(equalsIgnoreCase);
}
} 
