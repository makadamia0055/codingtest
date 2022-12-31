
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			int tmp = 0;
			int[] arr = new int[30];
			for(int i = 0 ; i<28; i++) {
				tmp = Integer.parseInt(br.readLine());
				arr[tmp-1] = 1;
				
			}
			
			int cnt = 0;
			int[] rstArr = new int[2];
			for(int i = 0 ; i<30 ; i++) {
				
				if(arr[i]==0) {
					rstArr[cnt] = i+1;
					cnt++;
				}
			}
			Arrays.sort(rstArr);
			
			System.out.println(rstArr[0]);
			System.out.println(rstArr[1]);
			
			
			
		}catch(Exception e) {
			e.getMessage();
		}
	}

}