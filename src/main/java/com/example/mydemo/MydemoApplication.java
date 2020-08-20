package com.example.mydemo;

import com.example.info.RpcInfo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//@MapperScan("com.example.mapper")
public class MydemoApplication {

    public static void main(String[] args) throws IOException {

        RpcInfo rpcInfo = new RpcInfo();
        //这些信息是服务端的信息，不是客户端的信息
        rpcInfo.setPackageName("com.example.controller");
        rpcInfo.setClassName("Controller");
        rpcInfo.setMethodName("print");
        Object[] para = new Object[]{"fagejj"};
        rpcInfo.setPara(para);

        Socket socket = new Socket("127.0.0.1", 666);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
        objectOutputStream.writeObject(rpcInfo);//写入序列化后的信息
        objectOutputStream.flush();//刷新
        objectOutputStream.close();//关闭
//        SpringApplication.run(MydemoApplication.class, args);

    }

}
