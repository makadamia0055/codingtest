
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			int num = Integer.parseInt(br.readLine());
			
			ArrayList<String> list = new ArrayList<>();
			for(int i= 0; i<num; i++) {
			list.add(br.readLine());	
			}
			
			Set<String> set = new HashSet<String>(list);
			list = new ArrayList<String>(set);
			
			
			Comparator<String> nc = new Comparator<String>() {
				
				@Override
				public int compare(String o1, String o2) {
					if(o1.length()!=o2.length()) {
						return o1.length()-o2.length();
					}else {
						return o1.compareTo(o2);
					}
				}
			};
			
			
			
			Collections.sort(list, nc);
			
			for(String tmp: list) {
				System.out.println(tmp);
			}
			
			
		}catch(Exception e) {
			
		}
	}

}
