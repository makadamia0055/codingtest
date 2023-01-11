
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			String str = br.readLine();
			
			int[] arr = new int[str.length()];
			for(int i = 0; i<str.length(); i++) {
				arr[i]=Integer.parseInt(""+str.charAt(i));
			}
			
			Arrays.sort(arr);
			
			for(int i = str.length()-1; i>=0; i--) {
				System.out.print(arr[i]);
			}
			
			
		}catch(Exception e) {
			
		}
	}

}
