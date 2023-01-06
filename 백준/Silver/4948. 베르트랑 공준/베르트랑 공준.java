
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try(BufferedReader br= new BufferedReader(new InputStreamReader(System.in))) {
			int num = Integer.parseInt(br.readLine());
			while(num!=0) {
				
				boolean[] arr= new boolean[2*num+1];{arr[0]=true; arr[1]=true;};
				 for(int i = 1; i<=2*num; i++) {
					 if(!arr[i]) {
						 for(int j= 2; j*i<=2*num; j++) {
							 arr[i*j]=true;
						 }
					 }
					
				 }
				int count = 0;
				for(int i = num+1; i<arr.length; i++) {
					if(!arr[i]) {
						count++;
//						System.out.println(i);
					}
				}
				System.out.println(count);
				
				
				
				num=Integer.parseInt(br.readLine());
			}
			
		} catch (Exception e) {

		}
		
	}

}
