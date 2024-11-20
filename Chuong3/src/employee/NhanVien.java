package employee;

import java.util.Scanner;

public class NhanVien {
	protected String name;
	protected Address diaChi;
	protected String dob;
	protected char gender;
	public NhanVien() {
	}
	public NhanVien(String name, Address diaChi, String dob, char gender) {
		this.name = name;
		this.diaChi = diaChi;
		this.dob = dob;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(Address diaChi) {
		this.diaChi = diaChi;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void nhap() {
		Scanner nhap=new Scanner(System.in);
		System.out.println("nhap ten");
		name=nhap.nextLine();
		System.out.println("nhap dia chi");
		Address a=new Address();
		a.nhap();
		System.out.println("nhap ngay sinh ");
		dob=nhap.nextLine();
		System.out.println("nhap gioi tinh ");
		gender=nhap.next().charAt(0);
		nhap.nextLine();
		nhap.close();
	}
	@Override
	public String toString() {
		return "NhanVien [name=" + name + ", diaChi=" + diaChi + ", dob=" + dob + ", gender=" + gender + "]";
	} 

}
