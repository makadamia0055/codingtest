
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.OptionalDouble;

public class Main {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			ArrayList<Integer> list = new ArrayList<>();
			for(int i = 0; i<5; i++) {
				list.add(Integer.parseInt(br.readLine()));
			}
			Collections.sort(list);
			int midN=list.get(2);
			int avg = (int) list.stream().mapToInt(p->p).average().getAsDouble();
			System.out.println(avg);
			System.out.println(midN);
			
			
			
		} catch (Exception e) {

		}
	}

}
