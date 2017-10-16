import java.util.Scanner;
public class BinPower {

	//Fixed Scanner bug for float inputs
	
	Scanner input = new Scanner(System.in);
	/*
	 * 
	 * Sting is cap'd reason: its a class
	 * int isn't cap'd, reason: It is a 'primitive' type, means not a class
	 * Integer -- full name, with cap is a class
	 * double, lower case, it is a 'primitive' mans no class for it
	 */
	
	
	//private String name = "";
	//private double num;
	
	public BinPower() {
		
		
	}
	
	
	public void setBinary() {
		
		double base;
		double exp;
		//int ans = 0;
		double answer;
		String name = "";
		
		System.out.println("Hello most amazing person! what is your name?");
				name = input.nextLine();
				System.out.println("Welcome to my program " + name + "!");
				System.out.println("What base number do you want?");
				base = input.nextDouble();
				System.out.println("You have giving me " + base);
		
				
				System.out.println("What binary exponent do you want me to enter?");
				exp = input.nextDouble();
				System.out.println("You have giving me " + exp);
		
		
		
		
		answer =  Math.pow(base, exp);
		System.out.println("Answer is:" + answer);
	}
}
