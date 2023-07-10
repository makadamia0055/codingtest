import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int tmp: indices) {
        	list.add(tmp);
        }
        Collections.sort(list);
        
        for(int i = 0; i<my_string.length();i++) {
        	if(!list.contains(i)) {
        		sb.append(my_string.charAt(i));
        	}
        }
		
		
		
		String answer = sb.toString();
        return answer;
    }
}