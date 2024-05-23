
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {

        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            String str = br.readLine();
            boolean flag = false;

            for (int i = 0; i < str.length()/2 ; i++) {
                if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                    flag = true;
                    break;
                }
            }
            int rst = flag?0:1;
            System.out.println(rst);

        }catch (Exception e){

        }
    }
}
