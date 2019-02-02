package com.zkyyo.ftp.server.command;

import com.zkyyo.ftp.server.service.FtpThread;

import java.io.IOException;
import java.io.Writer;

/**
 * @author zkyyo
 * @create 2018-06-13 9:51 PM
 **/
public class QUIT extends AbstractFtpCommand{
    @Override
    public void process(String data, Writer writer, FtpThread t) {
        try {
//            writer.write("221 see you\r\n");
//            writer.flush();
            sendResponse("221 see you", writer);
            writer.close();
            t.interrupt();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
