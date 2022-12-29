import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			
			int num = Integer.parseInt(br.readLine());
			for(int i = 0; i<num; i++) {
				for(int j= 0; j<=i; j++) {
					bw.append('*');
				}
				bw.newLine();
			}
			
			
		}catch(Exception e) {
			
		}
		
		
		
	}

}
