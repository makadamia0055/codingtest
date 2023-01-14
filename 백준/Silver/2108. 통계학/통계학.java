

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int num = Integer.parseInt(br.readLine());
			ArrayList<Integer> list = new ArrayList<>();
			int[] arr = new int[8001];
			for(int i= 0; i< num ; i++) {
				int tmp =Integer.parseInt(br.readLine()); 
				list.add(tmp);
				int index = tmp+4000;
				arr[index]++;
			}
			double avg = list.stream().mapToDouble(t -> (double)t ).average().getAsDouble();	
			int avgN = (int) Math.round(avg);
			System.out.println(avgN);
			
			Collections.sort(list);
			System.out.println(list.get((num/2)));
				
			int scd = 0;
			int scdIndex = 8000;
			int max = 0;
			int maxIndex = 8000;
			for(int i = 8000; i>=0; i--) {
				int cnt = arr[i];
				if(cnt>=max) {
					scd=max;
					scdIndex=maxIndex;
					max=cnt;
					maxIndex=i;
				}
			}
			if(max==scd) {
				System.out.println((scdIndex-4000));
			}else {
				System.out.println((maxIndex-4000));
			}
			
			
			int maxNum =list.get(0);
			int minNum =list.get(0);
			for(int i = 0; i<list.size(); i++) {
				int tmp = list.get(i);
				if(tmp>maxNum) {
					maxNum=tmp;
				}
				if(minNum>tmp) {
					minNum= tmp;
				}
			}
			System.out.println(maxNum-minNum);
			
			
			
			
		} catch (Exception e) {
			
		}
		
	}
}
