
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			String num1 = st.nextToken();
			String num2 = st.nextToken();
			
			StringBuilder sb1 = new StringBuilder(num1);
			StringBuilder sb2 = new StringBuilder(num2);
			sb1.reverse();
			sb2.reverse();
			
			
			if(sb1.length()!=sb2.length()) {
				while(sb1.length()!=sb2.length()) {
					if(sb1.length()>sb2.length()) {
						sb2.append(0);
					}else if(sb2.length()>sb1.length()) {
						sb1.append(0);
					}
				}
			}
			StringBuilder sb3 = new StringBuilder();
			boolean upper = false;
			for(int i = 0; i<Math.max(sb1.length(), sb2.length()); i++) {
				int iNum1 = Integer.parseInt(""+sb1.substring(i).charAt(0));
				int iNum2 = Integer.parseInt(""+sb2.substring(i).charAt(0));
				int sum = iNum1+iNum2;
				if(upper) {
					sum+=1;
					upper=false;
				}
				
				if(sum>=10) {
					sum-=10;
					upper=true;
				}
				sb3.append(sum);
				
				
			}
			if(upper) {
				sb3.append(1);
			}
			
			sb3.reverse();
			System.out.println(sb3.toString());
			
			
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
