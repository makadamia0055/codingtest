import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
         ArrayList<Integer> list = new ArrayList();
	        list.add(n);
	        do {
	        	if(n%2==0) {
	        		n=n/2;
	        	}else {
	        		n=3*n+1;
	        	}
	        	list.add(n);
	        }while(n!=1);
	        
	        int[] answer = list.stream().mapToInt(i->i).toArray();
	        return answer;
    }
}