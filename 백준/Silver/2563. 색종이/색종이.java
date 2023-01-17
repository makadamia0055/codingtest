
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			int num = Integer.parseInt(br.readLine());
			
		int[][] paper = new int[100][100];
		for(int i = 0 ; i<num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			for(int j = 0; j<10; j++) {
				for(int k= 0; k<10; k++) {
					paper[y+j][x+k]++;
				}
			}
		
		}
		int count = 0;
		for(int i = 0; i<100; i++) {
			for(int j= 0; j<100; j++) {
				if(paper[i][j]!=0) {
					count++;
				}
			}
		}
			System.out.println(count);
			
			
		}catch (Exception e) {

		}
	}

}
