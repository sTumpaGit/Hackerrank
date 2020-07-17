import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        LinkedList<Integer> mylist = new LinkedList<Integer>();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for(int i=0; i<n; i++){
            int value = in.nextInt();
            mylist.add(value);
        }
        
        int task = in.nextInt();

        for(int i=0; i<task; i++){
            String choice = in.next();
            if(choice.equals("Insert")){
                int pos = in.nextInt();
                int val = in.nextInt();
                mylist.add(pos,val);
            }
            else{
                int pos= in.nextInt();
                mylist.remove(pos);
            }
        }

        for(Integer list : mylist){
                System.out.print(list+" ");
        }

    }
}
