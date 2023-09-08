package firstprogram;

public class whileloop {

	public static void main(String[] args) {
		int n=2348;
		int sum=0;
	
		while(n>=1) {
			sum=sum*10+(n%10);
			
			n=n/10;
		}
		System.out.println(sum);

	}

}
