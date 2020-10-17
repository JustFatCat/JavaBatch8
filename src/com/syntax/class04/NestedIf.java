package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		/*
		 * variable for allergy - yes or no
		 * 
		 * if allergy is yes --> we will check if pet allergy if peanut allergy if
		 * pollen allergy if no allergy you are lucky!!!
		 * 
		 */

		boolean allergy = true;

		boolean petAllergy = false;
		// boolean peanutAllergy = true;
		// boolean pollenAllergy = true;

		if (allergy) {// true
			System.out.println("Let's do further check");

			if (petAllergy) {
				System.out.println("Please no home pets");
			} else {
				System.out.println("That's good you don't have pet allergy");
			};

		} else {
			System.out.println("You are lucky!");
		};
		
		System.out.println("---------------------------------");
		
		/*
		 * if today is Friday we will watch movie but would check the date
		 *                  if date is 13 --> watching scary movie
		 *                  and if it is not --> I'll watch comedy, action
		 * if no Friday --> I'm studying                 
		 */
		
		boolean isFriday = true;
		int date = 13;
		boolean isMonday = true;
	
		if(isFriday) {
			if(date==13) {
				System.out.println("I'll watch scary movie");
			}else {
				System.out.println("I'll watch PK movie");
			}
			
		}else {
			if(isMonday) {
				System.out.println("I'm not studying, I'm working");
			}else {
				System.out.println("I have class at Syntax");	
		}
	}
		System.out.println("---------------------------------");
		/* check is assignment is completed 
		 * if assignment is completed:
		 *          if score >90 --> great job
		 *          if score >80 --> good job
		 *          if score >70 --> please study more
		 */
		
		int score = 60;
		boolean assignment = false;
		
		if(assignment) {
			if(score>90) {
				System.out.println("Great job!!!");
			} else if(score>80) {
				System.out.println("Good job!!!");
			} else if(score>70) {
				System.out.println("Probably you need to study more!");
			}else {
				System.out.println("Good job for trying but you must study more");
			}
	
		} else {
			System.out.println("You should always complete all the assignments");
			
		};

	}

}
