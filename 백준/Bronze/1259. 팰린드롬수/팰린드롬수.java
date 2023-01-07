import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String str = br.readLine();
			while(!str.equals("0")) {
				StringBuilder sb = new StringBuilder(str);
				String rvsStr = sb.reverse().toString();
				if(str.equals(rvsStr)) {
					System.out.println("yes");
				}else {
					System.out.println("no");
				}
				str = br.readLine();
			}
			

			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
	}

}
