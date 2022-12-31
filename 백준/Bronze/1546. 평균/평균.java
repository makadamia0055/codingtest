
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.StringTokenizer;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			ArrayList<Integer> list = new ArrayList<>();
			int num = Integer.parseInt(br.readLine());
			StringTokenizer st =new StringTokenizer(br.readLine());
			int max = 0;
			for(int i = 0; i<num; i++) {
				int tmp = Integer.parseInt(st.nextToken());
				list.add(tmp);
				max = (max<tmp)?tmp:max;
				
			}
			final int finalMax = max;
			OptionalDouble rst= list.stream().mapToDouble(p->(double)p/finalMax*100).average();
			
			System.out.println(rst.getAsDouble());
			
			
		}catch(Exception e) {
			
		}
	}

}