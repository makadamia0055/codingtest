
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			while(a+b+c!=0) {
				
				if(a*a+b*b+c*c == 2*Math.max(a, Math.max(b, c))*Math.max(a, Math.max(b, c))) {
					System.out.println("right");
				}else {
					System.out.println("wrong");
				}
				
				st = new StringTokenizer(br.readLine());
				a = Integer.parseInt(st.nextToken());
				b = Integer.parseInt(st.nextToken());
				c = Integer.parseInt(st.nextToken());
				
			}
			
			
			
			
			
		} catch (Exception e) {

		}
		
		
	}

}
