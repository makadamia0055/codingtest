import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(b<c) {
				int count = 0;
				while((long)a>=(long)(c-b)*count) {
					count++;
				}
				System.out.println(count);
			}else {
				System.out.println(-1);
			}
			
			
		}catch(Exception e) {
			
		}
	}

}
