import java.util.*;
import java.lang.*;
import java.io.*;

class WhichMixture
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a>0&&b>0){
                System.out.println("solution");
            }
            else if(b==0){
                System.out.println("Solid");

            }
            else{
                System.out.println("Liquid");
            }
            // your code goes here

        }
    }
}
