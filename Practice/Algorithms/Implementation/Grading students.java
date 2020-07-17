import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Result {

        public static void main(String[] args){

            Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int arr[]= new int[n];

        for(int i=0; i<n; i++){
            arr[i]= input.nextInt();
        }

        for(int i=0; i<n; i++){

            if( (arr[i] >= 38) && (5-(arr[i]%5))<3 ){
                    System.out.println(arr[i]+(5-(arr[i]%5)));
                }
            else if(arr[i] >= 38){
                    System.out.println(arr[i]);    
                }
            else{
                    System.out.println(arr[i]);    
                }
        }
    }

}
