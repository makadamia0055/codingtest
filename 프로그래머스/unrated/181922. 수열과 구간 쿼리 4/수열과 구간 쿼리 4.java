class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int j = 0; j<queries.length; j++) {
			int[] tmpArr = queries[j];
        	int s = tmpArr[0];
        	int e = tmpArr[1];
        	int k = tmpArr[2];
        	
        	
        	
        	for (int i = s; i<=e; i++) {
        		if(i%k==0) {
        			arr[i]++;
        		}
        	}
        	
        }
		
		int[] answer = arr;
        return answer;
    }
}