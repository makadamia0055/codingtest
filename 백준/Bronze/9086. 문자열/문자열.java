import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            String firstLine = br.readLine();
            StringTokenizer st = new StringTokenizer(firstLine);

            int n = Integer.parseInt(st.nextToken());


            for(int i= 0; i<n; i++){
                String newLine = br.readLine();
                bw.write(newLine.charAt(0)+"");
                bw.write(newLine.charAt(newLine.length()-1)+"\n");
                

            }

            
            bw.flush();


        }catch (Exception e){

        }
    }
}
