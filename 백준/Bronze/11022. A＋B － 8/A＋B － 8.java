
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
			int num1;
			int num2;
			for(int i = 0; i<totalNum; i++) {
				st = new StringTokenizer(br.readLine());
				num1 = Integer.parseInt(st.nextToken());
				num2 = Integer.parseInt(st.nextToken());
				bw.write("Case #"+(i+1)+": "+num1 +" + " + num2+" = "+ (num1+num2)+"\n");
				
			}
			bw.flush();
			
			
			
		}catch(Exception e) {
			
			
			
		}
		
	}

}
