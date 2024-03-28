
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String line = br.readLine();

            char[] charArray = line.toCharArray();
            int[] intArr = new int[26];
            for(char c : charArray){
                int i = (int) c - 97;
                intArr[i] = intArr[i] +1;
            }
            for(int i : intArr){
                System.out.print(i + " ");
            }
        } catch (IOException e) {
        }

    }
}
