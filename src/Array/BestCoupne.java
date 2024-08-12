import java.util.*;
import java.lang.*;
import java.io.*;

class BestCoupne
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int c=(x*10)/100;
            int d=x=100;
            if(c>d){
                System.out.println(c);

            }
            else{
                System.out.println(d);
            }
        }
        // your code goes here

    }
}
