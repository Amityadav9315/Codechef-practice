import java.util.*;
public class TabletBuy {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            while(T>0){
                int N = sc.nextInt();
                int B = sc.nextInt();

                int[][] tab = new int[N][3];

                int mxArr = 0;
                for (int i=0;i<N ;i++){
                    for (int j=0;j<=2 ;j++){
                        tab[i][j] = sc.nextInt();
                    }
                    if((tab[i][0] * tab[i][1])>mxArr && (tab[i][2] <= B))
                        mxArr = (tab[i][0] * tab[i][1]);
                }
                if(mxArr == 0)
                    System.out.println("no tablet");
                else
                    System.out.println(mxArr);
                T--;
            }
        }
    }


