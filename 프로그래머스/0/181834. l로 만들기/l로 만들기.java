import java.lang.String;
class Solution {
    public String solution(String myString) {
        char[] charArr = myString.toCharArray();
        for(int i = 0; i<myString.length(); i++){
            if(charArr[i]- 'l'<0){
                charArr[i] = 'l';
            }
        }
        return String.valueOf(charArr);
    }
}