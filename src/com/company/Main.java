package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner myInput1 = new Scanner(System.in);
        User user = new User(myInput1, System.out);
        HandleFile file = new HandleFile(user.getFileName());
        System.out.println("These are the items you have: ");
        file.readEntry(s -> System.out.println(s));

        System.out.println("Hit enter twice to save items");
        for (String entry = user.getEntry(); !entry.isEmpty(); entry = user.getEntry()) {
            file.addEntry(entry);
        }
        file.save();
    }
}

