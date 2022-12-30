
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		printN(num);
	}

	public static void printN(int num) {
		int a = num/10;
		int b = num%10;
		int c = 10*b+(a+b)%10;
		
		int count = 1;
		while(num!=c) {
			if(c!=num) {
				count++;
				a=c%10;
				b= (c/10+c%10)%10;
				c= 10*a+b; 
			}
			
		}
		System.out.println(count);
		
	}
}
