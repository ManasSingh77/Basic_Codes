package Basic_codes;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a;
			int d=b;
			while(a!=b) {
				if(a>b) {
					a=a-b;
				}
				else {
					b=b-a;
				}
			}
			System.out.print(c*d/a);

	}

}
