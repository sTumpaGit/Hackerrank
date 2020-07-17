import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {

    public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   int n = input.nextInt();
   int bill[] = new int[n];
   int k = input.nextInt();
   int total=0;

   for(int i=0; i<n; i++){
        bill[i]=input.nextInt();
       if(i!=k){
           total= total+bill[i];
       }
   }

   int b = input.nextInt();

   System.out.println((total/2==b) ? "Bon Appetit" : Math.abs(b-(total/2)));
    }
}
