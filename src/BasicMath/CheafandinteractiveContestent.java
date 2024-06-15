import java.util.*;
import java.lang.*;
import java.io.*;

class CheafandinteractiveContestent
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        //int R=sc.nextInt();
        int[] R=new int[n];
        for(int i=0; i<n; i++){
            R[i]=sc.nextInt();}
        for(int i=0; i<n; i++){
            if(R[i]<r){
                System.out.println("Bad boi");
            }
            else{
                System.out.println("Good boi");
            }
        }
        // your code goes here

    }
}
