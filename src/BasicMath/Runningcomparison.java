import java.util.*;
public class Runningcomparison {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();
                int[] a = new int[n];
                int[] b = new int[n];
                int count =0;

                for (int i = 0; i < n; i++) {
                    a[i] = scanner.nextInt();
                }

                for (int i = 0; i < n; i++) {
                    b[i] = scanner.nextInt();
                }
                for(int i=0; i<n; i++) {
                    if (2 * b[i] < a[i] && 2 * a[i] < b[i]) {
                        count++;
                    }
                    count=n-count;
                }
                    System.out.println(count);

            }
            // Your code goes here
        }



