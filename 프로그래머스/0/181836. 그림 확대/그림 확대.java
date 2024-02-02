import java.util.*;
import java.lang.StringBuilder;
class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> list = new ArrayList<String>();
        for(int i = 0; i<picture.length; i++){
            String str = picture[i];
            StringBuilder sb = new StringBuilder();
            for(int j= 0; j<str.length(); j++){
                char c = str.charAt(j);
                for(int l = 0; l<k; l++){
                    sb.append(c);
                }
                
            }
            String newStr = sb.toString();
            for(int l = 0; l<k; l++){
                list.add(newStr);
            }
        }
        return list.toArray(new String[1]);
        
    }
}