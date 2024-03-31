
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            String firstLine = br.readLine();
            StringTokenizer st = new StringTokenizer(firstLine);

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[] bucket = IntStream.range(0, n).map(i-> i+1).boxed().collect(Collectors.toList()).stream().mapToInt(i->i).toArray();

            for(int i= 0; i<m; i++){
                String newLine = br.readLine();
                StringTokenizer nst = new StringTokenizer(newLine);
                int start = Integer.parseInt(nst.nextToken()) -1;
                int end = Integer.parseInt(nst.nextToken()) -1;
                int buff = bucket[start];

                bucket[start] = bucket[end];
                bucket[end] = buff;

            }

            String answer = Arrays.stream(bucket).mapToObj(i -> i + " ").collect(Collectors.joining());
            bw.write(answer);
            bw.flush();


        }catch (Exception e){

        }
    }
}
