import java.util.*;
public class WhichFuelisCheaper {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);
                int x=sc.nextInt();
                int y=sc.nextInt();
                int a=sc.nextInt();
                int b=sc.nextInt();
                int k=sc.nextInt();
                int c=x+(a*k);
                int d=y+(b*k);
                if(c==d){
                    System.out.println("SAME PRICE");
                }
                else if(c>d){
                    System.out.println("DIESEL");
                }
                else{
                    System.out.println("PETROL");
                }
            }
            // your code goes here

        }



