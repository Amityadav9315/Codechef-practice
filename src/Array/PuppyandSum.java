import java.util.*;
import java.lang.*;
import java.io.*;

class PuppyandSum {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("entre the number ");

         int sum=0;
        int d = sc.nextInt();
        int n = sc.nextInt();
        if (d > 1) {

            while (d > 0) {

                for (int i = n; i > 0; i--) {
                    sum = sum + i;


                }
                n=sum;
                sum=0;
                d--;

            }
        }
            else{

                for (int i = n; i > 0; i--) {
                    sum = sum + i;


                }
                n=sum;
            }
            System.out.println(n);
        }
    }




