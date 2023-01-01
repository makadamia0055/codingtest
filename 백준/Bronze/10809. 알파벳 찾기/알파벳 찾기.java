import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		check(str);
		
		
		
	}
	
	public static void check(String str) {
		
		for(int i = 0; i < 26; i++) {
			System.out.print(str.indexOf((char)(i+97)) +" ");
		}
		
	}
	

}
