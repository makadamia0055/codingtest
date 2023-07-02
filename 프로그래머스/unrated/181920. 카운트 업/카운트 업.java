import java.util.ArrayList;

class Solution {
    public int[] solution(int start, int end) {
        ArrayList<Integer> list = new ArrayList();
	        for(int i = start; i<=end; i++){
	            list.add(i);
	        }
	        
	        int[] answer = list.stream().mapToInt(i->i).toArray();
	        return answer;
    }
}