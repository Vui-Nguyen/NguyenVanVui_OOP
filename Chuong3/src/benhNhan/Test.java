package benhNhan;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n;
	do {
		System.out.println("nhap so luong cua benh nhan trong khong tu [2,5]");
		n=sc.nextInt();
		sc.nextLine();
	}
	while(n<2 || n>5);
	
	BenhNhan[] p=new BenhNhan[n];
	for(BenhNhan a:p) {
		a=new BenhNhan();
		a.nhap();
	}
	for(BenhNhan a:p) {
		System.out.println(a);
	}

}}
