package com;

import java.util.*;

class EmployeeException extends Exception {
    public EmployeeException(String s) {
        super(s);
    }
}

class Main {
    static void calSal(int sal) throws EmployeeException {
        if (sal < 3000) {
            throw new EmployeeException("Salary too low");
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int sal = read.nextInt();
        boolean flag = false;
        try {
            calSal(sal);
        } catch (EmployeeException e) {

            System.out.println("Exception Found| Stack Trace details :");

            e.printStackTrace();
            flag = true;
        } finally {
            System.out.println("Salary processed successfully.");
            if (flag) {
                System.out.println("Warning, Exceptions occurred");
            } else {
                System.out.println("No warnings, All Clear.");
            }
        }
    }
}