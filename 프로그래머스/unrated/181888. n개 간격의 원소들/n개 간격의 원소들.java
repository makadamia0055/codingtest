import java.util.ArrayList;
class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i<num_list.length; i+=n){
            list.add(num_list[i]);
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}