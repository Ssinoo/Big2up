import java.io.*;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        //创建一个哈希map集合对象，储存文本
        HashMap<String,String> map = new HashMap<>();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D://hjj.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D://noo.txt"));
        BufferedReader br= new BufferedReader(new FileReader("D://hjj.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D://hjj.txt"));
        String line;
        while ((line =br.readLine())!=null){
            String[] arr = line.split("\\.");
            //切割好的放在hasmap集合中（key是有序的 会自动排序1,2，3..）
            map.put(arr[0],arr[1]);
        }
         //遍历HasMap集合，获取每一个键值对
        for (String key:map.keySet()
             ) {
            String value = map.get(key);

            line = key +"."+value;

            bw.write(line);
            bw.newLine();
            
        }
        byte[] bytes = new byte[1024];
        int len =0 ;
         while((len=bis.read())!=-1){
             bos.write(bytes,0,len);
         }

        bis.close();
        bos.close();
        br.close();
        bw.close();
        long e = System.currentTimeMillis();
        System.out.println("共耗时"+(s-e)+"ms");

    }
}
