import java.util.*;
import java.lang.*;
import java.io.*;

class GreaterAverage
{
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            float a=sc.nextInt();
            float b =sc.nextInt();
            float c=sc.nextInt();
            float d=(a+b)/2;
            if(d>c){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            // your code goes here
        }
    }
}
