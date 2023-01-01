
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			int num = Integer.parseInt(br.readLine());
			StringTokenizer st;
			
			for(int i= 0; i<num ; i++) {
				st = new StringTokenizer(br.readLine());
				int repeatNum = Integer.parseInt(st.nextToken());
				String str = st.nextToken();
				for(int k = 0 ; k<str.length(); k++) {
					char tmp = str.charAt(k);
					
					for(int j = 0 ; j<repeatNum; j++) {
					System.out.print(tmp);
					}
				}
				System.out.println();

			}
			
			
			
		}catch(Exception e) {
			
		}
		
	}

}
