
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {

        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){

            int num = Integer.parseInt(br.readLine());

            for (int i = 1; i <= 2*num -1; i++) {
                int space = Math.abs(num - i);
                String str = "";
                for (int j = 0; j < space; j++) {
                    str+= " ";
                }
                for (int j = 0; j <2*(num-space)-1 ; j++) {
                    str += "*";
                }
                bw.write(str);
                bw.newLine();

            }
            bw.flush();

        }catch (Exception e){

        }





    }
}
