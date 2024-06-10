import java.util.*;
public class PassingMarks {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);
                int Am=sc.nextInt();
                int Bm=sc.nextInt();
                int Cm=sc.nextInt();
                int Tm=sc.nextInt();
                int A=sc.nextInt();
                int B=sc.nextInt();
                int C=sc.nextInt();
                if((A>=Am&&B>=Bm&&C>=Cm)&&(A+B+C>=Tm)){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
            // your code goes here

        }



