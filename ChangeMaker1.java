import java.util.Scanner;

public class ChangeMaker1 {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		makeChange();

	}
	
	//Modifier: public static
	//Return Type : void
	//Method Name: makeChange
	//Args: -
	
	public static void makeChange() {
	
		//ask user for input
		System.out.println("Enter change needed");
		int amount = scanner.nextInt();
		
		//define variables
		int remainder = 0;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		
			
		//max change 99 cents
		if (amount <= 1 && amount >= 99) {
				System.out.println("Does not compute");
		}
		
		//breaking down user input into change
		quarters = amount / 25;
		remainder = amount % 25;
		dimes = remainder / 10;
		remainder = remainder % 10;
		nickels = remainder / 5;
		remainder = remainder % 5;
		
		//do not print any change that is 0
		while (quarters != 0) {
			System.out.println(quarters + " quarters");
			break;
		}
		while (dimes != 0) {
			System.out.println(dimes + " dimes");
			break;
		}
		while (nickels != 0) {
			System.out.println(nickels + " nickels");
			break;
		}
		while (remainder != 0) {
			System.out.println(remainder + " pennies");
			break;
		}
	}
}
