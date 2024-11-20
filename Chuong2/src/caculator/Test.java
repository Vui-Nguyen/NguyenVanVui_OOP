package caculator;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int a,b;
		Scanner nhap=new Scanner(System.in);
		System.out.println("a=");
		a=nhap.nextInt();
		nhap.nextLine();
		System.out.println("b=");
		b=nhap.nextInt();
		nhap.nextLine();
		System.out.println("tong a+b ="+(a+b)+"\n a-b="+(float)(a-b)+"\n a*b="+(a*b)+"\n a/b="+(float)(a/b));
		nhap.close();
	}
	}


