import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int max = num;
		int count = 1;
		
		for(int i = 2; i <= 9; i++) {
			num = scan.nextInt();
			if(max<num) {
				max= num;
				count = i;
			}
		}
		System.out.println(max+"\n"+count);
		
		
	}

}
