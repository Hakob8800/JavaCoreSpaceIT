package chapter12.enums;

public class EnumDemo2 {

    public static void main(String[] args) {

        for (Apple apple : Apple.values()) {
            System.out.println(apple+" costs "+apple.getPrice());
        }

    }
}
