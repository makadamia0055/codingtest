
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int m = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			boolean[] arr = new boolean[n+1];{arr[0]=true; arr[1]=true;}
			
			for(int i = 2; i<n+1; i++) {
				if(!arr[i]) {
					for(int j= 2; j<=(n)/i;j++) {
						if(!arr[i*j]) {
						arr[i*j]=true;
						}
					}
				}
			}
			
			for(int i= m; i<n+1; i++) {
				if(!arr[i]) {
					System.out.println(i);
				}
			}
			
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
