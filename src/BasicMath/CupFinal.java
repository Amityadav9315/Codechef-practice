import java.util.*;

public class CupFinal {


        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);
                int x=sc.nextInt();
                int y=sc.nextInt();
                int d=sc.nextInt();
                if(x>y){
                    int a=x-y;
                    if(a<=d){
                        System.out.println("Yes");
                    }
                    else{
                        System.out.println("No");
                    }
                }

                else{
                    int b=y-x;
                    if(b<=d){
                        System.out.println("Yes");

                    }
                    else{
                        System.out.println("No");
                    }

                }
            }
            // your code goes here

        }



