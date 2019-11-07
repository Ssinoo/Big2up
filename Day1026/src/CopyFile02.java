import java.io.*;

public class CopyFile02 {
    public static void main(String[] args) {
        long s = System.currentTimeMillis();
        try(    //匿名对象

            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D://abc.jpg"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D://照片//abc.jpg"));){
            System.out.println(bis.read());
            int len = 0;
            //使用数组来缓冲数据
            byte[] bytes = new byte[1024];
            while((len = bis.read())!=-1){
                bos.write(bytes,0,len);
            }
        }
        catch (IOException e ){
            System.out.println(e);
        }
        long e = System.currentTimeMillis();
        System.out.println("共耗时"+(e-s)+"ms");
    }
}
