package benhNhan;

import java.util.Scanner;

public class Nguoi {
	protected String ten;
	protected int tuoi;
	protected char gioiTinh;
	public Nguoi() {
	}
	public Nguoi(String ten, int tuoi, char gioiTinh) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public char getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(char gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	
	public void nhap() {
		Scanner nhap=new Scanner(System.in);
		System.out.println("nhap ten cua benh nhan");
		ten=nhap.nextLine();
		System.out.println("nhap tuoi cua benh nhan");
		tuoi=nhap.nextInt();
		nhap.nextLine();
		System.out.println("nnhap gio tinh cua benh nhan");
		gioiTinh=nhap.next().charAt(0);
		nhap.nextLine();
	}
	@Override
	public String toString() {
		return "Nguoi [ten=" + ten + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + "]";
	}
	
	

}
