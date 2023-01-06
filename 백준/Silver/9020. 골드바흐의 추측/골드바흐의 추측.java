
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		try(BufferedReader br= new BufferedReader(new InputStreamReader(System.in))) {
			int num = Integer.parseInt(br.readLine());
			for(int i = 0; i<num; i++) {
				int n = Integer.parseInt(br.readLine());
				ArrayList<Integer> list = pList(n);
				
				int a=0;
				int b=0;
				for(int tmp : list) {
					int rst = n-tmp;
					if(a==0) {
						a=tmp;
					}
					if(b==0) {
						b=rst;
					}
					if(list.indexOf(rst)!=-1) {
						if(Math.abs(tmp-rst)<Math.abs(a-b)) {
							a=tmp;
							b=rst;
						}
						
					}
				}
				System.out.println(a+" "+b);
			}
			
		} catch (Exception e) {

		}
		
	}

	private static ArrayList<Integer> pList(int num) {
		boolean[] arr= new boolean[num+1];{arr[0]=true; arr[1]=true;};
		ArrayList<Integer> list = new ArrayList<Integer>();
		 for(int i = 1; i<=num; i++) {
			 if(!arr[i]) {
				 list.add(i);
				 for(int j= 2; j*i<=num; j++) {
					 arr[i*j]=true;
				 }
			 }
			
		 }
//		for(int i = num+1; i<arr.length; i++) {
//			if(!arr[i]) {
//				list.add(i);
//			}
//		}
		
		return list;
	}

}
