package bai1Person;

import java.util.Scanner;

public class Person {
	protected String name;
	protected String dob;
	protected String pob;
	protected char gender;
	protected String email;
	protected String phone;
	public Person() {
	}
	public Person(String name, String dob, String pob, char gender, String email, String phone) {
		this.name = name;
		this.dob = dob;
		this.pob = pob;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPob() {
		return pob;
	}
	public void setPob(String pob) {
		this.pob = pob;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void nhap() {
		Scanner nhap=new Scanner(System.in);
		System.out.println("Name is :");
		name=nhap.nextLine();
		System.out.println("nhap ngay sinh ");
		dob=nhap.nextLine();
		System.out.println("nhap noi sinh ");
		pob=nhap.nextLine();
		System.out.println("nhap gio tinh");
		gender=nhap.next().charAt(0);
		nhap.nextLine();
		System.out.println("nhap dia chi email");
		email=nhap.nextLine();
		System.out.println("nhap so dien thoai");
		phone=nhap.nextLine();
		nhap.close();		
}
	@Override
	public String toString() {
		return "Person [name=" + name + ", dob=" + dob + ", pob=" + pob + ", gender=" + gender + ", email=" + email
				+ ", phone=" + phone + "]";
	}
	

}
