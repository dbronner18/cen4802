package fibonacci_sequence;

public class FibonacciSequenceDriver {

	public static void main(String[] args) {
		int nTH = 10;
		System.out.println("The " + nTH + "th term of the Fibonacci sequence is " + calculateFibonacci(nTH));		
	}
	
public static int calculateFibonacci (int n) {
		
		if(n < 2)
			return n;
		
		else {
			return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
		}
	}

}
