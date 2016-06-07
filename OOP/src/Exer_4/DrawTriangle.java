package Exer_4;

import java.util.Scanner;

public class DrawTriangle {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("De hinh ve dep vui long nhap theo yeu cau sau: \n	Chieu cao*2 = Canh day + 1 \n\nNhap chieu cao: ");
		int h = input.nextInt();
		System.out.println("Nhap canh day: ");
		int a = input.nextInt();;
		
		while(a != (h*2-1)){
			System.out.println("Nhap lai canh day: ");
			a = input.nextInt();
		}
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < a; j++) {
				if(j >= ((a/2) - i) && j <= ((a/2) + i))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			
		}
	}

}
