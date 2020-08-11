
import java.util.*;


public class Solution {

    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       scan.nextLine();
       String s = scan.nextLine();

       int u = 0;     //to count valley
       int d = 0;      // to count the uphills and downhills

       for(int i=0; i<n; i++){
           char c = s.charAt(i);
           if(c == 'U') d++;
           if(c == 'D') d--;

           if(d==0  &&  c=='U')
                u++;
       }

        System.out.println(u);

    }
}
