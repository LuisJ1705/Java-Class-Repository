import java.util.Scanner;

class inputOutput {
	public static void main(String[] args) {
		
//Getting input from user, we need three integers for this program
		Scanner input1 = new Scanner(System.in);
    	
        System.out.print("Enter the first integer: ");
        int number1 = input1.nextInt();
        System.out.println("Your first integer is " + number1);
        
        Scanner input2 = new Scanner(System.in);
    	
        System.out.print("Enter the second integer: ");
        int number2 = input2.nextInt();
        System.out.println("Your second integer is " + number2);
        
        Scanner input3 = new Scanner(System.in);
    	
        System.out.print("Enter the third integer: ");
        int number3 = input3.nextInt();
        System.out.println("Your third integer is: " + number3);
//After the user inputs the three integers, the program will output the sum of the three integers        
        Object Sum = number1 + number2 + number3;
        
        System.out.println("The sum of the three integers is: "+ Sum);
//Finally, the program will output the average of the three integers.        
        double Average = (number1 + number2 + number3) /3;
        System.out.println("The average of the three integers is: "+ Average);
	}
}



