import java.util.*;
public class BestofTwo {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbre");
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int b3 = sc.nextInt();
        int max1 = 0, max2 = 0, max3 = 0, max4 = 0;
        if (a1 > max1) {
            max1 = a1;
        }
        if (a2 > max1) {
            max1 = a2;
        }
        if (a3 > max1) {
            max1 = a3;
        }

        if (a1 > max2 &&( a1 < max1||a1==max1)) {
            max2 = a1;
        }
        if (a2 > max2 &&( a2 < max1||a2==max1)) {
            max2 = a2;
        }
        if (a3 > max2 && (a3 < max1||a3==max1)) {
            max2 = a3;
        }

        int c = max1 + max2;

        if (b1 > max3) {
            max3 = b1;
        }
        if (b2 > max3) {
            max3 = b2;
        }
        if (b3 > max3) {
            max3 = b3;
        }

        if (b1 > max4 && (b1 < max3||b1==max3)) {
            max4 = b1;
        }
        if (b2 > max4 && (b2 < max3||b2==max3)) {
            max4 = b2;
        }
        if (b3 > max4 && (b3 < max3||b3==max3)) {
            max4 = b3;
        }

        int d = max3 + max4;
        if (c > d) {
            System.out.println("Alice");
        } else if (d > c) {
            System.out.println("Bob");
        } else {
            System.out.println("Tie");
        }


    }
}





