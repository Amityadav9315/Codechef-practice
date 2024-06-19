import java.util.*;
public class CricketRanking {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);
                int r1=sc.nextInt();
                int w1=sc.nextInt();
                int c1=sc.nextInt();
                int r2=sc.nextInt();
                int w2=sc.nextInt();
                int c2=sc.nextInt();
                int count1=0;
                int count2=0;
                // int d=r1+w1+c1;
                // int e=r2+w2+c2;
            if(r1>r2){
                count1++;
                if(w1>w2){
                    count1++;
                }
                if(c1>c2){
                    count1++;
                }
            }
            if(r1<r2){
                count2++;
                if(w1<w2){
                    count2++;
                }
                if(c1<c2){
                    count2++;
                }
            }
                if(count1>count2){
                    System.out.println("A");
                }
                else{
                    System.out.println("B");
                }
                // your code goes here

            }
        }



