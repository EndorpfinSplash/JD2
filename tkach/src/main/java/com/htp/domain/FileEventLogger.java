package com.htp.domain;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileEventLogger implements EventLogger{
    private String filename = "log.txt";
    private File myFile = new File(filename != null ? filename : null);

    public FileEventLogger() { }

    public FileEventLogger(String filename) {
        this.filename = filename;
    }

    @Override
    public void logEvent(Event event) {
        try {
            FileUtils.writeStringToFile(myFile, event.toString(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//
//    public void init() throws IOException {
//        myFile.canWrite();
//    }

}
