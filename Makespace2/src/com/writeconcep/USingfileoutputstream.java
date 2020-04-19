package com.writeconcep;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class USingfileoutputstream {
    public static void main(String[] args) throws IOException {
         String location = "UsingFileoutput.txt";
         String content = "File output stream methd takes raw byte infromation from the text file converts it to bytes";

        FileOutputStream outputStream = new FileOutputStream(location);
        byte[] writethis  =content.getBytes();

        outputStream.write(writethis);
        outputStream.close();

    }
}
