import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String num = scan.nextLine();
		StringTokenizer st = new StringTokenizer(num);
		String str1 = st.nextToken();
		String str2 = st.nextToken();
		int num1 = reverse(str1);
		int num2 = reverse(str2);
		System.out.println((num1>num2)?num1:num2);

		
	}
	
	public static int reverse(String num) {
		StringBuilder sb = new StringBuilder(num);
		sb.reverse();
		return Integer.parseInt(sb.toString());
		
	}

}
