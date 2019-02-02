package com.zkyyo.ftp.server.command;

import com.zkyyo.ftp.server.service.FtpThread;

import java.io.IOException;
import java.io.Writer;

/**
 * @author zkyyo
 * @create 2018-06-13 5:53 PM
 **/
public abstract class AbstractFtpCommand implements FtpCommand {
    @Override
    public abstract void process(String data, Writer writer, FtpThread t);

    public void sendResponse(String response, Writer writer) {
        try {
            writer.write(response);
            writer.write("\r\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
