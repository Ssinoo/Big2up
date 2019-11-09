import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/*
      TCP通信的服务器端，接受客户端的请求，读取客户端的数据，给客户端写回数据
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {

        //创建服务器
        ServerSocket server = new ServerSocket(8888);
        while(true) {
            //使用accept方法来 获取请求到的Socket对象
            Socket socket = server.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        // 使用Socket对象中的方法getInputStream()获取网络字节输入流的InputStream对象
                        InputStream is = socket.getInputStream();

                        File file = new File("D://杂物堆//照片");
                        if (!file.exists()) {
                            file.mkdir();
                        }
                        FileOutputStream fos = new FileOutputStream(file + "//" + System.currentTimeMillis() + new Random().nextInt() + ".jpg");

                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while ((len = is.read(bytes)) != -1) {
                            fos.write(bytes, 0, len);
                        }

                        OutputStream os = socket.getOutputStream();
                        os.write("上传成功".getBytes());
                        //释放资源
                        fos.close();
                        socket.close();
                        server.close();
                    }catch (IOException e){
                        System.out.println(e);
                    }
                }
            }).start();

        }
    }
}
