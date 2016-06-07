package Exer_8;

import java.util.ArrayList;
import java.util.Scanner;

public class TestMain {
	
	public static void main(String[] args) {
		
		ArrayList<SinhVien> sv = new ArrayList<SinhVien>();
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of Student: ");
		int n = input.nextInt();
		
		//_a
		System.out.println("\na)");
		for (int i = 0; i < n; i++) {
			System.out.println("\nEnter information of student " + (i + 1));
			SinhVien a = new SinhVien();
			a.Nhap();
			sv.add(a);
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(sv.get(i).toString());			
		}
		
		//_b
		System.out.println("\nb)");
		int num = 0;
		for (int i = 0; i < sv.size(); i++) {
			if(sv.get(i).getHo_ten().indexOf("Nguyen ") == 0 || sv.get(i).getHo_ten().indexOf("nguyen ") == 0)
			{
				num++;
				System.out.println(sv.get(i).getHo_ten());
			}
		}
		
		if(num == 0)
			System.out.println("Not found the student have lastname is 'Nguyen'.");
		
		//_c
		System.out.println("\nc)");
		float min = 11.0f, max = -1.0f;
		int x = 0,y=0;
		for (int i = 0; i < n; i++) {
			if(sv.get(i).getDiemtrungbinh() > max )
			{
				max = sv.get(i).getDiemtrungbinh();
				x = i;
			}
			if(sv.get(i).getDiemtrungbinh() < min)
			{
				min = sv.get(i).getDiemtrungbinh();
				y=i;
			}
			if(sv.get(i).getDiemtrungbinh() >= 8.0 && sv.get(i).getDiemtrungbinh() <=10.0)
			{
				System.out.println("Student [" + sv.get(i).getHo_ten() + "] has received scholarships!");
			}
		}
		System.out.println("Student ["+ sv.get(x).getHo_ten()+"]with highest GPA.");
		System.out.println("Student ["+ sv.get(y).getHo_ten()+"]with lowest GPA.");
		
		//_d
		System.out.println("\nd)");
		ArrayList<SinhVien> sv_ = new ArrayList<SinhVien>();
		if(sv_!=null){
			sv_.clear();
		}
		x = 0;
		for(int i = 0; i < n ; i++){
			x = i;
			String Min = sv.get(i).getTen();
			for (int j = i + 1 ; j < n; j++) {
				if(sv.get(i).getTen().compareTo(sv.get(j).getTen()) > 0)
				{
					Min = sv.get(j).getTen();
					x = j;
					SinhVien temp = sv.get(i);
					sv.set(i, sv.get(j));
					sv.set(j, temp);
				}
			}
			sv_.add(sv.get(x));
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(sv.get(i).toString());			
		}
		
		// _e
		System.out.println("\ne)");
		for (int i = 0; i < n; i++) {
			if(sv_.get(i).Tuoi())
				System.out.println(sv_.get(i).toString());
			else
				System.out.println("Don't have student > 20 age!");
		}
	}
	
}
