
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			int num = Integer.parseInt(br.readLine());
			
			for(int i = 0; i< num; i++) {
				check(br.readLine());
			}
			
			
			
		}catch(Exception e) {
			
		}
		
		
		
		
		
	}

	public static void check(String ox) {
		int rst = 0;
		int cnt = 0;
		
		for(int i = 0; i<ox.length(); i++) {
			if(ox.charAt(i)=='O') {
				rst+= cnt+1;
				cnt++;
				
			}else {
				cnt=0;
			}
		}
		
		System.out.println(rst);
		
		
		
	}
	
	
}