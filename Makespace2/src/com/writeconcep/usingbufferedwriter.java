package com.writeconcep;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class usingbufferedwriter {

    public static void  main (String[]  args) throws IOException {

        String location = "Usingbufferedwriter";
        String contents = "Buffered writer test is cost efffectove";

        FileWriter fileWriter = new FileWriter(location);

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write(contents);

        bufferedWriter.close();

    }
}
