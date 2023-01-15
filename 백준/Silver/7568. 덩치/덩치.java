
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			int num = Integer.parseInt(br.readLine());
			ArrayList<Mass> list = new ArrayList<>();
			
			for(int i= 0; i<num; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				list.add(new Mass(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
			}
			
			for(Mass tmp : list) {
				tmp.getRank(list);
			}
			
			
		}catch (Exception e) {

		}
	}

}
class Mass implements Comparable<Mass>{
	int weight;
	int height;
	
	public Mass(int weight, int height) {
		this.weight = weight;
		this.height = height;
	}
	

	@Override
	public int compareTo(Mass o) {
		if(this.weight>o.weight&&this.height>o.height) {
			return 1;
		}else if(this.weight<o.weight&&this.height<o.height) {
			return -1;
		}else {
		return 0;
		}
	}
	public void getRank(ArrayList<Mass> list) {
			int count = 1;
			for(Mass tmp : list) {
				if(tmp.compareTo(this)==1) {
					count++;
				}		
			
		}
			System.out.print(count +" ");
		
		
	}
	
	
}