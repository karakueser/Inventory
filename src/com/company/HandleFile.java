package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

// This code is primarily from w3schools
public class HandleFile {
    private ArrayList<String> myArray;
    private final File file;
    public HandleFile(String fileName) {
        this.file = new File(fileName);
        myArray = new ArrayList<>();
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
                loadFile(entry -> myArray.add(entry));
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    private void loadFile(Consumer<String> lineHandler) {
        Scanner myReader = null;
        try {
            myReader = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while(myReader.hasNextLine()) {
                lineHandler.accept(myReader.nextLine());
        }
    }
    public void readEntry(Consumer<String> lineHandler) {
        for (String entry: myArray) {
            lineHandler.accept(entry);
        }
    }
    public void addEntry(String entry) {
        myArray.add(entry);
    }

    public void save() {
        FileWriter myWriter = null;
        try {
            myWriter = new FileWriter(file.getName(),true);
            for (String entry: myArray) {
                myWriter.write(entry + "\n");
            }
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

