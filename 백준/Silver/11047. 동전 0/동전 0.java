
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			StringTokenizer st= new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			int[] arr = new int[num];
			int sum = 0;
			for(int i = 0 ; i<num ; i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}
			
						for(int i = num - 1; i >= 0; i--) {
	 
				// 현재 동전의 가치가 K보다 작거나 같아야지 구성가능하다.
				if(arr[i] <= k) {
					// 현재 가치의 동전으로 구성할 수 있는 개수를 더해준다.
					sum += (k / arr[i]);
					k = k% arr[i];
				}
			}
			
			System.out.println(sum);
			
		} catch (Exception e) {
			
		}
	}
	
}
