package Basic_codes;
import java.util.Sannner;
public class binary {
	public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        int a=sc.nextInt();
		        int sum=0;
				int mult=1;
				while(a>0) {
					int rem=a%10;
					sum=sum+rem*mult;
					a=a/10;
					mult=mult*2;
				}
		        System.out.print(sum);
	}
}
