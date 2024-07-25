import java.util.*;
import java.lang.*;
import java.io.*;

class CanReach
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            int y=sc.nextInt();
            int k=sc.nextInt();
            if(x%k==0&&y%k==0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        // your code goes here

    }

