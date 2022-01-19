package fibonacci_sequence;

/**
 * This program will pass a number into a method that will calculate the Fibonacci 
 * sequence to the term of the number passed in. The program will then receive a 
 * number from that method and display that number to the console along with 
 * stating what term in the sequence the result is.
 * 
 * @author Devon Bronner
 *
 */
public class FibonacciSequenceDriver {

	/**
	 * This is the main method and as such runs the program. 
	 * 
	 * @param args array of command line arguments from the program
	 */
	public static void main(String[] args) {
		int nTH = 10;
		System.out.println("The " + nTH + "th term of the Fibonacci sequence is " + calculateFibonacci(nTH));		
	}
	
	/**
	 * This will calculate the Fibonacci term of the number passed into it.
	 * 
	 * @param n Fibonacci term to be calculated up to
	 * @return the calculated term of the passed in number
	 */
	public static int calculateFibonacci (int n) {
		
		if(n < 2)
			return n;
		
		else {
			return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
		}
	}

}
