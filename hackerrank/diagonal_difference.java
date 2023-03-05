import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int arr_length = arr.size();
        int diagonal_sum1 = 0;
        int diagonal_sum2 = 0;
        
        // Multi-dimensional arraylists
        for (int i = 0; i < arr_length; i++){
            for (int j = 0; j < arr_length; j++){
                if (i == j){
                    // arr.get(i).get(j) = arr[i][j]
                    diagonal_sum1 += arr.get(i).get(j);
                }
                if (j == (arr_length - 1 - i)){
                    diagonal_sum2 += arr.get(i).get(j);
                }
            }
        }
        // Get absolute difference
        int abs_difference = Math.abs(diagonal_sum1 - diagonal_sum2);
        // System.out.println(abs_difference);
        return abs_difference;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
