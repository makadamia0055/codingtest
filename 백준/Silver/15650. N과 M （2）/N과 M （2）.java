import java.io.*;

public class Main {
    static int[] arr = new int[10];
    static boolean[] isUsed = new boolean[10];

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            String[] split = br.readLine().split(" ");
            int n = Integer.parseInt(split[0]);
            int m = Integer.parseInt(split[1]);

            func(0, n, m);





        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void func(int k, int n, int m){
        if(k == m){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < m; i++) {
                sb.append(arr[i]);
                sb.append(" ");
            }
//            sb.append("\n");
            System.out.println(sb.toString());
            return;
        }
        for(int i = 1; i<=n; i++){
            int l = k>0?arr[k-1]:0;
            if(!isUsed[i]&&i>l){
                arr[k] = i;
                isUsed[i] = true;
                func(k+1, n, m);
                isUsed[i] =false;

            }
        }

    }
}
