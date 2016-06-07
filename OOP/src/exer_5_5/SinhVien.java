package exer_5_5;

import java.util.Scanner;

public class SinhVien {
	private long mssv;
	private String ho_ten;
	private String diachi;

	public long getMssv() {
		return mssv;
	}

	public void setMssv(long mssv) {
		this.mssv = mssv;
	}

	public String getHo_ten() {
		return ho_ten;
	}

	public void setHo_ten(String ho_ten) {
		this.ho_ten = ho_ten;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getSodienthoai() {
		return sodienthoai;
	}

	public void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}

	public float getDiem_1() {
		return diem_1;
	}

	public void setDiem_1(float diem_1) {
		this.diem_1 = diem_1;
	}

	public float getDiem_2() {
		return diem_2;
	}

	public void setDiem_2(float diem_2) {
		this.diem_2 = diem_2;
	}

	public float getDiem_thi() {
		return diem_thi;
	}

	public void setDiem_thi(float diem_thi) {
		this.diem_thi = diem_thi;
	}

	private String sodienthoai;
	private float diem_1;
	private float diem_2;
	private float diem_thi;

	public float Xuly() {
		return (float) (((float) (diem_1 + diem_2 * 2) / 3) * (0.3) + (float) diem_thi * (0.7));
	}

	public String toString() {
		return "Mssv: " + mssv + "	Ho ten: " + ho_ten + "	Dia chi: " + diachi + "	So dien thoai: " + sodienthoai
				+ "	Diem trung binh: " + Xuly();
	}

	public void Nhap(){
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner input2 = new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("\nMssv: ");
		this.mssv = (input.nextLong());

		System.out.println("Ho ten: ");
		this.ho_ten = (input1.nextLine());

		System.out.println("Dia chi: ");
		this.diachi =(input1.nextLine());

		System.out.println("So dien thoai:");
		this.sodienthoai = (input1.nextLine());

		System.out.println("Diem thi he so 1: ");
		this.diem_1 = (input2.nextFloat());

		System.out.println("Diem thi he so 2: ");
		diem_2 = (input2.nextFloat());

		System.out.println("Diem thi: ");
		diem_thi = (input2.nextFloat());

	}

}
