package com.company;

import java.io.PrintStream;
import java.util.Scanner;



public class User {
    private Scanner myInput;
    private PrintStream userOutput;

    public User(Scanner myInput, PrintStream userOutput) {
        this.myInput = myInput;
        this.userOutput = userOutput;
    }
    public String getFileName() {
        return getPrompt("Enter your file name: ");
    }
    public String getPrompt(String prompt) {
        userOutput.println(prompt);
        return myInput.nextLine();
    }

    public String getEntry() {
        return getPrompt("Enter your your item: ");
    }



}
