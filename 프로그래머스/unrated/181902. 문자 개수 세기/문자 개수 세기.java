class Solution {
    public int[] solution(String my_string) {
        int[] arr = new int[52]; //65 - 90 // 97 - 122
		for(int i= 0; i<my_string.length();i++) {
			int num = (int)my_string.charAt(i);
			if(num>=65&&num<=90) {
				arr[num-65]++;
			}else {
				arr[num-71]++;
			}
			
		}
		
		
		return arr;
    }
}