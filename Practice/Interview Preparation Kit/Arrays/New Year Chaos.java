import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int Testcase = scan.nextInt();
        while(Testcase-- > 0){
            int n = scan.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++)
                arr[i] = scan.nextInt();

            chaotic_bribes(arr,n);
        }
    }

    public static void chaotic_bribes(int[] arr, int n){
        int count = 0;
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]-(i+1) >2 ){
                System.out.println("Too chaotic");
                return;
            }
            int v = Math.max(0,arr[i]-2);
            for(int j=v; j<i; j++){
                if(arr[j]>arr[i]) 
                    count++;
            }
        }
        System.out.println(count); 
    }
}
