
public class Main {

	public static void main(String[] args) {
		
		
		boolean[] arr = new boolean[10001];
		
		
		for(int i= 1; i< 10001; i++) {
			int n = check(i);
			
			if(n<10001) {
			arr[n] = true;
			}
		}
		
		for(int i = 1; i<10001; i++) {
			if(arr[i]==false) {
				System.out.println(i);
			}
		}
		
		
		
	}
	
	
	public static int check(int num) {
		int index = (int) Math.log10(num);
		int mod = 0;
		int rst = num;
		
		for(int i = 0; i<index+1; i++) {
			 mod = num%10;
			 rst += mod;
			 num=num/10;
		}
		return rst;
		
	}
	
	

}
