class Solution {
	    public int[] solution(int[] arr, int[][] queries) {
	    	for(int[] arr2 : queries) {
	    		arr = swap(arr, arr2);
	    	}
	    	int[] answer = arr;
	        return answer;
	    }
    public static int[] swap(int[] arr, int[] arr2) {
		int tmp = arr[arr2[0]];
		arr[arr2[0]] = arr[arr2[1]];
		arr[arr2[1]] = tmp;
		return arr;
		
		
	    }
	}
	
