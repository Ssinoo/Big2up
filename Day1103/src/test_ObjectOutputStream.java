import java.io.*;
import java.util.ArrayList;

/*
    练习：序列化集合
        当我们想在文件保存多个对象的时候
        把多个对象储存到一个集合中
        对集合进行序列化和反序列化
 */
public class test_ObjectOutputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("德玛西亚",18));
        list.add(new Person("诺克萨斯",19));
        list.add(new Person("艾欧尼亚",20));
        //创建一个序列化流对象 ObjectOutputStream
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:/list.txt"));
        //writeObject，对集合进行序列化
        oos.writeObject(list);
        //创建一个反序列化流对象 ObjectInputStream
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D://list.txt"));
        //使用readObject读取文件中保存的集合
        Object o = ois.readObject();
        //把Object的类型的集合转化为ArrayList类型
        ArrayList<Person> list2 = (ArrayList<Person>)o;
        //遍历Arraylist集合
        for (Person p :
                list2
             ) {
            System.out.println(p);

        }
        oos.close();
        ois.close();

    }
}
