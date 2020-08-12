import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        int com[] = new int[n];
        int count[] = new int[n];
        int total=0;

        for(int i=0; i<n; i++){
            arr[i]=input.nextInt();
            com[i]=arr[i];
            count[i]=0;
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i]==com[j]){
                    count[j]=count[j]+1;
                    break;
                }
            }
        }
        for(int i=0; i<n ; i++){
            if(count[i]>1){
                total = total + (count[i]/2);
            }
        }

        System.out.println(total);

    }
}
