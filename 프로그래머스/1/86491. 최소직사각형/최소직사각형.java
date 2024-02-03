import java.util.Arrays;
class Solution {
    public int solution(int[][] sizes) {
        int[] rst = Arrays.stream(sizes).map(i-> i[0]>i[1] ? i: new int[]{i[1], i[0]})
                .reduce((arr1, arr2)-> new int[]{arr1[0] > arr2[0] ? arr1[0] : arr2[0], arr1[1] > arr2[1] ? arr1[1] : arr2[1]}).get();
        return rst[0]*rst[1];
            
    }
}