package reviewJavaClass01;

public class Casting {

	public static void main(String[] args){   
		
		byte byteVar = 10;
		short shortVar = 100;
		char charVar = 'A';
		int intVar = 1000;
		long longVar = 100000;
		float floatVar = 100000;
		double doubleVar = 10000000;
		
		shortVar=byteVar;
		System.out.println(shortVar);
		
		intVar=charVar;
		System.out.println(intVar);
		
		System.out.println(doubleVar);
		
		floatVar=(float)doubleVar;
		System.out.println(floatVar);
		
		byteVar=(byte)shortVar;
		System.out.println(byteVar);
		
		byte newVar = 100;
		short newShortVar = (short) (newVar + 18);
		System.out.println(newShortVar);
		
		int newIntVar = 100;
		long newLongVar = 1000000L;
		float floatVar1 = 145.02F;
		
		 
		 

	}

}
