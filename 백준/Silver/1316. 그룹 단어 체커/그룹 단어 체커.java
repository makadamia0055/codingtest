import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static int count = 0;
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			int num = Integer.parseInt(br.readLine());
			for(int i = 0; i<num; i++) {
				String str = br.readLine();
				check(str);
			}
			
			System.out.println(count);
			
			
			
		}catch(Exception e) {
			
			
		}
	}
	public static void check(String str) {
		boolean[] arr = new boolean [26];
		char beforeCh = str.charAt(0);
		arr[((int)beforeCh)-97] = true;
		for(int i = 1; i < str.length(); i++) {
			if(beforeCh!=str.charAt(i)) {
				int index = (int)str.charAt(i)-97;
				if(arr[index]) {
					return ;
				}else {
					arr[index] = true;
					beforeCh = str.charAt(i);
				}
			}
			
		}
		count++;
	}
}