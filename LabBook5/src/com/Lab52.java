package com;

import java.util.*;

public class Lab52
{
    static void checkName(String fN, String lN) throws Exception {
        if (fN.isEmpty() || lN.isEmpty()) {
            throw new Exception("name is blank");
        } else System.out.println("Name Accepted");
    }

    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        String fName = read.nextLine();
        String lName = read.nextLine();
        checkName(fName, lName);
    }
}