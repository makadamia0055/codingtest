import java.lang.Math;
import java.util.stream.*;
class Solution {
    public int solution(int left, int right) {
        return IntStream.rangeClosed(left, right).map(i-> (Math.pow((int)Math.sqrt(i), 2)==i? -i:i)).sum();
    }
}