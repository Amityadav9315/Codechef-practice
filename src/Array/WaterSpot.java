import java.util.*;
import java.lang.*;
import java.io.*;

class WaterSpot
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int z=sc.nextInt();
            int y=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=z-y;
            int e=a+b+c;
            if(d>=e){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        // your code goes here

    }
}
