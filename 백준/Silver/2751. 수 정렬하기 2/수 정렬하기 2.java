
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			int num = Integer.parseInt(br.readLine());
			ArrayList<Integer> list = new ArrayList<>();
			for(int i= 0 ; i<num; i++) {
				list.add(Integer.parseInt(br.readLine()));
				
			}
			Collections.sort(list);
			for(int i :list) {
				bw.write(i + "\n");
				
			}
			
			bw.flush();
		}catch(Exception e) {
			
		}
		
	}

}
