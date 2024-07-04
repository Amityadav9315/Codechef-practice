import java.util.*;
public class ballandBoxes {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number");
                int n=sc.nextInt();
                int k=sc.nextInt();
            if(k==0&&n==4){
                System.out.println("Off");
            }
            else if(k==0&&(n==1||n==2||n==3)){
                System.out.println("On");
            }
            else if(k==1&&n==0){
                System.out.println("On");
            }
            else if(k==1&&(n==1||n==2||n==3)){
                System.out.println("Ambiguous");
            }

               // else if()
            }
            // your code goes here

        }



