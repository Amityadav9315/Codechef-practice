import java.util.*;
import java.lang.*;
import java.io.*;

class CheafandContest {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc=new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            int p = sc.nextInt();
            int q = sc.nextInt();
            int c = x + 10 * p;
            int d = y + 10 * q;
            if (c < d) {
                System.out.println("Chef");
            } else if (c > d) {
                System.out.println("Chefina");
            } else {
                System.out.println("Draw");
            }
        }
        // your code goes here

    }
}

