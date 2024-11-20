package input;

import java.util.Scanner;

public class Test {
		public static void main(String[] args) {
			Scanner nhap=new Scanner(System.in);
			int a;
			float b;
			String s;
			System.out.println("nhap 1 so nguyen");
			a=nhap.nextInt();
			nhap.nextLine();
			System.out.println("nhap mot so thuc ");
			b=nhap.nextFloat();
			nhap.nextLine();
			System.out.println("nhap 1 xau ky tu");
			s=nhap.nextLine();
			System.out.println("so nguyen la "+a+"\n so thuc la "+b+"\n xau ky tu la "+s);
			nhap.close();
		}

	}

