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
        provider.fillMyMap();
        Path file = Paths.get("test_export.txt");
        Files.write(file,provider.getMyMap().values(), StandardCharsets.UTF_8);
        long endTime = System.nanoTime();
        long totalTime = (endTime-startTime) /1000000L;
        System.out.println("Total time: " + totalTime +" ms");

    }
}
