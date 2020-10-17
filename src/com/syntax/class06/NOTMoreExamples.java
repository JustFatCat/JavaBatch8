package com.syntax.class06;

public class NOTMoreExamples {

	public static void main(String[] args) {
		boolean isJavaEasy = false;
		
		if(!isJavaEasy) {
			System.out.println("Please try to spend more time with Java");
		}
		
		System.out.println("---------------------------------");
		
		String day = "Saturday";
		
		if(!(day.equals("Sunday") || day.equals("Saturday"))){
			System.out.println("I'm going to work");
		}else {
			System.out.println("It's day off");
		}

	}

}
