import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


class Solution {
    public int[] solution(int l, int r) {
   		int logR = (int) Math.log10(r);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		for(int i = 0; i<=logR; i++) {
			int base = (int) Math.pow(10, i) * 5;
			int len = list.size();
			for(int j= 0; j<len; j++) {
				list.add(base+list.get(j));
			}
		}
		int[] rst = list.stream().filter(i-> i>=l&&i<=r).mapToInt(i->i).toArray();
		if(rst.length==0) {
			rst = new int[1];
			rst[0] = -1;
		}
		return rst;
    }
}