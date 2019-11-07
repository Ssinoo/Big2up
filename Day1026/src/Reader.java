import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D://hjj.txt");
        FileWriter fw = new FileWriter("D://杂物堆//hjj.txt");
        char[] chars = new char[1024];
        int len = 0 ;
        while ((len=fr.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
            fw.write(new String(chars,0,len));
        }
        fr.close();
        fw.close();
    }
}
