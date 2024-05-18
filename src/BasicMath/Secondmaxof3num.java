import java.util.*;
import java.lang.*;
import java.io.*;

class Secondmaxof3num
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter he num of test case");
        int t=sc.nextInt();
        while(t-->0){
            System.out.println("Enter the value of a,b,c");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if((a>b||a>c)&&(a<b||a<c)){
                System.out.println(a);
            }
            else if((b>a||b>c)&&(b<a||b<c)){
                System.out.println(b);
            }
            else if((c>a||c>b)&&(c<a||c<b)){
                System.out.println(c);
            }
        }
        // your code goes here

    }
}
