import java.util.stream.*;
import java.util.*;

class Solution {
    public int solution(int n) {
        Map<Boolean, List<Integer>> map = partitionPrimes(n);
        int answer = map.get(Boolean.valueOf(false)).size();
        
        return answer;
    }
    public Map<Boolean, List<Integer>> partitionPrimes(int n){
        return IntStream.rangeClosed(2, n).boxed()
            .collect(Collectors.partitioningBy(i-> isPrime(i)));
    }
    
    public boolean isPrime(int num){
        int root = (int) Math.sqrt((double) num);
        return IntStream.rangeClosed(2, root)
            .noneMatch(i-> num%i==0);
    }
}