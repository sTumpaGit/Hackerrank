import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            ArrayList<Integer> prev = new ArrayList<>();
            int s = in.nextInt();
            for(int j=0; j<s; j++){
                prev.add(j,in.nextInt());
            }
            list.add(i,prev);
        }
        int Q = in.nextInt();
        for(int i=0; i<Q; i++){
            try{
                System.out.println(list.get(in.nextInt()-1).get(in.nextInt()-1));
            }catch(Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}
