

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static boolean[][] vis;

    public static int[][] paper;

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int vetical = Integer.parseInt(st.nextToken());
            int horizontal = Integer.parseInt(st.nextToken());

            paper = new int[vetical][horizontal];
            for (int i = 0; i < vetical; i++) {
                StringTokenizer indexSt = new StringTokenizer(br.readLine());
                for(int j = 0 ; j< horizontal; j++){
                    paper[i][j] = Integer.parseInt(indexSt.nextToken());
                }
            }
            vis = new boolean[vetical][horizontal];

            Queue<int[]> queue = new ArrayDeque<>();
            int cnt = 0;
            int max = 0;
            for (int i = 0; i < vetical; i++) {

                for (int j = 0; j < horizontal; j++) {
                    if(!vis[i][j]&&paper[i][j]==1){
                        vis[i][j] = true;
                        queue.add(new int[]{i, j});
                        int rst= bfs(queue);
                        max = Math.max(max, rst);
                        cnt++;

                    }
                }
            }
            System.out.println(cnt);
            System.out.println(max);


        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static int bfs(Queue<int[]> queue) {
        int max = 1;
        int[] divX = {1, 0, -1, 0};
        int[] divY = {0, 1, 0, -1};
        while(!queue.isEmpty()){
            int[] polled = queue.poll();
            for (int i = 0; i < 4; i++) {
                int dx = polled[1] + divX[i];
                int dy = polled[0] + divY[i];
                if(dx<0||dx>paper[0].length-1||dy<0||dy>paper.length-1){
                    continue;
                }
                if(!vis[dy][dx]&&paper[dy][dx]==1){
                    vis[dy][dx] = true;
                    max++;
                    queue.add(new int[]{dy, dx});
                }
            }
        }
        return max;
    }
}
