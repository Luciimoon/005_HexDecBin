
public class RunHere {

	public static void main(String[] args) {
		
		//added hex to binary functionality (just for git practice)
		BinPower binpower = new BinPower();
		binpower.setBinary();
		
		HexDecBin baseConverter = new HexDecBin();

		baseConverter.setHexNumber();
		baseConverter.convert();

	}

}
