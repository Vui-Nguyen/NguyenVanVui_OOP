package hcn;
//bai 10,11
import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	//bai 10
	float a,b;
	Scanner nhap=new Scanner(System.in);
	System.out.println("nhap chieu dai cua hinh chu nhat");
	a=nhap.nextFloat();
	nhap.nextLine();
	System.out.println("nhap chieu rong cua hcn");
	b=nhap.nextFloat();
	nhap.nextLine();
	System.out.println("chu vi cua hcn la "+(a+b)+"\n dien tich cua hcn la "+(a*b));

	// bai 11
	float r;
	System.out.println("nhap ban kinh cua hinh tron");
	r=nhap.nextFloat();
	nhap.nextLine();
	System.out.println("dien tich cua hinh tron la " +Math.PI*r*r +"\n chu vi cua hinh tron la"+Math.PI*2*r);
	nhap.close();
}
}
