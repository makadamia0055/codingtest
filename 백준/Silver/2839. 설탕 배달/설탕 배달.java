
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		mod(num);
		
		
	}

	private static void mod(int num) {

		if(num%5==0) {
			
			System.out.println(num/5);
			
		}else {
		
			int five = num/5;
			int three = 0;
			for(int i = 0 ; ;i++) {
				if((num-five*5)%3==0) {
					three =(num-five*5)/3; 
					System.out.println(five+three);
					return;
				}else {
					five--;
				
					if(five<0) {
						System.out.println(-1);
						return;
					}
				}
								
			}
			
		}
		
	}

}
