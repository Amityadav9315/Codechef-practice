import java.util.*;
public class HowmuchScholarship {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);
            int r=sc.nextInt();
            if(r>=1&&r<=50){
                System.out.println("100");
            }
            else  if(r>50&&r<=100){
                System.out.println("50");
            }
            else{
                System.out.println("0");
            }
            // your code goes here

        }
    }


