import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			String str = br.readLine();
			int num = Integer.parseInt(br.readLine());
			bw.write(str.charAt(num-1));
			bw.flush();
			
			
		}catch(Exception e) {
			
		}
		
	}

}
