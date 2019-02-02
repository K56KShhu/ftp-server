package com.zkyyo.ftp.server.command;

import com.zkyyo.ftp.server.dao.UserData;
import com.zkyyo.ftp.server.service.FtpThread;

import java.io.Writer;

/**
 * @author zkyyo
 * @create 2018-06-13 5:42 PM
 **/
public class USER extends AbstractFtpCommand {
    @Override
    public void process(String data, Writer writer, FtpThread t) {
        String response = "";
        if (UserData.ifUserExist(data)) {
            t.setUsername(data);
            response = "331 server needs password";
        } else {
            response = "501 user is not available";
        }

        sendResponse(response, writer);
    }
}
