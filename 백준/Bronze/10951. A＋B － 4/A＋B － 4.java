
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {

		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))	
				){
			
			StringTokenizer st;
			int num1 =-1;
			int num2 =-1;
			String line = "";
			while((line=br.readLine())!=null) {
				st = new StringTokenizer(line);
				num1 = Integer.parseInt(st.nextToken());
				num2 = Integer.parseInt(st.nextToken());
				
					bw.write((num1+num2) +"\n");
				
			
			}
			bw.flush();
			
			
		}catch(Exception e) {
			
		}
	}

}
