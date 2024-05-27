import java.util.*;
import java.lang.*;
import java.io.*;

class Recursiont
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=1;j<=t; j++){
            System.out.println("Entre thwe number");
            int n=sc.nextInt();
            int fact=1;
            for(int i=1; i<=n; i++){
                fact=fact*i;
            }
            System.out.println(fact);
            // your code goes here

        }
    }
}
