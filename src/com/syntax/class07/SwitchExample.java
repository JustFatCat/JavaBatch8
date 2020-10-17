package com.syntax.class07;

public class SwitchExample {

	public static void main(String[] args) {
		// if month is December or February ==> winter
		// if month is March or April ==> spring
		
		String month = "March";
		
		switch(month) {
			case "December":
			case "January":
			case "February":
				System.out.println("Winter");
				break;
			case "March":
			case "April":
			case "May":
				System.out.println("Spring");
				break;	
		
		}

	}

}
