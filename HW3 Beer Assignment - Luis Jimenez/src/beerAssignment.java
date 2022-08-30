import java.util.Scanner;

public class beerAssignment {
	public static void main(String[] args) {
		
		//Getting input from the user for both the daily beers and the average price of the beers.
		Scanner dailyBeer = new Scanner(System.in);
		System.out.print("On average, how many beers will you consume each day: \n");
		double Beer = dailyBeer.nextDouble();
		
		Scanner beerPrice = new Scanner(System.in);
		System.out.print("On average, how much will you pay for each can of beer: \n");
		double Price = beerPrice.nextDouble();
		//The program will output the beers that will be consumed in one year, showing 2 decimal places.
		double oneYearBeer = Beer * 365;
		System.out.print("This is how many beers you will consume in a year: \n"+ String.format("%.2f",oneYearBeer));
		//Calories output, it will be displayed with 2 decimals
		double oneYearCalories = oneYearBeer * 150;
		System.out.print("\nThis is how many calories you will consume in a year from beer alone: \n"+ String.format("%.2f",oneYearCalories));
		//Finally, the weight will be calculated by multiplying the daily beers, the average price, and the 12 ounces of each beer, it will be displayed with two decimal places.
		double oneYearWeight = Beer * Price * 12;
		System.out.print("\nThis is how many pounds you will gain without diet or exercise to counter these calories: \n"+ String.format("%.2f",oneYearWeight));
		}
}
