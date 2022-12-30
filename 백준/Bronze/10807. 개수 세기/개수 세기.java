import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int[] arr = new int[num];
		
		for(int i = 0 ; i < num ; i++) {
			arr[i] = scan.nextInt();
			
		}
		int dstNum = scan.nextInt();
		int count = 0;
		for(int i= 0 ; i < num ; i++) {
			if(arr[i] == dstNum) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
