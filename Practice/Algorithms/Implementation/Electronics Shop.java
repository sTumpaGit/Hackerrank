import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int budget = scan.nextInt();
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[] keyboard = new int[n];
        int[] usb = new int[m];

        for(int i=0; i<n; i++)
            keyboard[i] = scan.nextInt();

        for(int i=0; i<m; i++)
            usb[i] = scan.nextInt();

        int ans = -1;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int sum = keyboard[i]+usb[j];
                if(sum <= budget)
                    ans = Math.max(ans,sum);
            }
        }

        System.out.println(ans);
    }
}
