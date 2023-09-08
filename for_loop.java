
public class for_loop {

	public static void main(String[] args) {
		int n=5;
		int count=0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("PRIME NUMBER");
		}
		else {
			System.out.println("NOT A PRIME NUMBER");
		}
	}

}
