import java.util.Scanner;

public class BinToDecClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryToDecimal obj = new BinaryToDecimal();
        Scanner scan=new Scanner(System.in);
      System.out.println("Enter the binary number to convert into decimal");
     int binaryNumber = scan.nextInt();
    System.out.println( "Binary number " + binaryNumber + 
    		" conversion in " + "Decimal number is " +
    		obj.BinToDec(binaryNumber));
	}

}
