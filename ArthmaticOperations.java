//package firstprogram;
import java.util.Scanner;
public class ArthmaticOperations {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number A");
		int A=sc.nextInt();
		System.out.println("Enter a number B");
		int B=sc.nextInt();
		int Sum=A+B;
		System.out.println("Sum=");
		System.out.println(Sum);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);

	}

}
