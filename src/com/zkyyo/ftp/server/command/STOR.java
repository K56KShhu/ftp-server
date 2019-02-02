package com.zkyyo.ftp.server.command;

import com.zkyyo.ftp.server.service.FtpThread;

import java.io.*;
import java.net.Socket;

/**
 * @author zkyyo
 * @create 2018-06-13 7:54 PM
 **/
public class STOR extends AbstractFtpCommand {

    @Override
    public void process(String data, Writer writer, FtpThread t) {
        try {
            sendResponse("150 binary data connection", writer);

            // 获取数据连接
            Socket dataSocket = t.getDataSocket();

            // 接收文件
            File localFile = new File(data);
            InputStream inputStream = dataSocket.getInputStream();
            FileOutputStream fileOutputStream = new FileOutputStream(localFile);
            int offset;
            byte[] bytes = new byte[1024];
            while ((offset = inputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, offset);
            }

            fileOutputStream.close();
            inputStream.close();
            dataSocket.close();

            sendResponse("226 transfer complete", writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
