package chapter12.enums;

public class EnumDemo {
    public static void main(String[] args) {
        Apple apple = Apple.RED_DEL;
        System.out.println(apple);
        Apple apple2 = Apple.JONATHAN;
        if(apple==Apple.RED_DEL){
            System.out.println(apple+"= redDel");
        }
        switch (apple2){
            case RED_DEL:
                System.out.println(Apple.RED_DEL);
                break;
            case WINESAP:
                System.out.println(Apple.WINESAP);
                break;
            case CORTLAND:
                System.out.println(Apple.CORTLAND);
                break;
            case JONATHAN:
                System.out.println(Apple.JONATHAN);
                break;
            case GOLDEN_DEL:
                System.out.println(Apple.GOLDEN_DEL);
                break;
        }
        Apple[] allApples = Apple.values();
        for (Apple ap : allApples) {
            System.out.println(ap);
        }
        Apple apple3 = Apple.valueOf("GOLDEN_DEL");
        System.out.println(apple3);
    }
}
