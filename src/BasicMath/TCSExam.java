package BasicMath;

public class TCSExam {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0){
                int a=sc.nextInt();
                int b=sc.nextInt();
                int c=sc.nextInt();
                int d=sc.nextInt();
                int e=sc.nextInt();
                int f=sc.nextInt();
                int r=a+b+c;
                int s=d+e+f;
                if(r>s){
                    System.out.println("Dragon");
                }
                else if(r<s){
                    System.out.println("Sloth");
                }
                else if(r==s&&(a>d||b>e||c>f)){
                    System.out.println("Dragon");
                }
                else if(r==s&&(a<d||b<e||c<f)){
                    System.out.println("Sloth");
                }
                else if(a==d&&b==e&&c==f){
                    System.out.println("Tie");
                }





            }
            // your code goes here

        }
    }

}
