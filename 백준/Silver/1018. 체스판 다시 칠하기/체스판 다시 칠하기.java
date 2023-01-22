
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int y = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			String[][] arr = new String[y][x];
			for(int i = 0 ; i<y; i++) {
				String tmp = br.readLine();
				for(int j = 0 ; j<x; j++) {
					arr[i][j] = ""+tmp.charAt(j);
				}
			}
			int min = 64;
			for(int i = 0 ; i<=y-8; i++) {
				for(int j = 0; j<=x-8; j++) {
					String tmp = checkArr(arr, j, i);
					int cnt1 = checkLine(tmp);
					int cnt2 = checkLineReverse(tmp);
					int count = cnt1<cnt2?cnt1:cnt2;
					min = (count<min)?count:min;
				}
			}
			System.out.println(min);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static String checkArr(String[][] arr, int a, int b) {
		StringBuffer sb = new StringBuffer();
		for(int i =b; i<b+8; i++) {
			for(int j = a; j<a+8; j++) {
				sb.append(arr[i][j]);
			}
		}
		String tmp = sb.toString();
		return tmp;
	}
	public static int checkLine(String str) {
		int count = 0;
		char k = str.charAt(0);
		for(int i = 0; i<str.length(); i++) {
			if((i/8)%2==0) {
				if(i%2==0) {
					if(k != str.charAt(i)) {
						count++;
					}
				}else {
					if(k==str.charAt(i)) {
						count++;
					}
				}
			}else {
				if(i%2==0) {
					if(k == str.charAt(i)) {
						count++;
					}
				}else {
					if(k!=str.charAt(i)) {
						count++;
					}
				}
			}
		}
		
		
		return count;
	}
	public static int checkLineReverse(String str) {
		int count = 1;
		char k;
		if(str.charAt(0)=='B') {
			k ='W';
		}else {
			k ='B'; 
		}
		for(int i = 1; i<str.length(); i++) {
			if((i/8)%2==0) {
				if(i%2==0) {
					if(k != str.charAt(i)) {
						count++;
					}
				}else {
					if(k==str.charAt(i)) {
						count++;
					}
				}
			}else {
				if(i%2==0) {
					if(k == str.charAt(i)) {
						count++;
					}
				}else {
					if(k!=str.charAt(i)) {
						count++;
					}
				}
			}
		}
		
		
		return count;
	}
}
