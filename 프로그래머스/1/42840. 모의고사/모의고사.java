import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] answers) {
        List<int[]> list = new ArrayList<>();
        list.add(new int[]{1, 2, 3, 4, 5});
        list.add(new int[]{2, 1, 2, 3, 2, 4, 2, 5});
        list.add(new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5});

        int[] rst = IntStream.range(0, answers.length)
            .mapToObj(i-> check(list, answers[i], i))
            .reduce((arr1, arr2)-> new int[]{arr1[0]+arr2[0], arr1[1]+arr2[1], arr1[2]+ arr2[2]}).get();

       return IntStream.rangeClosed(1, 3).filter(i -> Arrays.stream(rst).max().getAsInt() == rst[i - 1]).toArray();
    }
    
     public static int[] check(List<int[]> list, int correct, int index){
        int[] rst = new int[3];
        for (int i = 0; i<3; i++){
            int[] paper = list.get(i);
            if(paper[index%paper.length]==correct){
                rst[i] = rst[i] + 1;
            }
        }
        return rst;
    }
}