package com.biz.payroll.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;

public class FileOperatios {
    public static void main(String[] args) throws IOException {

        //Create directory
        String folderPath="C:\\Users\\MS\\IdeaProjects\\Employee Payroll Service\\src\\main\\resources";
        Path directory=Paths.get(folderPath+"/demoFolder");
        //if not exit create new directory
        if(Files.notExists(directory)){
            Files.createDirectory(directory);
            System.out.println("Folder is craeted");
        }

        //Create new file
        String folder=folderPath+"/demoFolder";
        Path filePath=Paths.get(folder+"/java.txt");
        if(Files.notExists(filePath)){
            Files.createFile(filePath);
            System.out.println("File is created");
            System.out.println(filePath);
        }

        //Delete file and checking file not exit
        Files.delete(filePath);
        if(Files.notExists(filePath)){
            System.out.println("File is Not exit");
        }
        // Create multiple files

        IntStream.range(1,10).forEach(value ->{
            Path textFile = Paths.get(directory +"/java"+value+".txt");
            if(Files.notExists(textFile));
            try {Files.createFile(textFile);
            }catch (IOException e){
                System.out.println(e.getCause());
            }

        });

        //Print file and folders
      //  Files.list(directory).filter(Files::isRegularFile).forEach(System.out::println);
        Files.newDirectoryStream(directory).forEach(System.out::println);
        Files.newDirectoryStream(directory, path -> path.toFile().isFile()&& path.toString().startsWith("java"))
                .forEach(System.out::println);


    }
}
