package com.writeconcep;

import java.io.FileWriter;
import java.io.IOException;

public class Usingfilewriter {
    public static void main(String[] args) throws IOException {

        String location = "Usingfilewriter.txt";
        String contents = "learning java is fun";

        FileWriter filewriter = new FileWriter(location);

        filewriter.write(contents);

        filewriter.close();




    }
}
