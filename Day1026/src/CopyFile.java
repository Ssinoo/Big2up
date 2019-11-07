import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D://abc.jpg");

        FileOutputStream fos = new FileOutputStream("D://杂物堆//abc.jpg");

//        int len = 0 ;
//        while ((len=fis.read())!=-1){
//             fos.write(len);
//        }
        // 用数组缓存多个字节
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }

        fos.close();
        fis.close();
    }

}
