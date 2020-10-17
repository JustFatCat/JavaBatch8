package reviewJavaClass02;

public class NestedIfConditions {

	public static void main(String[] args) {
		String name = "Asghar";
		String password = "pass123";
		double accountBalance = 10.25;
		double transferAmount = 8.12;
		boolean transAllowed = true;
		
		if(password.equals("pass123") && name.equals("Asghar")) {
			System.out.println("Welcome to Syntax bank " + name);
			
			if(transAllowed) {
				System.out.println("Initiating transfer");
				if(transferAmount>accountBalance) {
					System.out.println("Insufficient balance");	
				}else {
					System.out.println("Transfer complete");	
				}
			}else {
				System.out.println("You are not allowed to thansfer");
			}
		}else {
			System.out.println("Invalid password! Try again");
		}
		
		
		

	}

}
