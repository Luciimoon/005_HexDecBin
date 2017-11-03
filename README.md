# 005_HexDecBin


I dont care(remember to acually do the commit later)


import java.util.Scanner;

import javax.swing.JOptionPane;

public class HexDecBin {

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
	int bite = 8; 
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
		inputint = Integer.parseInt(inputnum);

		
		
		
		if (base.equalsIgnoreCase("dec")) {
			if (convert.equalsIgnoreCase("hex")) {
				inputnum = Integer.toString(inputint, 16); // decimal to Hex
				
			} else if (convert.equalsIgnoreCase("bin"))
				inputnum = Integer.toString(inputint, 2); // decimal to binary
		}
		
		
		//test syso's
		//System.out.println("inputnum:" + inputnum);
		//System.out.println("inputint:" + inputint);
		
		if (base.equalsIgnoreCase("hex"))
			if (convert.equalsIgnoreCase("dec")) {
				//HEX TO DEC
				 System.out.println("\nEnter the hex number :");
				 hex = kbd.nextLine();
			     //mouse over parseInt to read pop-up guide
				 inputint = Integer.parseInt(hex, 16);
				 System.out.println("You have entered hex " + hex );
				 System.out.println("Decimal value is: " + inputint + "(remember 0-" +num + " has " +(num+1) + " values)\"");
				inputnum = Integer.toString(inputint, 10); // decimal to Hex
			} else if (convert.equalsIgnoreCase("bin")) {
				 System.out.println("\nEnter the hex number :");
			 hex = kbd.nextLine();
				inputnum = Integer.toBinaryString(Integer.parseInt(hex, 16)); 
	}
			
				
		
		
		if (base.equalsIgnoreCase("bin")) {
				if (convert.equalsIgnoreCase("dec")) {
					inputint = Integer.parseInt(inputnum, 2);
					
					
				} else if (convert.equalsIgnoreCase("hex"))
		//inputnum =  Integer.toHexString(Integer.parseInt(inputnum,2));
		inputint = Integer.parseInt(inputnum,2);
				System.out.println("Work?");
		}
		 
		 
		 byteAnswer = numberBits / bite;
			byteRemainder = numberBits % bite;

	}// end of setHexNumber

	void convert() {
		inputint = Integer.parseInt(inputnum);
		String binary = Integer.toBinaryString(inputint);
		System.out.println("Your answer is:" + inputnum);
		System.out.println("binary value is: " + binary);
		System.out.println("Number of bits is " + binary.length());
		System.out.println("Number of whole nibbles (4 bits) is "+ bite/4 +  " with "+ bite%4 +  " bits over left");
		System.out.println("Number of whole bytes (8 bits) is "+ byteAnswer + " with "+ byteRemainder +" bits remaining");
	}
	
}// end of class
