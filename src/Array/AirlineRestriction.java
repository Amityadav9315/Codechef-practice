import java.util.*;
import java.lang.*;
import java.io.*;

class AirlineRestriction
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the number" );
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            int e=sc.nextInt();
            if((a+b<=d) &&c<=e){
                System.out.println("Yes");

            }
            else if(a+c<=d&&b<=e){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }


        }

        // your code goes here

    }
}
