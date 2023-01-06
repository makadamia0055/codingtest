import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			int c = Integer.parseInt(br.readLine());
			
			int num =a*b*c;
			String str = ""+num;
			int[] arr = new int[10];
			for(int i = 0; i<str.length(); i++) {
				
				int n = Integer.parseInt(""+str.charAt(i));
				arr[n]++;
				
			}
			for(int tmp : arr) {
				System.out.println(tmp);
			}
			
		}catch (Exception e) {

		}
	}

}
