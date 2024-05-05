

import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ) {
            boolean finished = false;
            do {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                if(x==0&&y==0){
                    break;
                }
                int[][] arr = new int[y][x];
                for (int i = 0; i < y; i++) {
                    StringTokenizer arrSt = new StringTokenizer(br.readLine());
                    for (int j = 0; j < x; j++) {
                        int num = Integer.parseInt(arrSt.nextToken());
                        if(num==1){
                            arr[i][j] = 1;
                        }
                    }
                }
                boolean[][] vis = new boolean[y][x];
                Queue<int[]> queue = new ArrayDeque<>();
                int cnt = 0;
                for(int i = 0; i<y; i++){
                    for (int j = 0; j <x ; j++) {
                        if(arr[i][j]==0&&vis[i][j]){
                            continue;
                        }
                        if(!vis[i][j]&&arr[i][j]==1){
                            vis[i][j] = true;
                            queue.add(new int[]{j, i});
                            cnt++;

                        }



                        while(queue.size()!=0){
                            final int[] dxArr = {1, 0, -1, 0, -1, 1, 1, -1};
                            final int[] dyArr = {0, 1, 0, -1, -1, 1, -1, 1};
                            int[] polled = queue.poll();
                            for (int k = 0; k < 8; k++) {
                                int dx = polled[0] + dxArr[k];
                                int dy = polled[1] + dyArr[k];
                                if(dx<0||dx>x-1||dy<0||dy>y-1){
                                    continue;
                                }
                                if(arr[dy][dx]==1&&!vis[dy][dx]){
                                    vis[dy][dx] = true;
                                    queue.add(new int[]{dx, dy});
                                }
                            }
                        }



                    }
                }

                bw.write("" + cnt);
                bw.newLine();

            }while(!finished);

            bw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
