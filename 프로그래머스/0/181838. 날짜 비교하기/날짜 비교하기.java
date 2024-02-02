class Solution {
    public int solution(int[] date1, int[] date2) {
        for(int i = 0; i<3; i++){
            if(date1[i]-date2[i]!=0){
                return date1[i]-date2[i]<0?1:0;
            }
        }
        return 0;
        
    }
}