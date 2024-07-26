import java.util.*;
import java.lang.*;
import java.io.*;

class EasyPronounciation
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

            int count = 0;
            String[] arr = new String[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextLine();
            }

            for(int i = 0; i < arr.length; i++){
                char firstChar = arr[i].charAt(0);
                if(firstChar == 'b' || firstChar == 'c' || firstChar == 'd' || firstChar == 'f' || firstChar == 'g' ||
                        firstChar == 'h' || firstChar == 'j' || firstChar == 'k' || firstChar == 'l' || firstChar == 'm' ||
                        firstChar == 'n' || firstChar == 'p' || firstChar == 'q' || firstChar == 'r' || firstChar == 's' ||
                        firstChar == 't' || firstChar == 'v' || firstChar == 'w' || firstChar == 'x' || firstChar == 'y' ||
                        firstChar == 'z'){
                    count++;
                }
            }

            if(count >= 4){
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }

