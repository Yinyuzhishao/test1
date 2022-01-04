import java.util.Arrays;

public class suanfa {

        public void test5 ( int a[], int newnumber){
            int larger=a.length+1;
            int[][] c=new int[larger][larger];
            if(a.length==1) System.out.println(a[0]);
            else {
                for (int i = 0; i < a.length+1; i++) {  //造新总组
                    for (int k = 0; k < i; k++) {       //新加数字在一个已成行中的所有添加,一个新可以的组
                        int b[]=new int[larger];
                        for (int j = 0; j < k; j++) {   //不做事或[0，k）填入
//                            System.out.println(a[j]);
                            b[j]=a[j];
                        }
//                        System.out.println(newnumber);
                        b[k]=newnumber;                 //k填入
                        for (int j = k ; j < a.length; j++) {   //k+1填入
//                            System.out.println(a[j]);
                            b[k+1]=a[j];
                        }
                        c[i]= Arrays.copyOf(b,b.length);
                    }

                }
            }

        }



    public static void main(String[] args) {
    }


}
