import java.util.Scanner;

public class Encrypt {
	public 	static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int numInput, numEncrypt;
		int a;
		int b;
		int c;
		int d;
		
		System.out.print("Please enter a four-digit number: ");
		numInput = scnr.nextInt();
		
		while ((numInput < 1000) || (numInput > 9999)) {
			System.out.print("Please enter a four-digit number: ");
			numInput = scnr.nextInt();
		}
		
		a = (numInput / 1000) + 7;
		b = (numInput % 1000) / 100 + 7;
		c = (numInput % 100) / 10 + 7;
		d = (numInput % 10) + 7;
		
		a = a % 10;
		b = b % 10;
		c = c % 10;
		d = d % 10;
		numEncrypt = c * 1000 + d * 100 + a * 10 + b;
		
		System.out.println("The encrypted number is: " + numEncrypt);
		
		scnr.close();
	}

}
