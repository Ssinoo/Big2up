import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    抽象基类        节点流（文件流）
    InputStream     FileInputStream
    OutputStream    FileOutputStream
    Reader          FileReader
    Writer          FileWiter
 */
public class FileInputOutputStream {
    //从硬盘取文件内容到程序中
    @Test
    public void test1() throws IOException {
        File file = new File("D:\\杂物堆\\666.txt" );
        //创建一个FileInputStream类的对象
        FileInputStream fis = new FileInputStream(file);
        //调用FileInputStream的方法，实现file文件的读取
        /*
            read()； 读取文件的一个字节
         */
        int b = fis.read();
        while(b!=-1){
            System.out.print((char) b);
            b= fis.read();
        }
        fis.close();
    }

}
