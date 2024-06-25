import java.util.*;
public class Gamebetween2friend {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);
                int a=sc.nextInt();
                int b=sc.nextInt();
                int c=sc.nextInt();
                int d=sc.nextInt();
                if(a==b){
                    System.out.println("N");
                }
                else if(a>b){
                    b=b+c;
                    if(b>a){
                        a=a+d;
                    }
                    if(a>b){
                        b=b+d;
                    }
                    if(a>b){
                        System.out.println("N");
                    }
                    else{
                        System.out.println("S");
                    }
                }
                else if(a<b){
                    a=a+c;
                    if(a>b){
                        b=b+d;
                    }
                    if(b>a){
                        a=a+d;
                    }
                    if(a>b){
                        System.out.println("N");
                    }
                    else{
                        System.out.println("S");
                    }
                }



            }
            // your code goes here

        }



