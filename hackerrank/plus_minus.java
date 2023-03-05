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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr, int array_size) {
        // Write your code here
        double positives = 0.0;
        double negatives = 0.0;
        double zeros = 0.0;
        
        for (int i: arr){
            if (i > 0){
                positives++;
            }
            else if (i < 0){
                negatives++;
            }
            else{
                zeros++;
            }
        }
        // Ensure the dividends must be double to yields double results
        double ratio_positives = positives / array_size;
        double ratio_negatives = negatives / array_size;
        double ratio_zeros = zeros / array_size;
        
        // Use printf to format string - 6 decimal places
        System.out.printf("%6f", ratio_positives);
        System.out.println();
        System.out.printf("%6f", ratio_negatives);
        System.out.println();
        System.out.printf("%6f", ratio_zeros);
        System.out.println();
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr, n);

        bufferedReader.close();
    }
}

