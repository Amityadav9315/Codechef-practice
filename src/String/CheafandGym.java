import java.util.*;
import java.lang.*;
import java.io.*;

class CheafandGym
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            int c=x+y;
            if(c<=z){
                System.out.println("2");
            }
            else if(c>z&&x<=z){
                System.out.println("1");

            }
            else{
                System.out.println("0");
            }
        }
        // your code goes here

    }
}
