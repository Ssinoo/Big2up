import java.io.*;
import java.lang.Byte;

public class ButteredOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D://hjj.txt");
        FileInputStream fis = new FileInputStream("D://hjj.txt");

        //创建一个缓冲流对象
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        BufferedInputStream bis  =  new BufferedInputStream(fis);

        bos.write("我把对象写入内部缓冲中".getBytes());
        Byte[] bytes = new Byte[1024];
//        int len = 0;
//         while ((len=fis.read(bytes))!=-1){
//             System.out.println(new String(bytes,0,len));
//         }
        //刷新
        bos.flush();

    }
}
