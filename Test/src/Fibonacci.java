import java.math.BigInteger;

public class Fibonacci {
	
	public static BigInteger fib(int n, BigInteger[] memo) {
		if(memo[n] != null) return memo[n];
		if(n < 3) return BigInteger.valueOf(1);
		BigInteger ret = fib(n-1, memo).add(fib(n-2, memo)); 
		memo[n] = ret;
		return ret;
	}
	
	public static BigInteger fib(int n) {
		BigInteger[] memo = new BigInteger[n + 1];
		return fib(n, memo);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(fib(100));

	}

}
