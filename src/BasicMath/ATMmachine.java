import java.util.*;
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int k=sc.nextInt();
                int[] arr=new int[n];
                for(int i=0; i<n; i++){
                    arr[i]=sc.nextInt();

                }
                int l=k;
                for(int i=0; i<arr.length; i++){
                    if(arr[i]<=k){
                        l=l-arr[i];
                        if(l>=0)
                        {
                            System.out.print("1");
                        }
                        else{
                            System.out.print("0");
                            l=l+arr[i];
                        }
                    }
                    else{
                        System.out.print("0");
                    }
                }
                System.out.println();


            // your codegoeshere




