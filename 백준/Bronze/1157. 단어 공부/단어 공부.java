
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		str = str.toUpperCase();
		char[] arr = new char[26];
		

		
		for(int i = 0; i<str.length(); i++) {
			int index = (int)str.charAt(i)-65;
			arr[index]++;
		}
		
		int max = 0;
		int maxIndex = 0;
		for(int i= 0; i<26 ; i ++) {
			if(arr[i]>max) {
				max=arr[i];
				maxIndex = i;
			}
		}
		boolean isDuple = false;
		for(int i = 0; i<26; i++) {
			if(arr[i]==max) {
				if(maxIndex!=i) {
					isDuple=true;
					break;
				}
			}
		}
		
		System.out.println((!isDuple)?(char)(maxIndex+65):"?");
		
	}

}
