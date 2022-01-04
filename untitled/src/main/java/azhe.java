import org.junit.Test;
import org.openjdk.jol.info.ClassLayout;

import java.io.*;

public class azhe {
Double i=1.0;
    private static final Integer[] SMALL_VALUES = new Integer[256];
    @Test
    public void test(){
        System.out.println(ClassLayout.parseInstance(new azhe()).toPrintable());

    }
    @Test
    public void test2() throws IOException {
//        OutputStream os = new FileOutputStream("./1.txt");
//        byte[] bytes  = "12321".getBytes();
//        os.write(bytes);
        String.class.getClass();
        Class clz = String.class;
    }
    @Test
    public void test3() throws IOException {
        InputStream is = new FileInputStream("./markconver.html");
        //byte[] b = new byte[3];
        //is.read(b);
        //String s=new String(b);
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
       // System.out.println(s);
        System.out.println(br.readLine());
    }
    @Test

    public void test5(){
        int num = 3;
        System.out.println(tst(num));


    }
    public static int tst(int b){
        try{
            b += 10;
            //System.out.println(b);
            //System.exit(0);
            return ++b; // a return
        }catch(RuntimeException e){
            return b;
        }
        catch(Exception e2){
            return b;
        }
        finally{
            System.out.println(b);
            b += 10;
            System.out.println(b);
            // b return
        }
    }
    public int fina(){
        int a = 1;
        try {
            System.out.println(a);
            a += 2;
            System.out.println(a);
            a/=0;
            //System.out.println(a);
                return a += 4;
        } catch (Exception e) {
            System.out.println(a);
            a += 8;
            System.out.println(a);
            a /= 0;
            //System.out.println(a);
            a += 16;
            //System.out.println(a);
            return a;
        } finally {
            System.out.println(a);
            return a += 32;
        }
    }


    public void test4() throws IOException {
        InputStream is = new FileInputStream("./markconver.html");
        OutputStream os = new FileOutputStream("./1.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        for(String s=br.readLine();s!= null;s=br.readLine()){
//            System.out.println(s);
            bw.write(s+"\n");
            bw.flush();
        }

//        do {
//            s=br.readLine();
//            System.out.println(s);
//        } while ( s!= null);
        //br.readLine()
        //System.out.println(br.readLine());

    }
    

}

   
