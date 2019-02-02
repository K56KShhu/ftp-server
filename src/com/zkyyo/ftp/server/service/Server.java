package com.zkyyo.ftp.server.service;

import com.zkyyo.ftp.server.dao.UserData;

/**
 * @author zkyyo
 * @create 2018-06-14 5:09 PM
 **/
public class Server {

    public static void main(String[] args) {
        UserData.init();
        // 启动 ftp服务器
        FtpServer ftpServer = new FtpServer();
        ftpServer.start();
        // 启动 user服务器
        UserServer userServer = new UserServer();
        userServer.start();
    }
}
