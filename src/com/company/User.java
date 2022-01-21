package com.company;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.ArrayList;


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
    


///    public boolean doesInventoryExist() {
//        userOutput.println("Does your inventory exist?");
//        userOutput.println("(1) Yes");
//        userOutput.println("(2) No");
//        return myInput.nextInt() == 1;
//    }




}
