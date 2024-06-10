import java.util.*;
public class Howmanydigitihave {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            if(n>=1&&n<=9){
                System.out.println("1");
            }
            else if(n>=10&&n<=99){
                System.out.println("2");
            }
            else if(n>=100&&n<=999){
                System.out.println("3");
            }
            else{
                System.out.println("More than 3 digits");
            }
            // your code goes here

        }
    }


