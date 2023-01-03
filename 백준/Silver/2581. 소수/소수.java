
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			
			int m = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			
			int minPNum = 0;
			int sum = 0;
			
			for(int i = m; i<=n;i++) {
				
				if(primeCheck(i)) {
					if(minPNum==0) {
						minPNum= i;
					}
					sum+=i;
				}
				
			}
			
			if(minPNum==0) {
				System.out.println(-1);
			}else {
				System.out.println(sum);
				System.out.println(minPNum);
			}
			
			
			
			
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