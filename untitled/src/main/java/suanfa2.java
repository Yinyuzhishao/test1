import java.util.Arrays;

public class suanfa2 {


   static public int test5 ( int a[]){
        int r=-1;
        if (a==null)return r;
        int[] b=new int[a.length+1];

        for (int i = 0; i < a.length; i++) {
            int n=a.length;
            if (0<a[i]&&a[i]<=n){
                int c = a[i];
                b[c-1]=1;
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i]==0){r=i+1;break;}

        }

        return r;


    }


    public static void main(String[] args) {
            int a[]={7,8,9,11,12};

        System.out.println(test5(a));
    }


}
