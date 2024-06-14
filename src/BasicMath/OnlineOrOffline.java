import java.util.*;
import java.lang.*;
import java.io.*;

class OnlineOrOffline
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);

        {
            System.out.println("Enter the value of n");
            int n=sc.nextInt();
            int m=sc.nextInt();
            double dis=n-(n*0.1);
            if(m==dis)
            {
                System.out.println("EITHER");
            }
            else if(m<dis){
                System.out.println("DINING");
            }
            else{
                System.out.println("ONLINE");
            }
        }
    }
}
