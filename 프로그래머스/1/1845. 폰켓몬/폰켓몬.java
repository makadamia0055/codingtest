import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int numsLen = nums.length/2;
        return (int) Arrays.stream(nums).distinct().limit(numsLen).count();
    }
}