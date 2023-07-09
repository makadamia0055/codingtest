import java.util.ArrayList;



class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(String tmpStr:intStrs){
            int num = Integer.parseInt(tmpStr.substring(s, s+l));
            if(num>k){
                list.add(num);
            }
        }
       
        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}