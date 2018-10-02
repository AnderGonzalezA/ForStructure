import java.util.*;
public class FS4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a number");
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		for (long i=a;i>1;i--) {
			if (a % i == 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}