class Solution {
    public long solution(int k, int d) {
        long cnt = 0;
		for(int i = 0; i<=d; i+=k) {
            int y = (int)Math.sqrt((long)Math.pow(d, 2) - (long)Math.pow(i, 2));
			cnt += Math.floor((y/k)+1);
		}
		
		long answer = cnt;
	    return answer;
		
		
    }
}