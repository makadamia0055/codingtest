class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int len  = queries.length;
        int[] rst = new int[len];
		for(int j = 0; j<queries.length; j++) {
			int[] tmpArr = queries[j];
        	int s = tmpArr[0];
        	int e = tmpArr[1];
        	int k = tmpArr[2];
        	
        	
        	int attr = -1;
        	for (int i = s; i<=e; i++) {
        		if(arr[i]>k) {
        			attr = attr==-1?arr[i]:Math.min(attr, arr[i]);
        		}
        	}
        	rst[j] = attr;
        }
		
		int[] answer = rst;
        return answer;
    }
}