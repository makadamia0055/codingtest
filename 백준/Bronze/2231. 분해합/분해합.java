
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int index = (int)Math.log10(num);
		
		boolean tf = false;
		for(int i = 1; i<1000000; i++) {
			int sum = i;
			int tmp = i;
			for(int j= (int)Math.log10(i); j>=0; j--) {
				sum+=tmp%10;
				tmp = tmp/10;
			}
			if(sum==num) {
				System.out.println(i);
				tf = true;
				break;
			}
		}
		if(!tf) {
			System.out.println(0);
		}
	}

}
