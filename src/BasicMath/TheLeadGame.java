import java.util.*;

public class TheLeadGame {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int Si=sc.nextInt();
            int Ti=sc.nextInt();
            if(Si>Ti){
                System.out.print("1"+" "   +  (Si-Ti));
                // System.out.println(Si-Ti);
            }
            else {
                System.out.print("2"+" "+(Ti-Si));


            }

            // your code goes here

        }
    }


