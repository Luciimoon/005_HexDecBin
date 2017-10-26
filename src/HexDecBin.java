import java.util.Scanner;

import javax.swing.JOptionPane;

public class HexDecBin {

	
	/************************************
	 * 
	 *  FIX FAULTS! COMPLETE MISSING CODE
	 *  
	 * **********************************
	 */
	//Scanner for float is now working
	Scanner kbd = new Scanner(System.in);
	String name = "";
	String hex = "";
	int num;
	
	String msg = "";
	int inputint;
	String base = "";
	String convert = "";
	String inputnum = "";
	
	
	int numberBits = 10;
	int bite = 8; //spelled wrong to avoid a keyword conflict
	int nibble = 4;
	int byteAnswer = 0, byteRemainder = 0;
	
	public HexDecBin() {
		System.out.println("welcome to my hexadecimal, Decimal, or Binary conversion program! ");
		System.out.println("What is your name?");
		name = kbd.nextLine();
		System.out.println("Very nice to meet you " + name + " let's begin: \n");
	}

	public void setHexNumber() {

		
		
		// msg = "Please enter your string";
		// wordPut = JOptionPane.showInputDialog(null, msg);
		System.out.println("\nWhat is your starting base. Hex, Dec, or Bin?");
		base = kbd.nextLine();
		System.out.println("\nWhat base do you want to convert too? Hex, Dec, or Bin?");
		convert = kbd.nextLine();
		System.out.println("\nWhat is your input number?");
		inputnum = kbd.nextLine();
		//inputint = Integer.parseInt(inputnum);

		
		

		
		if (base.equalsIgnoreCase("dec")) {
			inputint = Integer.parseInt(inputnum);
			if (convert.equalsIgnoreCase("hex")) {
				inputnum = Integer.toString(inputint, 16); // decimal to Hex
				System.out.println("Your answer is:" + inputnum);
			} else if (convert.equalsIgnoreCase("bin"))
				inputnum = Integer.toString(inputint, 2); // decimal to binary
				System.out.println("Your answer is:" + inputnum);
		}
		
		
		
		if (base.equalsIgnoreCase("hex"))
			if (convert.equalsIgnoreCase("dec")) {
				 System.out.println("\nEnter the hex number :");
				 hex = kbd.nextLine();
			     //mouse over parseInt to read pop-up guide
				 num = Integer.parseInt(hex, 16);
				 System.out.println("You have entered hex " + hex );
				 System.out.println("Decimal value is: " + num + "(remember 0-" +num + " has " +(num+1) + " values)\"");
				inputnum = Integer.toString(inputint, 10); // decimal to Hex
				System.out.println("Your answer is:" + inputnum);
			} else if (convert.equalsIgnoreCase("bin"))
				inputnum = Integer.toString(inputint, 2); // decimal to binary
				System.out.println("Your answer is:" + inputnum);
		
				
				
				
			if (base.equalsIgnoreCase("bin"))
				inputint = Integer.parseInt(inputnum);
				if (convert.equalsIgnoreCase("dec")) {
					inputnum = Integer.toString(inputint, 2); // bin to dec
					System.out.println("Your answer is:" + inputnum);
				} else if (convert.equalsIgnoreCase("hex"))
					inputnum = Integer.toString(inputint, 16); // bin to hex
					System.out.println("Your answer is:" + inputnum);
		
		
		
		// System.out.println("\nEnter the hex number :");
		 //hex = kbd.nextLine();
	     //mouse over parseInt to read pop-up guide
		 //num = Integer.parseInt(hex, 16);
					//HEX TO DEC
		 //System.out.println("You have entered hex " + hex );
		 //System.out.println("Decimal value is: " + num + "(remember 0-" +num + " has " +(num+1) + " values)\"");
		 
		 
		 
		 byteAnswer = numberBits / bite;
			byteRemainder = numberBits % bite;

	}// end of setHexNumber

	void convert() {
		
		String binary = Integer.toBinaryString(num);
		//System.out.println("Your answer is:" + inputnum);
		System.out.println("binary value is: " + binary);
		System.out.println("Number of bits is " + binary.length());
		System.out.println("Number of whole nibbles (4 bits) is "+ bite/4 +  " with y bits over left");
		System.out.println("Number of whole bytes (8bits) is "+ byteAnswer + " with "+ byteRemainder +" bits remaining");
	}
	
}// end of class
