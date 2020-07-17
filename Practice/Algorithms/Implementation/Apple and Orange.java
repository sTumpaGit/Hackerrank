import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int t = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int m = scan.nextInt();
        int n = scan.nextInt();
        
        int[] apple = new int[m];
        for(int i=0; i<m; i++) 
            apple[i]=scan.nextInt();

        int[] orange = new int[n];
        for(int i=0; i<n; i++)
            orange[i]=scan.nextInt();
        System.out.println(result(s,t,a,apple));   // Apple tree
        System.out.println(result(s,t,b,orange));   // Orange tree
    }

    public static int result(int start , int end , int tree , int[] fruits){
        int count = 0;
        for(int i=0; i<fruits.length; i++){
            if((fruits[i]+tree)>=start && (fruits[i]+tree)<=end) count++;
        }
        return count;
    }

}
