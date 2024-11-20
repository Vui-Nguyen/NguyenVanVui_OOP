package benhNhan;

import java.util.Scanner;

public class BenhNhan extends Nguoi {
	protected String tienSu;
	protected String chanDoan;
	protected BenhVien benhVien;
	public BenhNhan() {
		super();
	}
	public BenhNhan(String tienSu, String chanDoan, BenhVien benhVien,String ten, int tuoi, char gioiTinh) {
		super(ten, tuoi, gioiTinh);
		this.tienSu = tienSu;
		this.chanDoan = chanDoan;
		this.benhVien = benhVien;
	}
	public String getTienSu() {
		return tienSu;
	}
	public void setTienSu(String tienSu) {
		this.tienSu = tienSu;
	}
	public String getChanDoan() {
		return chanDoan;
	}
	public void setChanDoan(String chanDoan) {
		this.chanDoan = chanDoan;
	}
	public BenhVien getBenhVien() {
		return benhVien;
	}
	public void setBenhVien(BenhVien benhVien) {
		this.benhVien = benhVien;
	}
	
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		super.nhap();
		System.out.println("nhap tien su cua benh nhan");
		tienSu=sc.nextLine();
		System.out.println("nhap chuan doan cua bac si ");
		chanDoan=sc.nextLine();
		System.out.println("nhap thong tin ve benh vien");
		BenhVien b=new BenhVien();
		b.nhap();
	}
}
