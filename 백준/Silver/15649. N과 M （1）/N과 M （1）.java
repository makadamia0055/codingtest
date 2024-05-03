

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            List<List<Integer>> collect = IntStream.rangeClosed(1, n).mapToObj(i -> List.of(i)).collect(Collectors.toList());
            for(int i = 1; i<m; i++){
                collect = depthIn(collect, n);
            }
            String str = collect.stream().map(list -> list.stream().map(c -> "" + c).collect(Collectors.joining(" "))).sorted().collect(Collectors.joining("\n"));
            bw.write(str);
            bw.flush();

        }catch (Exception e){

        }
    }

    private static List<List<Integer>> depthIn(List<List<Integer>> collect, int n) {
        List<List<Integer>> rst = new ArrayList<>();
        for(List<Integer> list : collect){

            for(int i = 1; i<=n; i++){
                if(list.contains(i)){
                    continue;
                }
                List<Integer> subList = new ArrayList<>();
                subList.addAll(list);
                subList.add(i);
                rst.add(subList);
            }
        }





        return rst;
    }
}
