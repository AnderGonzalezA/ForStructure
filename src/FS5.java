import java.util.Scanner;
public class FS5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a number");
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		int x = 0;
		for (long i=a;i>1;i--) {
			if (a!=i && a % i == 0) {
				x++;
			}
		}
		if (x==0){
			System.out.println("The number is prime");
		}else {
			System.out.println("The number isn't prime");
		}
		sc.close();
	}
}