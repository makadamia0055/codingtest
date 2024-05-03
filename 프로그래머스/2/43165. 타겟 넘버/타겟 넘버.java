class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        for(int i = 0; i<Math.pow(2, numbers.length); i++){
            int sum = 0;
            int bin = i;
            for(int j = 0; j<numbers.length; j++){
                
                if(bin%2==0){
                    sum += numbers[j];
                }else{
                    sum -= numbers[j];
                }
                bin/=2;
            }
            if(sum == target){
                answer++;
            }
        }
        
        return answer;
    }
}