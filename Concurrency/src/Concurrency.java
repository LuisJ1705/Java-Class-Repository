//Luis Jimenez, 10/26/2022


import java.util.Random;

//Created sum class
	class Sum extends Thread {

		private int[] array;

		private int low, high, partial;

		public Sum(int[] array, int low, int high)

{

			this.array = array;

			this.low = low;

			this.high = Math.min(high, array.length);

}
//get partial sum
public int getPartialSum()

{

	return partial;

}
//run the array
public void run()

{

	partial = sum(array, low, high);

}
//return sum
public static int sum(int[] array)

{

	return sum(array, 0, array.length);

}
//calculate the sum
public static int sum(int[] array, int low, int high)

{

	int total = 0;

	for (int i = low; i < high; i++) {

		total += array[i];

}

	return total;

}
//create and calculate parallel sum
public static int parallelSum(int[] array)

{

	return parallelSum(array, Runtime.getRuntime().availableProcessors());

}

	public static int parallelSum(int[] array, int threads)

{

		int size = (int) Math.ceil(array.length * 1.0 / threads);

		Sum[] sums = new Sum[threads];

for (int i = 0; i < threads; i++) {

	sums[i] = new Sum(array, i * size, (i + 1) * size);

	sums[i].start();

}

try {

	for (Sum sum : sums) {

		sum.join();

}

} catch (InterruptedException e) { }

	int total = 0;

	for (Sum sum : sums) {

		total += sum.getPartialSum();

}

	return total;

}

}
//create main Concurrency class
public class Concurrency {

	public static void main(String[] args)

{
//random variable
Random rand = new Random();
//200000000 number array
	int[] array = new int[200000000];

	for (int i = 0; i < array.length; i++) {

		array[i] = rand.nextInt(10) + 1;

}
//calculate runtime
long start = System.currentTimeMillis();

	System.out.println(Sum.sum(array));

	System.out.println("Single: " + (System.currentTimeMillis() - start));

	start = System.currentTimeMillis();

	System.out.println(Sum.parallelSum(array));

	System.out.println("Parallel: " + (System.currentTimeMillis() - start));

}

}