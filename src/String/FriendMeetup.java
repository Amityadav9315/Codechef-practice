import java.util.*;
import java.lang.*;
import java.io.*;

class FriendMeetup
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            System.out.println("Entre the number");
            int x1=sc.nextInt();
            int x2=sc.nextInt();


            if(x1==x2||x1>x2){
                System.out.println("Yes");
            }

            else{
                System.out.println("No");
            }
        }
    }
    // your code goes here

}

