import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i]=in.nextInt();
        }
        int count =0;
        for(int i=0; i<N; i++){
            int sum =0;
            for(int j=i; j<N; j++){
                sum += arr[j];
                if(sum<0) count++;
            }
        }
        System.out.println(count); 
    }
}
