package reviewJavaClass03;

public class LogicalAnd {

	public static void main(String[] args) {
		/*
		 * int number = -1;
		 * 
		 * if (number >= 0) { if (number <= 100) {
		 * System.out.println("Number is between 0 and 100"); } else {
		 * System.out.println("Number is not between 0 and 100"); } } else {
		 * System.out.println("Number is less then 0"); }
		 * 
		 * // improved variant with logical operator if (number >= 0 && number <= 100) {
		 * System.out.println("Number is between 0 and 100"); } else {
		 * System.out.println("Number is not between 0 and 100"); }
		 */
		
		        
		     boolean a, b, c;
		     a = b = c = true;

		          if( !(a || ( b && c ) )) {
		             System.out.println("If executed");
		          } else {
		             System.out.println("else executed");
		          }
		     }
		
	}


