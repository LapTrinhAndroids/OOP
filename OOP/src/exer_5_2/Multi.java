package exer_5_2;

import java.util.Scanner;

public class Multi {
	public static long Multi(int[] array){
		long multi = 1;
		for(int i = 0; i < array.length;i++){
			if(array[i] % 2 == 0 && array[i] > 0){
				multi *= array[i];
			}
		}
		return multi;
	}
	
	public static long Multi_Print(int[] array){
		long multi = 1;
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
			multi *= array[i];
		}
		return multi;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the number element of array: ");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] array = new int[n];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the element " + i + ":");
			array[i] = input.nextInt();
		}
		
		System.out.println("a)	" + Multi(array));
		System.out.print("b)	");
		System.out.println(Multi_Print(array));
}
	
}
