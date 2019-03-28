
public class BinaryToDecimal {

	public int BinToDec(int binNumber) {

		int decNumber= 0;
		int pw = 0;
		while(true) {
			if(binNumber == 0) {
				break;
        	}
	   		else {	
	   			int rem = binNumber%10;
	   			decNumber += rem*Math.pow(2, pw);
	   			binNumber = binNumber/10;
	   			pw++;
	   		}
		}
		return decNumber;
	}
}
