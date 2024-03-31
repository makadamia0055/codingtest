
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.List;
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

            int[] bucket = IntStream.range(0, n).map(i-> i+1).toArray();

            for(int i= 0; i<m; i++){
                String newLine = br.readLine();
                StringTokenizer nst = new StringTokenizer(newLine);
                int start = Integer.parseInt(nst.nextToken()) -1;
                int end = Integer.parseInt(nst.nextToken()) -1;
                int[] newBucket = Arrays.copyOf(bucket, n);
                for(int j = 0; j<=end-start; j++){
                    newBucket[start+j] = bucket[end-j];
                }
                bucket = newBucket;

            }

            String answer = Arrays.stream(bucket).mapToObj(k -> k + " ").collect(Collectors.joining());
            bw.write(answer);
            bw.flush();


        }catch (Exception e){

        }
    }
}
