import org.junit.Test;

import java.io.File;

public class File1 {

     @Test
    public void test1(){
        File file = new File("D:/杂物堆/666.txt");
         System.out.println(file.getName());
         System.out.println(file.canRead());
         System.out.println(file.canWrite());
         System.out.println(file.isFile());
         System.out.println(file.isDirectory());
         System.out.println(file.lastModified());
         System.out.println(file.length());
         System.out.println(file.exists());
         System.out.println(file);


    }
}
