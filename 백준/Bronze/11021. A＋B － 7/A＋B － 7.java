
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			int totalNum = Integer.parseInt(br.readLine());
			StringTokenizer st;
			for(int i = 0; i<totalNum; i++) {
				st = new StringTokenizer(br.readLine());
				
				bw.write("Case #"+(i+1)+": "+(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
				
			}
			bw.flush();
			
			
			
		}catch(Exception e) {
			
			
			
		}
		
	}

}
