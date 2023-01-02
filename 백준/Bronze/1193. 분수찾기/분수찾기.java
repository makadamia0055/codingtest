
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	
	int line = 1;
	int sum = 0;
	while(sum <num) {
		sum+= line;
		line ++;
		
	}
	sum = 0;
	for(int i = 1; i<=line-2; i++) {
		sum += i;
		
	}
	int index = num -sum -1;
	
	/*
	 * 합쳐서 홀수 커짐 y값 시작
	 * 합쳐서 짝수 작아짐 x값 시작
	 */
	if((line-1)%2==0) {
		int x = line -1 -index;
		int y = 1 +index;
		System.out.println(y+"/"+x);
	}else {
		int y = line -1 -index;
		int x = 1 +index;
		System.out.println(y+"/"+x);
	}
	
	}
}
