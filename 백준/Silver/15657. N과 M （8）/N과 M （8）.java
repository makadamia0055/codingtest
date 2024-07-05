import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static int[] arr = new int[10];

    static List<Integer> list = new ArrayList<>();
    static boolean[] isUsed = new boolean[10];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            String[] split = br.readLine().split(" ");
            int n = Integer.parseInt(split[0]);
            int m = Integer.parseInt(split[1]);

            String[] nums = br.readLine().split(" ");
            for(int i = 0; i<n; i++){
                list.add(Integer.parseInt(nums[i]));
            }
            Collections.sort(list);

            func(0, n, m);
            bw.append(sb.toString());
            bw.flush();




        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void func(int k, int n, int m){
        if(k == m){
            for (int i = 0; i < m; i++) {
                sb.append(arr[i]);
                sb.append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i = 0; i<n; i++){
            int l = k>0?arr[k-1]:0;
            if(list.get(i)>=l){
                arr[k] = list.get(i);
//                isUsed[i] = true;
                func(k+1, n, m);
//                isUsed[i] =false;

            }
        }

    }
}
