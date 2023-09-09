package Basic_codes;
import java.util.Scanner;
public class armstrong_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int temp=a;
		int count=0;
		while(temp>0) {
			temp=temp/10;
			count=count+1;
		}
		temp=a;
		int sum=0;
		while(temp>0){
			int rem=temp%10;
			for(int i=1;i<=count;i++) {
				rem=rem*rem;
			}
			sum=sum+rem;
			temp=temp/10;
		}
		System.out.println(sum);
		}
	}


