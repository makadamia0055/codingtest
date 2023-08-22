
import java.util.ArrayList;
import java.util.List;
class Solution {
    static String originStr = "";  
    
    public String[] solution(String myStr) {
        originStr = myStr;
        List<String> list = new ArrayList<String>();
		while(originStr.length()!=0) {
			list = subStr(list);
		}
		if(list.size()==0) {
			list.add("EMPTY");
		}
		String[] strArr= list.toArray(new String[list.size()]);
		return strArr;
    }
	
	public List<String> subStr(List<String> list){
		for(int i = 0; i<originStr.length(); i++) {
			char ch = originStr.charAt(i);
			if(ch=='a'||ch=='b'||ch=='c') {
				if(i!=0) {
					list.add(originStr.substring(0, i));
				}
				originStr = originStr.substring(i+1);
				return list;
			}
		}
		list.add(originStr);
		originStr = "";
		return list;
	}
}