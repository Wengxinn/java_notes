import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
public class Solution {
    
    public static void main (String[] args) throws java.lang.Exception {
        Scanner kb = new Scanner(System.in);
        int test_cases = kb.nextInt();
        for(int cs = 1; cs <= test_cases; cs++){
            int n = kb.nextInt();
             int a[] = new int[n]; 
            for(int i = 0; i < n; i++){
                a[i] = kb.nextInt();
            }
            findZigZagSequence(a, n);
        }
   }
   
    public static void findZigZagSequence(int [] a, int n){
        Arrays.sort(a); // [1,2,3,4,5,6,7]
        int mid = (n + 1)/2 - 1; // 3 !
        int temp = a[mid]; // 4
        a[mid] = a[n - 1]; // [1,2,3,7,5,6,7]
        a[n - 1] = temp; // [1,2,3,7,5,6,4]
    
        int st = mid + 1; // 4
        int ed = n - 2; // 5 !
        while(st <= ed){
            temp = a[st]; // 5
            a[st] = a[ed]; // [1,2,3,7,6,6,4]
            a[ed] = temp; // [1,2,3,7,6,5,4]
            st = st + 1; // 5
            ed = ed - 1; // 4 !
        }
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
}



