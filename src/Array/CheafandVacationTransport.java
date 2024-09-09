import java.util.*;
import java.lang.*;
import java.io.*;

class CheafandVacatioTransport
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();

            if((x+y)==z){
                System.out.println("EQUAL");
            }
            else if(x+y>z){
                System.out.println("TRAIN");
            }
            else{
                System.out.println("PLANEBUS");
            }
        }
        // your code goes here

    }
}
