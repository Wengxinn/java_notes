import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        // Use long for 64-bit integer - integer overflow
        ArrayList<Long> sums = new ArrayList<Long>();
        for (int i = 0; i < arr.size(); i++){
            long sum = 0;
            for (int j = 0; j < arr.size(); j++){
                if (i != j){
                    sum += arr.get(j);
                }
            }
            sums.add(sum);
        }
        long min = Collections.min(sums);
        long max = Collections.max(sums);
        System.out.println(min + " " + max);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
