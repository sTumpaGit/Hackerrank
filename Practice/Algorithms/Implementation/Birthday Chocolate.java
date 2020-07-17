import java.util.*;

public class Solution{
    public static void main(String[] s) throws Exception{
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = scan.nextInt();
        }
        int d = scan.nextInt();
        int m = scan.nextInt();
        System.out.println(ways(arr,d,m));
    } 

    public static int ways(int[] arr, int d, int m){
        int n = arr.length;
        if(n<=1){
            if(arr[0]==d){ return 1;}
            else return 0;
        }
        int count =0;
        for(int i=0;i<arr.length;i++)
    {
        int sum=0;
        for(int j=0;j<m;j++)
        {
            if(i+j<arr.length)
                sum+=arr[i+j];
    }
        if(sum==d)
            count++;
    
    }
     return count;
    }

}
