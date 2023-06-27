import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int n, int s) {
     if(s/n==0) {
			int[] arr = {-1};
			return arr;
		}
        int q = s-((s/n)*n);
        int[] answer = new int[n];
        for(int i = 0; i<n-q; i++) {
        	answer[i] = s/n;
        }
        for(int i = n-q; i<n; i++) {
        	answer[i] = s/n+1;
        	
        }
        
        
        
        return answer;
    }
}