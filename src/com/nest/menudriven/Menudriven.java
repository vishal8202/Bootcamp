package com.nest.menudriven;

import java.awt.*;
import java.util.Scanner;

public class Menudriven {
    public static void main(String[] args) {
        int Choice;
        while(true)
        {
        System.out.println("Select an option");
        System.out.println("1. add student");
        System.out.println("2. select student");
        System.out.println("3. delete student");
        System.out.println("4. view all student");
        System.out.println("5 exit");

            Scanner scanner=new Scanner(System.in);
            Choice =scanner.nextInt();

            switch (Choice) {
                case 1:
                    System.out.println("add student");
                    break;
                case 2:
                    System.out.println("select student");
                case 3:
                    System.out.println("delete student");
                case 4:
                    System.out.println("view all student");
                case 5:
                    System.exit(0);
            }
            }

    }
}

