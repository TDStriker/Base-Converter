package BaseConverter;

import java.util.Scanner;

public class BaseConverter {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		
		String reply;
		int digits;
		int base; 
		int total = 0;
		
		
		System.out.println("Enter a number");
		reply = input.nextLine();
		digits = reply.length();
		char[] number = new char[reply.length()];
		
		System.out.println("Enter a base");
		base = input.nextInt();
		
		for(int i = 0; i < digits; i++) {
			number[i] = reply.charAt(i);			
		}
		
		for(int i = 0; i < digits; i++) {
			int value;
			value = number[i] - 48;			
			if(value >= 10) {
				value = value - 7;
			}
			if(value >= base) {
				System.out.println("Number does not fit base");
				
			}
			total = total + (value * (int)(Math.pow(base, (digits - 1) - i)));
			
		}
		System.out.println("Your number in base 10 is " + total);
		input.close();
	}
}
