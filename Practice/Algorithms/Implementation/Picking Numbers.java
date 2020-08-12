import java.util.*;

class Result {

    public static int pickingNumbers(List<Integer> a) {
        Collections.sort(a);
        int[] arr = new int[101];
        int ans = 0;
        for(int i=0; i<a.size(); i++){
            arr[a.get(i)]++;
        }  

        for(int i=1; i<=100; i++){
            ans = Math.max(ans , arr[i]+arr[i-1]);
        } 

        return ans;
    }

}

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        List<Integer> a = new ArrayList<>();

        for(int i=0; i<n; i++)
            a.add(scan.nextInt());

        int result = Result.pickingNumbers(a);

        System.out.println(result);
    }
}
