package com.concept;

public class Demo_string {
	public static void main(String[] args) {
		String s="green";
		String s1="arun";
		
		System.out.println(System.identityHashCode(s) );
		System.out.println(System.identityHashCode(s1));
		
		String s4= s.concat(s);
		System.out.println(s4);
	}

}
