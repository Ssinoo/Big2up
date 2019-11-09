import java.io.*;
import java.net.Socket;

/*
    TCP通信的客户端，向服务器发送连接请求，读取服务器写的数据
    套接字：IP地址和端口号的网咯单位

    构造方法：
        Socket(String host , int port)创建一个流套接字并将
        String host ：服务器主机的名称/服务器的Ip地址
        int port ：服务器的端口号
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        //创建一个FileInputStream对象
        FileInputStream fi = new FileInputStream("D://noo.jpg");
        //创建Socket对象， 构造方法中绑定服务器的IP地址和端口号
        Socket socket = new Socket("10.168.7.4",8888);
        //Socket的方法 getOutputStream 获取 OutputStream对象
        OutputStream os = socket.getOutputStream();
        //使用FileInputStream对象的read方法获取本地的文件
        int len =0;
        byte[] bytes = new byte[1024];
        while((len=fi.read(bytes))!=-1){
            //将读取的文件上传到服务器
            os.write(bytes,0,len);
        }
        //因为读不到-1，所以使用shutdown方法
        socket.shutdownOutput();

        InputStream is = socket.getInputStream();
        int len1 =0;
        byte[] bytes1 = new byte[1024];
        while((len1=is.read(bytes1))!=-1){
            //读服务器回写的数据
             System.out.println(new String(bytes1,0,len1));
        }
        socket.close();
        fi.close();

    }
}
