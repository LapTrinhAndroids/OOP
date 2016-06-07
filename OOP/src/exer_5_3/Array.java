package exer_5_3;

import java.util.Random;
import java.util.Scanner;

public class Array {

	public static void main(String[] argv) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int column, row;
		System.out.println("Enter the number of row = column: ");
		row = input.nextInt();
		column = row;
		
		double[][] array = new double[row][column];
		// Enter the element of array by hand
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < column; j++) {
//				System.out.println("Enter the element [" + i +"][" + j + "]: ");
//				array[i][j] = input.nextInt();
//			}
//		}
		
		// Random element of array by random() function
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = random.nextInt(100);
			}
		}
		
		System.out.println("a)	");
		_a(array);
		
		System.out.println("\nb)	");
		_b(array);
		
		System.out.println("\nc)	");
		_c(array);
		
		System.out.println("\nd)	");
		_d(array);
		
		System.out.println("\ne)	");
		_e(array);
	}
	
	// a)
	private static void _a(double[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
				System.out.print("	");
			}
			System.out.println();
		}
	}
	
	// b)
	private static void _b(double[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (j >= i) {
					System.out.print(array[i][j]);
					System.out.print("	");
				}
				else
					System.out.print("	");
			}
			System.out.println();
		}
	}
	
	// c)
	private static void _c(double[][] array){
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println();
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
			
			System.out.println("[" + i + "] :" + sum);
			sum = 0;
		}
	}
	
	// d)
	private static void _d(double[][] array){
		double sum = 0;
		for (int i = 0; i < array[0].length; i++) {
			System.out.println();
			for (int j = 0; j < array.length; j++) {
				sum += array[j][i];
			}
			System.out.println("[" + i + "] :" + sum);
			sum = 0;
		}
	}
	
	// e)
	private static int partition(double[] array,int left, int right){
		int i = left, j = right;
		double temp;
		double pivot = array[(left + right) / 2];
		
		while(i <= j){
			while(array[i] < pivot)
				i++;
			while(array[j] > pivot)
				j--;
			if( i <= j){
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
			}
		}
		return i;
	}
		
	private static double[] quickSort(double[] array, int left, int right){
		int index = partition(array, left, right);
		if(left < index - 1){
			quickSort(array, left, index-1);
		}
		if(index < right)
			quickSort(array, index, right);
		return array;
	}
	
	private static double[] convert_arrangement(double[][] array){
		int n = 0;
		double[] arr = new double[array.length*array[0].length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				arr[n] = array[i][j];
				n++;
			}
		}
		quickSort(arr, 0, arr.length - 1 );
		return arr;
	}
	
	private static void _e(double[][] array){
		
		double[] arr = convert_arrangement(array);
		int n = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = arr[n];
				n++;
				System.out.print(array[i][j]);
				System.out.print("	");
			}
			System.out.println("");
		}
	}
	
}
