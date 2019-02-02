package com.zkyyo.ftp.server.service;

import com.zkyyo.common.constant.ServerConstant;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author zkyyo
 * @create 2018-06-14 5:16 PM
 **/
public class UserServer extends Thread {
    @Override
    public void run() {
        ServerSocket server = null;
        try {
            server = new ServerSocket(ServerConstant.getServerUserSystemPort());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("user server waiting...");


        if (server != null) {
            while (true) {
                Socket socket = null;
                try {
                    socket = server.accept();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                UserThread userThread = new UserThread(socket);
                userThread.start();
            }
        }
    }
}
