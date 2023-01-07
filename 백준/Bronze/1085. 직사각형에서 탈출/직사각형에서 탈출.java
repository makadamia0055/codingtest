
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		StringTokenizer st = new StringTokenizer(str);
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int min = Math.min(Math.min(Math.abs(w-x), x), Math.min(Math.abs(h-y), y));
		System.out.println(min);
	}

}
