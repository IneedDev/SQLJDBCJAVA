package com.romaniuk.service;

import com.romaniuk.generator.Provider;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Writer {

    public static void main(String[] args) throws Exception{

        long startTime = System.nanoTime();
        System.out.println("Hello World!");
        Provider provider = new Provider();
        provider.fillMySet();
        String fileName = "peselFile.txt";
        Path file = Paths.get(System.getProperty("user.dir")+"\\"+fileName);
        //Files.write(file,provider.getMySet(), StandardCharsets.UTF_8);
        long endTime = System.nanoTime();
        long totalTime = (endTime-startTime) /1000000L;
        System.out.println("Total time: " + totalTime +" ms");
        Files.delete(file);

        provider.fillMySet();
        System.out.println(provider.getMySet().size());

    }
}
