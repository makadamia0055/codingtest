

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) {
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			long a = Long.parseLong(st.nextToken());
			long b = Long.parseLong(st.nextToken());
			long c = Long.parseLong(st.nextToken());
			long rst = a+b+c;
			bw.write(String.valueOf(rst));
			bw.flush();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
