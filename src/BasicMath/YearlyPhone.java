import java.util.*;
import java.lang.*;
import java.io.*;

class YearlyPhone
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int t= s.nextInt();
        int b = t%100;
        if( b>=0 && b<=9){
            System.out.println("K" + "0" + b);

        }else{
            System.out.println("K" + b);
        }
    }
}
