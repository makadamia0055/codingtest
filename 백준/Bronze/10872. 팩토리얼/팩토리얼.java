
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(pactorial(num));
	}
	
	public static int pactorial(int num) {
		if(num==0) {
			return 1;
		}
		return num*pactorial(num-1);
		
	}
}
