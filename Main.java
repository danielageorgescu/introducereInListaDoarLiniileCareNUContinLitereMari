package com.itfactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.lang.Character.*;

public class Main {

    public static void main(String[] args) {
        try{
        Path path = Paths.get("problema4.txt");
        BufferedReader reader = Files.newBufferedReader(path);
        String line;

            while ((line= reader.readLine())!=null){
                if (!(line.matches(".*[A-Z].*"))){
                System.out.println(line);
                }
            }
       } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
