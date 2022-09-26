package calculator.Com.nest;

import java.sql.SQLOutput;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        {
            int a, b, c;
            System.out.println("enter 2 number");
            Scanner s = new Scanner(System.in);
            a = s.nextInt();
            b = s.nextInt();
            while (true) {
                System.out.println("select an option");
                System.out.println("addition");
                System.out.println("subtraction");
                System.out.println("multiplication");
                System.out.println("division");
                c = s.nextInt();
                switch (c) {
                    case 1:
                        System.out.println("1. addition");
                        break;
                    case 2:
                        System.out.println("2. subtraction");
                        break;
                    case 3:
                        System.out.println("3. multiplication");
                        break;
                    case 4:
                        System.out.println("4. division");
                        break;
                    case 5:
                        System.exit(0);
                        break;
                }

            }

        }

    }}
