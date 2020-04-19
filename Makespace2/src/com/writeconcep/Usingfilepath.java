package com.writeconcep;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Usingfilepath {
    public static void main(String[] args) throws IOException {
        String location = "Usingfilepath.txt";
        String content = "Will I success in learning java and become automation expert"+"yes, I will!!!";

        Path path = Paths.get(location);

        Files.write(path, content.getBytes());



    }
}
