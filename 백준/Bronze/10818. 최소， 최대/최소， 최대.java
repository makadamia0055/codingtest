import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int[] arr = new int[num];
		
		for(int i = 0; i<num ; i++){
			arr[i] = scan.nextInt();
			
		}
		int max = arr[0];
		int min = arr[0];
		for(int i = 0; i<num; i++) {
			max =(max<arr[i])?arr[i]:max;
			min =(min<arr[i])?min:arr[i];
		}
		System.out.println(min+" "+ max);
	}

}
