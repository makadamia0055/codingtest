class Solution {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        boolean mode = false;
        for(int i= 0; i<code.length(); i++){
            if(code.charAt(i)=='1'){
                mode = !mode;
                continue;
            }
            if(!mode&&i%2==0){
                sb.append(code.charAt(i));
            }else if(mode&&i%2==1){
                sb.append(code.charAt(i));
            }
                
        }
        
        String ret = sb.toString();
        String answer = (ret==null||ret.length()==0)?"EMPTY":ret;
        return answer;
    }
}