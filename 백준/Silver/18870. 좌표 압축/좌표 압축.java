
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int num = Integer.parseInt(br.readLine());
			int[] arr = new int[num];
			int[] sortA = new int[num];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i<num; i++) {
				sortA[i]=arr[i]=Integer.parseInt(st.nextToken());
			
			}
			Arrays.sort(sortA);
			HashMap<Integer, Integer> rankMap = new HashMap<>();
			int rank = 0;
			for(int tmp : sortA) {
				if(!rankMap.containsKey(tmp)) {
					rankMap.put(tmp, rank);
					rank++;
				}
			}
			StringBuilder sb = new StringBuilder();
			for(int tmp : arr) {
				sb.append(rankMap.get(tmp)).append(" ");
			}
			String str = sb.toString();
			System.out.println(str);
		} catch (Exception e) {

		}
	}

}
