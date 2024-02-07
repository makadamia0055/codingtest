class Solution {
    public int[] solution(int brown, int yellow) {
        int wholeArea = brown + yellow;
        int[] rst = new int[2];
        for(int i = 3; i<=wholeArea; i++){
            if(wholeArea%i!=0){
                continue;
            }
            int y = wholeArea/i;
            if(i+y!=(brown+4)/2){
                continue;
            }
            if((i-2)*(y-2)!=yellow){
                continue;
            }
            rst[0] = y;
            rst[1] = i;
            break;
        }
        return rst;
    }
}