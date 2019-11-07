import java.io.FileWriter;
import java.io.IOException;

public class FlushAndClose {
    public static void main(String[] args) throws IOException {
        FileWriter  fw = new FileWriter("D://hjj.txt");
        for (int i = 0; i <10 ; i++) {
            fw.write(new String("韩晶晶 ")+i+"\r\n");
        }

        fw.close();
    }

}
