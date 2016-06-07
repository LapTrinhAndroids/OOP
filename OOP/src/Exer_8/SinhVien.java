package Exer_8;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class SinhVien {
	private String mssv;
	private String ho_ten;
	private String diachi;
	private Date ngaysinh;
	private float diemtrungbinh;
	private String email;
	public String getMssv() {
		return mssv;
	}
	public void setMssv(String mssv) {
		if(mssv.length() == 8)
			this.mssv = mssv;
		else
			this.mssv = null;
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
	public Date getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public float getDiemtrungbinh() {
		return diemtrungbinh;
	}
	public void setDiemtrungbinh(float diemtrungbinh) {
		if(Math.round(diemtrungbinh*10)/10 >= 0.0 && Math.round(diemtrungbinh*10)/10 <= 10.0)
			this.diemtrungbinh = diemtrungbinh;
		else
			this.diemtrungbinh = -1.0f;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email.contains(" ")!= true && email.contains("@"))
			this.email = email;
		else
			this.email = null;
	}
	public SinhVien(String mssv, String ho_ten, String diachi, Date ngaysinh, float diemtrungbinh, String email) {
		super();
		this.mssv = mssv;
		this.ho_ten = ho_ten;
		this.diachi = diachi;
		this.ngaysinh = ngaysinh;
		this.diemtrungbinh = diemtrungbinh;
		this.email = email;
	}
	public SinhVien() {
		super();
	}
	
	private Date convertToDate(String str){
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date ngay_s = null;
		try{
			ngay_s = dateFormat.parse(str);
			
		}catch(ParseException e){
			e.printStackTrace();
		}
		return ngay_s;
	}
	
	public void Nhap(){
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("\nMssv: ");
		this.mssv = (input1.nextLine());
		while(this.mssv.length() != 8){
			System.out.println("\nPlease enter again Mssv have length = 8 characters: ");
			this.mssv = (input1.nextLine());
		}

		System.out.println("Ho ten: ");
		this.ho_ten = (input1.nextLine());
		this.ho_ten.trim();

		System.out.println("Dia chi: ");
		this.diachi =(input1.nextLine());

		System.out.println("Diem trung binh: ");
		this.diemtrungbinh = (input.nextFloat());
		while(this.diemtrungbinh < 0.0 && this.diemtrungbinh > 10.0)
		{
			System.out.println("\nPlease enter again 0.0 <= diem trung binh <= 10.0 ");
			this.diemtrungbinh = (input.nextFloat());
		}

		System.out.println("Ngay sinh (MM/dd/yyyy)): ");
		String str = input1.nextLine();
		this.ngaysinh = convertToDate(str);

		System.out.println("Email: ");
		email = input1.nextLine();
		while(this.email.indexOf(" ")!= -1 && this.email.indexOf("@")!=0){
			System.out.println("\nPlease enter again email have character '@' and haven't character 'space': ");
			email = input1.nextLine();
		}

	}
	
	public String getTen(){
		if(this.ho_ten!=null){
			
			String[] str = this.ho_ten.split(" ");
			return str[str.length-1];
		}
		return null;
	}
	
	public boolean Tuoi(){
		
		Calendar c = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c2.setTime(this.ngaysinh);
		int age = c.get(Calendar.YEAR) - c2.get(Calendar.YEAR);
		if(c.get(Calendar.DAY_OF_YEAR) <= c2.get(Calendar.DAY_OF_YEAR))
			age--;
		if(age >= 20)
		{
			return true;
		}
		return false;
	}
	public String toString(){
		return "Mssv: " + this.mssv + "	Ho ten: " + this.ho_ten + "	Dia chi: " + this.diachi + "	Diem trung binh: " +this.diemtrungbinh +"	Ngay sinh: " + this.ngaysinh + "	Email: " + this.email;
	}
		
}
