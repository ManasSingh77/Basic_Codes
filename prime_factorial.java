package Basic_codes;
import java.util.Scanner;
public class prime_factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int prime_fact=1;
		for(int i=1;i<=a;i++) {
			prime_fact=prime_fact*i;
		}
		System.out.println(prime_fact);
	}

}
