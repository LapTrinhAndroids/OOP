package Exer_1;

import java.util.Scanner;

public class Exer_1 {
	private static double Nhap(){
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		double A = 0;
		System.out.println("Enter n: ");
		int n = input.nextInt();
		
		for (int i = 1; i <= n; i++) {
			A += Math.cos(i);
		}
		return A;
	}
	//test
	public static void main(String[] argv){
		System.out.println("A = " + Nhap());
		
	}
}
