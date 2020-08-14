import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

        int[] c=new int[n];
        for(int i=0;i<n;i++)
        {
            c[i]=sc.nextInt();
        }
        Arrays.sort(c);
        int j=n-1;
        int i=0;
        long min_cal=0;
        while(j>=0&&i<=n-1)
        {
            min_cal=(long) (min_cal+(c[j]*Math.pow(2, i)));
            j--;
            i++;
        }
        System.out.println(min_cal);

    sc.close();   
    }
}
