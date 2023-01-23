
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			int num = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] arrPlus = new int[10000001];
			int[] arrMinus = new int[10000001];
			for(int i= 0; i<num; i++) {
				int tmp = Integer.parseInt(st.nextToken());
				if(tmp<0) {
					arrMinus[-tmp] ++;
				}else {
					arrPlus[tmp]++;
				}
			}
			int num2 = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			for(int i= 0; i<num2; i++) {
				int tmp = Integer.parseInt(st.nextToken());
				if(tmp<0) {
					bw.write(""+arrMinus[-tmp]+" ");
				}else {
					bw.write(""+arrPlus[tmp]+" ");

				}
			}
			bw.flush();
		}catch (Exception e) {
			
		}
	}

}
