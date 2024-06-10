import java.util.*;
public class SaveWaterSaveLife {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);
                int h=sc.nextInt();
                int x=sc.nextInt();
                int y=sc.nextInt();
                int c=sc.nextInt();

                int d=y/2+x;
                int k=h*d;
                if(k<=c){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }



                // your code goes here

            }
        }



