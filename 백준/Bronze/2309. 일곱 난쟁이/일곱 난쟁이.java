
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){

            List<Integer> list = new ArrayList<>();

            int sum = 0;
            for (int i = 0; i < 9; i++) {
                int h = Integer.parseInt(br.readLine());
                list.add(h);
                sum += h;
            }

            for(int i = 0 ; i<8; i++){

                for(int j = i+1 ; j<9; j++){
//                    if(j==i) continue;
                    if(sum - list.get(i) - list.get(j) == 100){
                        list.remove(list.get(j));
                        list.remove(list.get(i));
                        list.sort(Comparator.comparing(Function.identity()));

                        for (int k = 0; k <7 ; k++) {
                            bw.write(""+ list.get(k));
                            bw.newLine();
                        }
                        bw.flush();
                        return ;
                    }
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
