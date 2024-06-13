import java.util.*;
public class LargestandSecondlargest {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int max = 0, max2 = 0;
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();

            }
            for (int i = 0; i < n; i++) {
                if (a[i] > max) {
                    max = a[i];
                }
            }


                for (int i = 0; i < n; i++) {
                    if (a[i] > max2 && a[i] != max) {
                        max2 = a[i];
                    }
                }



            System.out.println(max + max2);

        }

            // Your code goes here
        }



