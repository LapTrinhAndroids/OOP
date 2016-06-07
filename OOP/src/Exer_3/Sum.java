package Exer_3;

import java.util.Scanner;

public class Sum {
	public static void main(String[] argv){
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter n:");
		int n = input.nextInt();
		
		int Sum = 0;
		for (int i = 1; i <= n; i++) {
			Sum += Math.pow(i, 2);
		}
		System.out.println("Sum is " + Sum);
	}
}
