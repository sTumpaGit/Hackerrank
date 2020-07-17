import java.util.Scanner;
import java.io.*;

public class Kangaroo{

        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            int x1 = input.nextInt();
            int v1 = input.nextInt();
            int x2 = input.nextInt();
            int v2 = input.nextInt();
            boolean flag = false;

            if(x2>x1 && v2>v1){
                System.out.println("NO");
            }
            else{

                    while(x2 > x1){

                            x2 = x2+ v2;
                            x1 = x1+ v1;

                            if( x1 == x2){
                                flag = true;
                                break;
                            }

                    }

                    if(flag){
                            System.out.println("YES");
                    }
                    else{
                        System.out.println("NO");
                    }

            }

        }

}
