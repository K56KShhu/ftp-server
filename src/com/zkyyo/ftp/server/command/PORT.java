package com.zkyyo.ftp.server.command;

import com.zkyyo.ftp.server.service.FtpThread;

import java.io.Writer;

/**
 * @author zkyyo
 * @create 2018-06-23 10:27 PM
 **/
public class PORT extends AbstractFtpCommand {
    @Override
    public void process(String data, Writer writer, FtpThread t) {
        String response = "200 the port an ip have been get";
        String[] iAp = data.split(",");
        String ip = iAp[0];
        String port = Integer.toString(Integer.parseInt(iAp[1]));
        System.out.println("ip is " + ip);
        System.out.println("port is " + port);
        t.setDataHost(ip);
        t.setDataPort(Integer.parseInt(port));
        sendResponse(response, writer);
//            writer.write(response);
//            writer.write("\r\n");
//            writer.flush();
    }
}
