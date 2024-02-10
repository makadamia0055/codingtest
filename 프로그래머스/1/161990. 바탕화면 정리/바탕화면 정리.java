class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {100, 100, -1, -1};
        for(int i = 0; i<wallpaper.length; i++){
            String str = wallpaper[i];

            for(int j = 0; j<wallpaper[i].length(); j++){
                if(str.charAt(j)=='#'){
                    if(answer[0]>i){
                        answer[0]=i;
                    }
                    if(answer[2]<i){
                        answer[2]=i;
                    }
                    if(answer[1]>j){
                        answer[1]=j;
                    }
                    if(answer[3]<j){
                        answer[3]=j;
                    }
                }
            }
        }
        answer[2] = answer[2] + 1;
        answer[3] = answer[3] + 1;
        return answer;

    }
}