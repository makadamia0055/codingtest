
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int num = Integer.parseInt(br.readLine());
			ArrayList<Integer> list = new ArrayList<>();
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i< num; i++) {
				list.add(Integer.parseInt(st.nextToken()));
			}
			Collections.sort(list);
			int sum = 0;
			for(int i = 1; i<=num; i++) {
				sum+=list.get(i-1)*(num+1-i);
			}
			System.out.println(sum);
		} catch (Exception e) {
			
		}
	}

}
