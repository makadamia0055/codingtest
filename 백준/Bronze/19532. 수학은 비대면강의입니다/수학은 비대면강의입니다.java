

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            ){

            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] arr = new int[6];

            for (int i = 0; i < 6; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            for (int i = -999; i <=999 ; i++) {
                for (int j = -999; j <=999 ; j++) {
                    if(arr[0]*i + arr[1]*j == arr[2] &&arr[3]*i + arr[4]*j == arr[5]){
                        System.out.println(i+ " " + j);
                    }
                }
            }




        }catch (Exception e){

        }
    }
}
