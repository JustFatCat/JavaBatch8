package reviewJavaClass01;

public class StringConcat {

	public static void main(String[] args) {
		String firstName = "Mooneer";
		String lastName = "Falzy";
		String result = lastName + 5;
		
		System.out.println(result);
		
		result = lastName + 5.0;
		System.out.println(result);
		
		result = lastName + true;
		System.out.println(result);
		
		result = lastName + 'C';
		System.out.println(result);
		
		int charVar = (int) 'F';
		System.out.println(charVar);
		
		char charVarA  = (char) charVar;
		System.out.println(charVarA);
		
		System.out.println("--------------------------------");
		
		System.out.println('A' + 5 + "name" + 'C' + 45);
		System.out.println(5 + 5 + "name" + 'C' + 45);
		System.out.println(5.0 + 5 + "name" + 'C' + 45);
		System.out.println(5 + 5 + "name" + 'C' + true);
		
		char C = 'A';
		System.out.println(C);
		System.out.println((int)C);
		
		System.out.println("-----------------");
		
		int smiley = 9786;
		System.out.println((char)smiley);
		
	

	}

}
