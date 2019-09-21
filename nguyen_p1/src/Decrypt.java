import java.util.Scanner;

public class Decrypt {
	public 	static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int numInput, numDecrypt;
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
		
		a = numInput / 1000;
		b = (numInput % 1000) / 100 ;
		c = (numInput % 100) / 10;
		d = numInput % 10;
		
		a = (a + 10 - 7) % 10;
		b = (b + 10 - 7) % 10;
		c = (c + 10 - 7) % 10;
		d = (d + 10 - 7) % 10;
		numDecrypt = c * 1000 + d * 100 + a * 10 + b;
		
		System.out.println("The decrypted number: " + numDecrypt);
		scnr.close();
	}
}