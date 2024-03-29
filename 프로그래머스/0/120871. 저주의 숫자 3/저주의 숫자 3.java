import java.util.stream.*;

class Solution {
    public int solution(int n) {
        int x3 = IntStream.iterate(1, i-> i+1)
            .filter(i-> i%3!=0&&!(new String(String.valueOf(i)).contains("3")))
            .limit(n)
            .max()
            .getAsInt();
        
        int answer = x3;
        return answer;
    }
}