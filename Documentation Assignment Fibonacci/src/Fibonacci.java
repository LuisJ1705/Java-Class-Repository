public class Fibonacci {
	
	//creating Iterative Fibonacci Seq.
	public int fibIt(int j) {
		
		if(j <= 1) {
			return j;
		}
		int fib = 1;
		int prevFib = 1;
		
		for(int i=2; i<j; i++) {
			int val = fib;
			fib+= prevFib;
			prevFib = val;
		}
		
		return fib;
	}
	//Creating Recursive Fibonacci Seq.
	public int fibRec(int number) {
		
		if(number <= 1) {
			return number;
		}
		
		return fibRec(number-1) + fibRec(number-2);
	}
	//Print
	public static void main(String args[]) {
		Fibonacci fib = new Fibonacci();
		
		System.out.println("Iterative Fibonacci Sequence:");
		long startTimeI = System.nanoTime();
		System.out.println(fib.fibIt(5));
		System.out.println(fib.fibIt(10));
		System.out.println(fib.fibIt(20));
		System.out.println(fib.fibIt(30));
		long endTimeI = System.nanoTime();
		long totalTimeI = endTimeI - startTimeI;
		System.out.println("Total Time in nanoseconds: " + totalTimeI);
		
		System.out.println("Recursive Fibonacci Sequence:");
		long startTimeR = System.nanoTime();
		System.out.println(fib.fibRec(5));
		System.out.println(fib.fibRec(10));
		System.out.println(fib.fibRec(20));
		System.out.println(fib.fibRec(30));
		long endTimeR = System.nanoTime();
		long totalTimeR = endTimeR - startTimeR;
		System.out.println("Total Time in nanoseconds: " + totalTimeR);
	}
}