import java.util.*;
public class PenalityShot {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);
                int count=0;
                int max=0;
            int [] arr=new int [10];
            for(int i=0; i<10; i++){
                int c=arr[i]%2;
                if(c==0&&arr[i]==1){
                    count++;
                    System.out.println("Yes");


                }
                else{
                    max++;

            }
                if(count>max){
                    System.out.println("1");
                }
                else{
                    System.out.println("2");
                }
        }
            // your code goes here

        }
    }


