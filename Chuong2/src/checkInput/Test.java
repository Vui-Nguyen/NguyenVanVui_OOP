package checkInput;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		char k;
		int a,b;
		Scanner nhap=new Scanner(System.in);
		System.out.println("nhap a");
		a=nhap.nextInt();
		nhap.nextLine();
		System.out.println("nhap b");
		b=nhap.nextInt();
		nhap.nextLine();
		do {
			System.out.println("nhap ky tu A ,S, M, D");
			k=nhap.next().charAt(0);
			
		}
		while (k!='A' && k!='S' && k!='M' &&  k!='D');
		switch (k) {
		case 'A':
			{
				System.out.println("a+b="+(a+b));
				break;
			}
		case 'S':
			{
				System.out.println("a-b="+(float)(a-b));
				break;
			}
			
		case 'M':
			{
				System.out.println("a*b="+(a*b));
				break;
			}
		default:
			System.out.println("a/b="+(float)(a/b));
		}
		nhap.close();
	}
	}

