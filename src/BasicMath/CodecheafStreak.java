import java.util.*;
public class CodecheafStreak {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n=scanner.nextInt();
                int count1 = 0;
                int count2 = 0;
                int count3 = 0;
                int count4 = 0;

                int[] a = new int[n];
                int[] b = new int[n];

                for (int i = 0; i < n; i++) {
                    a[i] = scanner.nextInt();
                    if (a[i] > 0) {
                        count1++;
                    } else if (a[i] == 0) {
                        count2++;
                    }
                }

                int max1 = Math.max(count1, count2);

                for (int i = 0; i < n; i++) {
                    b[i] = scanner.nextInt();
                    if (b[i] > 0) {
                        count3++;
                    } else if (b[i] == 0) {
                        count4++;
                    }
                }

                int max2 = Math.max(count3, count4);

                if (max1 == max2) {
                    System.out.println("Draw");
                } else if (max1 > max2) {
                    System.out.println("Om");
                } else {
                    System.out.println("Addy");
                }
            }

        }



