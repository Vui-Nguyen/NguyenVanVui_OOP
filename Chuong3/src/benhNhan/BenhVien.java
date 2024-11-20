package benhNhan;

import java.util.Scanner;

public class BenhVien {
protected String ten;
protected String diaChi;
protected String giamDoc;


public BenhVien() {
}

public BenhVien(String ten, String diaChi, String giamDoc) {
	this.ten = ten;
	this.diaChi = diaChi;
	this.giamDoc = giamDoc;
}

public String getTen() {
	return ten;
}

public void setTen(String ten) {
	this.ten = ten;
}

public String getDiaChi() {
	return diaChi;
}

public void setDiaChi(String diaChi) {
	this.diaChi = diaChi;
}

public String getGiamDoc() {
	return giamDoc;
}

public void setGiamDoc(String giamDoc) {
	this.giamDoc = giamDoc;
}

public void nhap() {
	Scanner nhap=new Scanner(System.in);
	System.out.println("nhap ten cua benh vien");
	ten=nhap.nextLine();
	System.out.println("nhap dia chi cua benh vien");
	diaChi=nhap.nextLine();
	System.out.println("nhap ten cua giam doc");
	giamDoc=nhap.nextLine();
	
}

@Override
public String toString() {
	return "BenhVien [ten=" + ten + ", diaChi=" + diaChi + ", giamDoc=" + giamDoc + "]";
}


}
