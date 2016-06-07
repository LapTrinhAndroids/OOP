package exer_5_5;

import java.util.ArrayList;
import java.util.Scanner;

public class QLSinhVien {
	public static void main(String[] argv){
		ArrayList<SinhVien> sv = new ArrayList<SinhVien>();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap so luong sinh vien: ");
		int n = input.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin sinh vien thu " +( i + 1)+":");
			SinhVien a = new SinhVien();
			a.Nhap();
			sv.add(a);
		}
		
		for (int i = 0; i < sv.size(); i++) {
			System.out.println(sv.get(i).toString());
		}
		
	}
}
