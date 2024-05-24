import java.util.*;
import java.lang.*;
import java.io.*;

class DetermineWinner
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int Pa=sc.nextInt();
            int Pb=sc.nextInt();
            int Qa=sc.nextInt();
            int Qb=sc.nextInt();
            if(Pa>Pb){
                int P=Pa;
            }
            else{
                int P=Pb;
            }
            if(Qa>Qb){
                int Q=Qa;
            }
            else{
                int  Q=Qb;
            }
            if(int P>Q){
                System.out.println("Q");
            }
            else if(int P<Q){
                System.out.println("P");
            }
            else{
                System.out.println("TIE");
            }



        }
        // your code goes here

    }
}
