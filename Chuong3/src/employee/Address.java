package employee;

import java.util.Scanner;

//bai 2 bai 3

public class Address {
	protected String thon;
	protected String xa;
	protected String huyen;
	protected String tinh;
	
	
	public Address() {
	}
	public Address(String thon, String xa, String huyen, String tinh) {
		this.thon = thon;
		this.xa = xa;
		this.huyen = huyen;
		this.tinh = tinh;
	}
	public String getThon() {
		return thon;
	}
	public void setThon(String thon) {
		this.thon = thon;
	}
	public String getXa() {
		return xa;
	}
	public void setXa(String xa) {
		this.xa = xa;
	}
	public String getHuyen() {
		return huyen;
	}
	public void setHuyen(String huyen) {
		this.huyen = huyen;
	}
	public String getTinh() {
		return tinh;
	}
	public void setTinh(String tinh) {
		this.tinh = tinh;
	}
	
	public void nhap() {
		Scanner nhap=new Scanner(System.in);
		System.out.println("nhap thon ");
		thon=nhap.nextLine();
		System.out.println("nhap xa ");
		xa=nhap.nextLine();
		System.out.println("nhap huyen ");
		huyen=nhap.nextLine();
		System.out.println("nhap tinh ");
		tinh=nhap.nextLine();
	}
	
	@Override
	public String toString() {
		return "Address [thon=" + thon + ", xa=" + xa + ", huyen=" + huyen + ", tinh=" + tinh + "]";
	}
	
}
