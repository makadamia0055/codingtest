import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * 1 (6*1+6*0)  (6*1+6*1) (6*1+6*2)
		 *      
		 */

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int count = 1;
		long sum = 1;
		while(sum<num) {
			sum += 6*(long)count;
			count++;
		}
		
		System.out.println(count);
	}

}
