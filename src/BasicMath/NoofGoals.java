import java.util.*;
public class NoofGoals {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);
                int count1=0,count2=0;
                int [] a=new int [10];
                for(int i=0; i<10; i++){
                    a[i]=sc.nextInt();
                }
                for(int i=0; i<10; i++){
                    if(i%2!=0){
                        if(a[i]==1){
                            count2++;
                        }
                    }
                    else{
                        if(a[i]==1){
                            count1++;
                        }
                    }
                }
                if(count1==count2){
                    System.out.println("0");
                }

                else if(count1>count2){
                    System.out.println("1");
                }

                else if(count1<count2){
                    System.out.println("2");
                }
            }
        }

        // your code goes here







