import java.util.Stack;

class Solution {
  	public static int cnt = 0;
    public int solution(int[] ingredient) {
        Stack st = new Stack();
        for(int i = 0; i<ingredient.length; i++){
            st.add(ingredient[i]);
			st = check(st);
			
        }
        return cnt;
    }
    
    public static Stack<Integer> check(Stack<Integer> stack){
		if(stack.size()<4)
			return stack;
		int i = stack.size() -1;
		if(stack.elementAt(i)==1&&stack.elementAt(i-1)==3&&stack.elementAt(i-2)==2&&stack.elementAt(i-3)==1) {
				cnt++;
				stack.pop();
				stack.pop();
				stack.pop();
				stack.pop();
				
		}
		return stack;
		
	}
    
}