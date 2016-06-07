package Exer_7;

import java.util.Scanner;

public class Paragraph {

	private static void _a(String paragraph){
			
		String[] str = paragraph.split("a");
		System.out.println("The number of characters 'a' in paragraph is " + (str.length - 1));
	}
	
	private static void _b(String paragraph){
		String para, para1;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		para = input.nextLine();
		para1 = paragraph;
		
		int i = 0;
		while(para1.contains(para)){
			i++;
			para1 = para1.substring(para1.indexOf(para) + para.length());
		}
		if(i!=0)
			System.out.println("String '" + para + "' inside paragraph '" + paragraph + "' " + i + " times.");
		else
			System.out.println("String '" + para + "' not inside paragraph '" + paragraph + "'.");
	}
	
	private static void _c(String paragraph){
		paragraph = paragraph.trim();
		String[] str = paragraph.split(" ");
		System.out.println("The paragraph have " + str.length + " words.");
	}
	
	public static void main(String[] args) {
		String paragraph;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a paragraph: ");
		paragraph = input.nextLine();
		
		System.out.println("a)");
		_a(paragraph);
		
		System.out.println("\nb)");
		_b(paragraph);
		
		System.out.println("\nc)");
		_c(paragraph);
		
	}

}
