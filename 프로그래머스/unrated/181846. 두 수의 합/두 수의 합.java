class Solution {
    public String solution(String a, String b) {
       
        StringBuilder sb = new StringBuilder();
        int minLen = a.length()>b.length()?b.length():a.length();
        boolean sup = false;
        for(int i = 0; i<minLen ; i++){
            char chA = a.charAt(a.length()-1-i);
            char chB = b.charAt(b.length()-1-i);
            int num = Integer.parseInt(""+chA) + Integer.parseInt(""+chB);
            num = sup?num+1:num;
            sup = num>=10?true:false;
            sb.append(num%10);
        }
        String maxLenStr = a.length()>b.length()?a:b;
        for(int i = minLen; i<maxLenStr.length(); i++){
            char ch = maxLenStr.charAt(maxLenStr.length()-1-i); 
            int num = Integer.parseInt(""+ch);
            num = sup?num+1:num;
            sup = num>=10?true:false;
            sb.append(num%10);

        }
       if(sup){
           sb.append(1);
       }
            
        String answer = sb.reverse().toString();
        return answer;
    }
}