class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length+1;
        int[] rst = new int[len];
        System.arraycopy(num_list, 0, rst, 0, len-1);
        int num1 = num_list[num_list.length-1];
        int num2 = num_list[num_list.length-2];
        rst[len-1] = num1>num2?num1-num2: num1*2; 
        
        
        int[] answer = rst;
        return answer;
    }
}