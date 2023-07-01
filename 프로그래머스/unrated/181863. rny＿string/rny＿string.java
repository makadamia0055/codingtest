
class Solution {
    public String solution(String rny_string) {
        StringBuilder sb = new StringBuilder();
        for(int i= 0; i<rny_string.length(); i++){
            char w = rny_string.charAt(i);
            if(rny_string.charAt(i)=='m'){
                sb.append("rn");
            }else{
                sb.append(w);
            }
        }
        String answer = sb.toString();
        return answer;
    }
}