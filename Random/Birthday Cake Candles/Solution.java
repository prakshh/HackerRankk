//Problem: https://www.hackerrank.com/challenges/birthday-cake-candles
//Java 8
/*
Initial Thoughts: 
We can keep a running max and update it if we
find something larger, if we find something smaller
we just keep looking and if we find something equal
then we increment a counter variable
Time Complexity: O(n) //We must check the height of every candle
Space Complexity: O(1) //We only store a max and a frequency
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        int noOfCandles = scan.nextInt();
        int tallest = 0;
        int frequency = 0;
        
        
        for(int i=0; i < noOfCandles; i++){
            int height = scan.nextInt();

            if(height > tallest){
                tallest = height;
                frequency = 1;
            }
            else if(height == tallest) frequency++;
        }
        scan.close();

        System.out.println(frequency);
    }
}
/********************
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter no. of Candles : ");
        int noOfCandles = scan.nextInt();
        int tallest = 0;
        int frequency = 0;
        
        
        for(int i=0; i < noOfCandles; i++){
            System.out.println("Enter height of Candle " +(i+1)+ " : ");
            int height = scan.nextInt();
            if(height > tallest){
                tallest = height;
                frequency = 1;
            }
            else if(height == tallest) frequency++;
        }
        scan.close();
        System.out.println("\nNo. of Tallest Candles : " +frequency);
    }
}
 * 
 * 
 * ****************/