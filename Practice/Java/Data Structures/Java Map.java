
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
        in.nextLine();
		HashMap<String,Integer> map = new HashMap<>();
        while(n-->0){
            String name = in.nextLine();
            int num = in.nextInt();
            in.nextLine();
            map.put(name,num);
        }
        while(in.hasNext()){
            String s = in.nextLine();
            if(map.containsKey(s)){
                System.out.println(s+"="+map.get(s));
            }
            else{
                System.out.println("Not found");
            }
        }
	}
}



