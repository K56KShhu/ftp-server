package com.zkyyo.ftp.server.command;

/**
 * @author zkyyo
 * @create 2018-06-13 5:40 PM
 **/
public class FtpCommandFactory {
    public static FtpCommand createFtpCommand(String type) {
        switch (type.toUpperCase()) {
            case "USER":
                return new USER();
            case "PASS":
                return new PASS();
            case "QUIT":
                return new QUIT();
            case "PASV":
                return new PASV();
            case "RETR":
                return new RETR();
            case "STOR":
                return new STOR();
            case "LIST":
                return new LIST();
            case "DELE":
                return new DELE();
            default:
                return null;
        }
    }
}
