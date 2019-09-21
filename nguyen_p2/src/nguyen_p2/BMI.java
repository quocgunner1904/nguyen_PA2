package nguyen_p2;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		int pick;
		double BMI, userWeight, userHeight;
		
		System.out.println("The fomulas for calculating BMI are: ");
		System.out.println("1.    (703 * weightInPounds) / (heightInInches)^2)");
		System.out.println("2.    weightInKilograms / (heightInMeters)^2");
		System.out.println("");
		System.out.print("Which formula do you want to use (1 or 2)? ");
	
		Scanner scnr = new Scanner(System.in);
		pick = scnr.nextInt();
		
		while ((pick != 1) && (pick != 2)) {
			System.out.print("Nope! Just 1 or 2: ");
			pick = scnr.nextInt();
		}
		
		if (pick == 1) {
			System.out.print("Enter your weight in pound: ");;
			userWeight = scnr.nextDouble();
			System.out.print("Enter you height in inch: ");
			userHeight = scnr.nextDouble();
			
			BMI = (703 * userWeight) / (userHeight * userHeight);
			
			System.out.printf("Your BMI is: %.1f\n", BMI);
		}
		else {
			System.out.print("Enter your weight in kilogram: ");;
			userWeight = scnr.nextDouble();
			System.out.print("Enter you height in meter: ");
			userHeight = scnr.nextDouble();
			
			BMI = userWeight / (userHeight * userHeight);
			System.out.printf("Your BMI is: %.2f\n", BMI);
		}
		
		if (BMI < 18.5) {
			System.out.println("You are underweight");
		}
		else if ((BMI >= 18.5) && (BMI < 25)) {
			System.out.println("You have normal weight");
		}
		else if ((BMI >= 25) && (BMI < 30)) {
			System.out.println("You are overweight");
		}
		else {
			System.out.println("You are obesity");
		}
		scnr.close();
	}
}
