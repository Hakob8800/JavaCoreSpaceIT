package chapter5;

import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = scanner.nextInt();
        switch (num){
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("hi");
                break;
            case 3:
            case 13:
            case 23:
                System.out.println("barev");
                break;
            case 17:
                System.out.println("privet");
                break;
            default:
                System.out.println("hajox");
        }

    }
}
