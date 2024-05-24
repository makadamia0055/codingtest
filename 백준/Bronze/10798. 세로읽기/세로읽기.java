
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            List<char[]> list = new ArrayList<>();
            int maxLength = 0;
            for (int i = 0; i <5 ; i++) {
                char[] charArray = br.readLine().toCharArray();
                maxLength = Math.max(maxLength, charArray.length);
                list.add(charArray);
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < maxLength; i++) {
                for (int j = 0; j < 5; j++) {
                    char[] chars = list.get(j);
                    if(chars.length>i){
                        sb.append(chars[i]);
                    }

                }

            }
            bw.write(sb.toString());
            bw.flush();

        }catch (Exception e){

        }
    }
}
