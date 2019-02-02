package com.zkyyo.ftp.server.command;

import com.zkyyo.ftp.server.dao.UserData;
import com.zkyyo.ftp.server.service.FtpThread;

import java.io.Writer;

/**
 * @author zkyyo
 * @create 2018-06-13 5:50 PM
 **/
public class PASS extends AbstractFtpCommand {

    @Override
    public void process(String data, Writer writer, FtpThread t) {
        String response = "";
        if (UserData.verifyUser(t.getUsername(), data)) {
            response = "230 login success";
            t.setLogin(true);
        } else {
            response = "530 login fail";
        }

        sendResponse(response, writer);
    }
}
