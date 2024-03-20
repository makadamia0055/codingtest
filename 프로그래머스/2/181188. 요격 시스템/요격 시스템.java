import java.util.Arrays;
import java.util.stream.*;
import java.util.*;

class Solution {
    public int solution(int[][] targets) {
       Arrays.sort(targets, Comparator.comparing((int[] i)-> i[1]).thenComparing(i-> -i[0]));
        boolean[] intercepted = new boolean[targets.length]; 
        
        int answer = 0;
        for(int i= 0; i<targets.length; i++){
            if(intercepted[i]){
                continue;
            }
            answer+= 1;
            int start = targets[i][0];
            int end = targets[i][1];
            
            for(int j=i+1; j<targets.length; j++){
                if(intercepted[j] ||end<targets[j][0]){
                    continue;
                }else if(targets[j][1]>start&&targets[j][0]<end){
                    intercepted[j]=true;
                }
            }
        }
        
    
        
        
        
        return answer;
    }
}