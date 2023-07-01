class Solution {
    public int solution(int[] num_list) {
        StringBuilder oddSb = new StringBuilder();
        StringBuilder evenSb = new StringBuilder();
        for(int i= 0; i<num_list.length; i++){
            int r = num_list[i];
            if(r%2==0){
                evenSb.append(r);
            }else{
                oddSb.append(r);
            }   
        }
        int odd = Integer.parseInt(oddSb.toString());
        int even = Integer.parseInt(evenSb.toString());
        
        int answer = odd+even;
        return answer;
    }
}