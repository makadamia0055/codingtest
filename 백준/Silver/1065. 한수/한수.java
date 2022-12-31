import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
//		System.out.println(check(num));
		
		int cnt = 0;
		for(int i= 1; i<=num; i++) {
			
			if(check(i)) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		
	}
	
	public static boolean check(int num) {
		if(num<100) {
			return true;			
		}
		int one = num%10;
		int ten = (num/10)%10;
		int hund = ((num/10)/10)%10;
		
		if(ten-one==hund-ten) {
			if(num==1000) {
				int thous = (((num/10)/10)/10)%10;
				if(thous-hund==hund-ten) {
					return true;
				}else {
					return false;
				}
			}else {
				return true;
			}
		}else {
			return false;
		}
		
				
	}
}