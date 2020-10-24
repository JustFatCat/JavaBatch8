package reviewJavaClass04;

public class EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=null;
		if("Emine".equalsIgnoreCase(name)) {//it should be better to put constant part ("Emine") first
			System.out.println("Hi Emine");
		}
		
		//repl task 72, rows - 4, columns - 4
		//$$$$
		//$  $
		//$  $
		//$$$$
		
		//System.out.println("$$$$");
		//System.out.println("$  $");
		//System.out.println("$  $");
		//System.out.println("$$$$");
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				if(i == 1 || i==4 || j ==1 || j==4) {
					System.out.print("$");
				}else {
					System.out.print(" ");
				}
					
			}
			System.out.println("");
		}
		
		

	}

}
