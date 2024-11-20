package sum;
// bai 8 va bai 9
public class Test {

	public static void main(String[] args) {
		int sum=0;
		for(int i=2;i<=100;i+=2) {
			sum=sum+i;
		}
		int sum2=0;
		for(int i=1;i<100;i+=2) {
			sum2+=i;
		}
	System.out.println("tong so chan [1,100] la"+sum +"\n tong so le trong [1;100] la"+sum2);
	}

}
