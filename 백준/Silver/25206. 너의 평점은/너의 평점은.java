

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){

            List<double[]> collect = br.lines().map(line -> {
                        StringTokenizer st = new StringTokenizer(line);
                        String name = st.nextToken();
                        String point = st.nextToken();
                        String score = st.nextToken();

                        return new String[]{point, score};
                    })
                    .filter(arr -> !arr[1].equals("P"))
                    .map(arr -> {
                        double point = Double.parseDouble(arr[0]);
                        if (arr[1].equals("F")) {
                            return new double[]{point, 0.0d};
                        } else {
                            int baseScore = 69 - (int) arr[1].charAt(0);
                            double score = baseScore + (arr[1].contains("+") ? 0.5d : 0.0d);
                            return new double[]{point, score};
                        }
                    }).collect(Collectors.toList());

            double totalPoint = collect.stream().mapToDouble(arr -> arr[0]).sum();

            double totalScore = collect.stream().mapToDouble(arr -> arr[0] * arr[1]).sum();

            bw.write(String.format("%.6f", totalScore/totalPoint));
            bw.newLine();
            bw.flush();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
