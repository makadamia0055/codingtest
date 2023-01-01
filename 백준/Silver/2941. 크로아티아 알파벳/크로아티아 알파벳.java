import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		
		String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		String[] arr2 = {"č", "ć", "dž", "đ", "lj", "nj", "š", "ž"};
		
		for(int i = 0; i<arr.length; i++) {
			str = str.replaceAll(arr[i], "옹");
		}
		System.out.println(str.length());
		
		
		
		
		
		
		
		
	}

}
