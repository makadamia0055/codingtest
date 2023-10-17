
class Solution {
    public String solution(String n_str) {
        int index = 0;
        for(int i = 0; i<n_str.length(); i++){
            char ch = n_str.charAt(i);
            if(ch!='0'){
                index = i;
                break;
            }
        }
        String answer = n_str.substring(index);
        return answer;
    }
}