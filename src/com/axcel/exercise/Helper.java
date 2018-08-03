package com.axcel.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Helper {


    // Method #1
    private void fileStreamUsingFiles(String fileName) {
        try {
            Stream<String> lines = Files.lines(Paths.get(fileName));
            System.out.println("<!-----Read all lines as a Stream-----!>");
            lines.forEach(System.out :: println);
            lines.close();
        } catch(IOException io) {
            io.printStackTrace();
        }
    }

    // Method #2
    private  void filterFileData(String fileName) {
        try {
            Stream<String> lines = Files.lines(Paths.get(fileName)).filter(line -> line.startsWith("s"));
            System.out.println("<!-----Filtering the file data using Java8 filtering-----!>");
            lines.forEach(System.out :: println);
            lines.close();
        } catch(IOException io) {
            io.printStackTrace();
        }
    }

    // Method #3
    private  void fileStreamUsingBufferedReader(String fileName) {
        try {
            BufferedReader br = Files.newBufferedReader(Paths.get(fileName));
            Stream <String> lines = br.lines().map(str -> str.toUpperCase());
            System.out.println("<!-----Read all lines by using BufferedReader-----!>");
            lines.forEach(System.out::println);
            lines.close();
        } catch (IOException io) {
            io.printStackTrace();
        }
    }

    public static void main(String[] args) {

        String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);


        Helper helper = new Helper();

        String fName = "days.txt";

        // Method #1 - Read all lines as a Stream
        helper.fileStreamUsingFiles(fName);

        System.out.println();

        // Method #2 - Read file with a filter
        helper.filterFileData(fName);

        System.out.println();

        // Method #3 - In Java8, 'BufferedReader' has the 'lines()' method which returns the file content as a Stream
        helper.fileStreamUsingBufferedReader(fName);
    }
}
