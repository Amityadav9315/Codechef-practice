import java.util.*;
public class TCSExam {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Entre the input");
                int a=sc.nextInt();
                int b=sc.nextInt();
                int c=sc.nextInt();
                int d=sc.nextInt();
                int e=sc.nextInt();
                int f=sc.nextInt();
                int r=a+b+c;
                int s=d+e+f;
                if(r>s||(r==s&&a>d)||(r==s&&a==d&&b>e)||(r==s&&a==d&&b==e&&c>f)){
                    System.out.println("Dragon");
                }
                else if(r==s&&a==d&&b==e&&c==f){
                    System.out.println("Tie");
                }
                else{
                    System.out.println("Sloth");
                }





            }
            // your code goes here

        }



