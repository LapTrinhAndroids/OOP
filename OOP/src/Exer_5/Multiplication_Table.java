package Exer_5;

public class Multiplication_Table {

	public static void main(String[] args) {
		int mul = 1;
		for (int i = 0; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				mul = j*i;
				System.out.printf("%d * %d = %d	",j,i,mul);
			}
			System.out.println();
			
		}
	}

}
