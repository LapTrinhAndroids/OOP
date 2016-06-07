package Exer_6;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap so tien la boi so cua 1000: ");
		long money = input.nextLong();
		while(money%1000!=0){
			System.out.println("Nhap lai so tien phai la boi so cua 1000: ");
			money = input.nextLong();
		}
		int sum = (int) money;
		for(int i = 0; i <= (money/1000);i++){
			for(int j = 0; j<= (money/2000);j++){
				for(int o = 0 ; o <= (money/3000); o++){
					if((1000*i + 2000*j + 3000*o) == money)
					{
						if(sum < (i + j +o))
						{
							sum = i + j + o;
						}
					}
				}
			}
		}
		
		ArrayList<Integer> x = new ArrayList<Integer>();
		ArrayList<Integer> y = new ArrayList<Integer>();
		ArrayList<Integer> z = new ArrayList<Integer>();
		
		for(int i = 0; i <= (money/1000);i++){
			for(int j = 0; j<= (money/2000);j++){
				for(int o = 0 ; o <= (money/3000); o++){
					if ((i +  j + o) == sum) {
						x.add(i);
						y.add(j);
						z.add(o);
					}
				}
			}
		}
		
		for (int i = 0; i < x.size(); i++) {
			System.out.println("Cach " + (i + 1) + ": " + money + " = " + x.get(i) + " * 1000 + " + y.get(i) + " * 2000 + " + z.get(i) + " *3000");
		}
		
	}

}
