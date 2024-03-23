import java.util.stream.IntStream;

class Solution {
    public long solution(int r1, int r2) {
        double r1Square = Math.pow(r1, 2);
        double r2Square = Math.pow(r2, 2);
//         long answer = IntStream.rangeClosed(1, r2)
//             .boxed()
//             .flatMap(i-> IntStream
//                      .iterate(0, n-> Math.pow(i, 2)+ Math.pow(n, 2) <=r2Square, n-> n+1)
//                      .mapToObj(j-> new int[]{i, j}))
//             //.map(i-> Math.pow(i[0], 2) + Math.pow(i[1], 2))
//             .filter(i-> Math.pow(i[0], 2) + Math.pow(i[1], 2)>=r1Square).count();
        long cnt = 0;
        for(int i= 1; i<=r2; i++){
            double iSquare = Math.pow(i, 2);
            int j = (int) Math.ceil(Math.sqrt(r1Square - iSquare));
            int maxJ = (int) Math.floor(Math.sqrt(r2Square - iSquare));
            cnt += maxJ-j+1;
        }
        
        
        
        return cnt*4;
    }
}