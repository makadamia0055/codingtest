import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			int ttlNum = Integer.parseInt(br.readLine());
			StringTokenizer st;
			
			for(int i = 0; i<ttlNum ; i++) {
				st = new StringTokenizer(br.readLine());
				int lineNum = Integer.parseInt(st.nextToken());
				
				ArrayList<Integer> list = new ArrayList<>();
								
				for(int j = 0 ; j<lineNum; j++) {
				list.add(Integer.parseInt(st.nextToken()));	
				}
				OptionalDouble od = list.stream().mapToDouble(p->(double)p).average();
				int cnt = 0;
				int avg = (int)od.getAsDouble();
				
				for(int j = 0; j<list.size(); j++) {
					if(list.get(j)>avg) {
						cnt++;
					}	
				}
				
				System.out.println(String.format("%.3f%%", (double)cnt/lineNum*100));
				
				
			}
			
			
			
			
			
			
		}catch(Exception e) {
			e.getMessage();
		}
	}

}