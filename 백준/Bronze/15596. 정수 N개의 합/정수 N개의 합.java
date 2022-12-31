public class Test {
    long sum(int[] a) {
        long ans = 0;
        for(int tmp : a){
            ans+=(long)tmp;
        }
        
        return ans;
    }
}
