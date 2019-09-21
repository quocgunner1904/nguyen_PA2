package nguyen_3;

import java.util.Scanner;
public class Survey {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String[] topics = {"food", "video games", "school", "travel", "shopping"};
		int [][] responses = new int[5][10];
		int [] total = new int[5];
		int i, j;
		int min = 100;
		int max = 0;
		double avg;
		
		for (j = 0; j < 10; ++j) { 
			for (i = 0; i < 5; ++i) {
				System.out.print("In a scale 1-10, how important is " + topics[i] + " to you? ");
				responses[i][j] = scnr.nextInt();
				while ((responses[i][j] < 1) || (responses[i][j] > 10)) {
					System.out.print("Only from 1 to 10: ");
					responses[i][j] = scnr.nextInt();
				}
			}
		}
		
		System.out.println("");
		System.out.println("Summary of the results: ");
		for (i = 0; i < 5; ++i) {
			if (topics[i].length() < 8) {
				System.out.print(topics[i] + "\t\t");
			}
			else {
				System.out.print(topics[i] + "\t");
			}
			for (j = 0; j < 10; ++j) {
				System.out.print(responses[i][j] + " ");
				total[i] = total[i] + responses[i][j];
			}
			if (max < total[i]) {
				max = total[i];
			}
			if (min > total[i]) {
				min = total[i];
			}
			avg = (double)total[i] / 10;
			System.out.printf("\t%.1f\n", avg);
		}
		
		System.out.println("");
		for (i = 0; i < 5; ++i) {
			if (total[i] == max) {
				System.out.println(topics[i] + " received the highest point total: " + max);
			}
		}
		for (i = 0; i < 5; ++i) {
			if (total[i] == min) {
				System.out.println(topics[i] + " received the lowest point total: " + min);
			}
		}
		scnr.close();
	}
}
