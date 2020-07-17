import java.util.Scanner;
import java.io.*;

public class AppleAndOrange{
    public static void main(String[] args){

            Scanner input = new Scanner(System.in);
            
            int countApple = 0;
            int countOrange =0;
            int st[] = new int[2];
            //System.out.println("enter starting and ending point of Sam's house respectively- ");
            for(int i=0; i<2; i++){ 
                st[i] = input.nextInt();
            }

            int[] ab = new int[2];
            //System.out.println("enter the points of apple tree and orrange tree respectively - ");
            for(int i=0; i<2; i++){ 
                ab[i] = input.nextInt();
            }

            int[] mn = new int[2];
            //System.out.println("enter the number of apples and orranges fallen from trees respectively - ");
            for(int i=0; i<2; i++){ 
                mn[i] = input.nextInt();
            }

            int x= mn[0];
            int y = mn[1];

            int apples[] = new int[x];
            int oranges[] = new int[y];

            for(int i=0; i<x; i++){
                apples[i] = input.nextInt();
            }

            for(int i=0; i<y; i++){
                oranges[i] = input.nextInt();
            }
            //For Aplle Tree
            for(int i=0; i<x; i++){
                if(((ab[0]+apples[i]) >= st[0]) && ((ab[0]+apples[i]) <= st[1])){
                    countApple += 1;
                }
            }

            //For Orange Tree
            for(int i=0; i<y; i++){
                if(((ab[1]+oranges[i]) <= st[1]) && ((ab[1]+oranges[i]) >= st[0])){
                    countOrange += 1;
                }
            }

            System.out.println(countApple);
            System.out.println(countOrange);
    }
}
