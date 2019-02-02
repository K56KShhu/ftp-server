package com.zkyyo.ftp.server.command;

import com.zkyyo.ftp.server.service.FtpThread;

import java.io.Writer;

/**
 * @author zkyyo
 * @create 2018-06-13 5:36 PM
 **/
public interface FtpCommand {
    void process(String data, Writer writer, FtpThread t);
}
