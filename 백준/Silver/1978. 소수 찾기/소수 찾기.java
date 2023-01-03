
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			int num = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int primeNumCnt = 0;
			for(int i = 0; i<num; i++) {
				int n = Integer.parseInt(st.nextToken());
				if(primeCheck(n)) {
					primeNumCnt++;
				}
				
			}
			
			System.out.println(primeNumCnt);
			
			
			
			
			
		} catch (Exception e) {
			
		}
	}

	private static boolean primeCheck(int num) {
		int cnt = 0;
		for(int i = 1; i <= num; i++) {
			if(num%i==0) {
				cnt++;
			}
			
			
		}
		
		if(cnt==2) {
			return true;
		}else {
			
			return false;
		}
		
		
		
	}

}
