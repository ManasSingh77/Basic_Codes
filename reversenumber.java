package Basic_codes;
import java.util.Scanner;
public class reversenumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int reverse=0;
		while(a>0) {
			int rem=a%10;
			reverse=reverse*10+rem;
			a=a/10;
		}
		System.out.println(reverse);
	}

}
