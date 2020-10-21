package reviewJavaClass03;

public class LogicalOperators {

	public static void main(String[] args) {
		String day = "Syntax";

		if (day.equalsIgnoreCase("Sunday")) {
			System.out.println("Relax, it's weekend just don't blink or it will be over");
		} else if (day.equalsIgnoreCase("Saturday")) {
			System.out.println("Relax, it's weekend just don't blink or it will be over");
		} else {
			System.out.println("Go to work");
		}

		// improved variant with logical operator
		if (day.equalsIgnoreCase("Sunday") || day.equalsIgnoreCase("Saturday")) {
			System.out.println("Relax, it's weekend just don't blink or it will be over");
		} else {
			System.out.println("Go to work");
		}

	}

}
