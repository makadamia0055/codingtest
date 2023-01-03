
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		try(BufferedReader br= new BufferedReader(new InputStreamReader(System.in))) {
			
			int testNum = Integer.parseInt(br.readLine());
			
			StringTokenizer st;
			
			for(int i = 0; i<testNum; i++) {
				st = new StringTokenizer(br.readLine());
				int y = Integer.parseInt(st.nextToken());
				int x = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken()) -1;
				
				StringBuilder sb = new StringBuilder();
				sb.append((c%y)+1);
				if((c/y)+1>=10) {
					sb.append((c/y)+1);
				}else {
					sb.append(0);
					sb.append((c/y)+1);
				}
				String str = sb.toString();
				System.out.println(str);
				
			}
			
			
			
			
		} catch (Exception e) {

		}
	}

}
