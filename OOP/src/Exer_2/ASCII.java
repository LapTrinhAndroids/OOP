package Exer_2;

public class ASCII {

	public static void main(String[] args) {
		char c ;
		int i = 0;
		System.out.println("ASCII Table\n");
		while(i<256){
			c = (char)i;
			System.out.println("	" +c);
			i++;
		}
	}

}
