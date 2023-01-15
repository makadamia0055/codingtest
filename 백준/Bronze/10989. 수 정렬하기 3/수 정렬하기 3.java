
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
			int max = 0;
			int[] arr = new int[num];
			for(int i = 0; i<num; i++) {
				int tmp=Integer.parseInt(br.readLine());
				arr[i]=tmp;
				if(max<tmp) {
					max=tmp;
				}
			}
			int[] count = new int[max+1];
			for(int i= 0; i<num; i++) {
				count[arr[i]]++;
			}
//			int[] rst = new int[num];
			int index = 0;
			for(int i = 1; i<=max; i++) {
				for(int j= 0; j<count[i]; j++) {
					bw.write(""+ i);
					bw.newLine();
//					rst[index]=i;
//					index++;
				}
			}
			bw.flush();
			
			
			
			
			
		}catch(Exception e) {
			
		}
		
	}

}
