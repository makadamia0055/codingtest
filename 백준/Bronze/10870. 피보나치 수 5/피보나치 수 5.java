import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(check(num));
	}

	public static int check(int num) {
		if(num==0) {
			return 0;
		}else if(num==1) {
			return 1;
		}else {
			return check(num-1)+ check(num-2);
		}
	}
	
}
