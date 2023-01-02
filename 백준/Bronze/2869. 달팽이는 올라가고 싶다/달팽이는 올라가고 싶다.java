
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			
//			int day = 1;
			
//			while(v>(a-b)*(day)+b) {
//				day++;
//			}
			
			
			
			if((v-b)%(a-b)!=0) {
				System.out.println(((v-b)/(a-b))+1);
			}else {
				
				System.out.println((v-b)/(a-b));
			}
				
			
			
			
			
			
		} catch (Exception e) {

		}
		
		
		
		
		
		
	}

}
