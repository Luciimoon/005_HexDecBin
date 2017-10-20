
public class RunHere {
	
	
	/**
	 * grading reg's!
	 * 
	 * 1. All JOP's, remove syso's/Scanner
	 * 2. Runnable jar -- stand alone outside eclipse
	 * 3. ask for name, repeat name with friendly "hello.....
	 * 4. ask "what base are we starting with? hex,dec,bin?
	 * 5. ask "waht base are we converting too? hex,dec,bin?
	 * 6. enter the staring number
	 * 7. do the conversion, show result
	 * 8. ask if they wannt to go again, if yes, start over. if no, friendly exit
	 */

	public static void main(String[] args) {
		
		//added hex to binary functionality (just for git practice)
		//BinPower binpower = new BinPower();
		//binpower.setBinary();
		
		HexDecBin baseConverter = new HexDecBin();

		baseConverter.setHexNumber();
		baseConverter.convert();

	}

}
