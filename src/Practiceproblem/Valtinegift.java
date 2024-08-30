import java.util.*;
import java.lang.*;
import java.io.*;

class Valtinegift
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the number");
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n>=127){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        // your code goes here

    }
}
