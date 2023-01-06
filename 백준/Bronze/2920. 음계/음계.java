
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {

		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			boolean asc = false;
			boolean desc = false;
			
			
			int stNum = Integer.parseInt(st.nextToken());
			
			if(stNum == 1) {
				asc=true;
				int cntNum = stNum;
				for(int i= 0; i<7; i++) {
					int nxtNum = Integer.parseInt(st.nextToken());
					
					if(nxtNum-cntNum!=1) {
						asc=false;
						break;
					}
					cntNum=nxtNum;
					
				}
				
			}else if(stNum==8) {
				desc=true;
				int cntNum = stNum;
				for(int i= 0; i<7; i++) {
					int nxtNum = Integer.parseInt(st.nextToken());
					
					if(nxtNum-cntNum!=-1) {
						desc=false;
						break;
					}
					cntNum=nxtNum;
					
				}
			}
			
			if(asc) {
				System.out.println("ascending");
			}else if(desc) {
				System.out.println("descending");
			}else if(!asc&&!desc) {
				System.out.println("mixed");
			}
			
			
			
			
		} catch (Exception e) {
			
		}
		
	}

}
