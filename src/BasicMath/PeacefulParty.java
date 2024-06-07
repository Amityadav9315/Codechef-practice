import java.util.*;

public class PeacefulParty {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0){
                int Pa=sc.nextInt();
                int Pb=sc.nextInt();
                int Pc=sc.nextInt();
                if(Pa+Pc>Pb){
                    System.out.println(Pa+Pc);

                }
                else{
                    System.out.println(Pb);
                }
            }

            // your code goes here

        }
    }


