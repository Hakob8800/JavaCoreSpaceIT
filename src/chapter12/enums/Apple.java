package chapter12.enums;

public enum Apple {
    JONATHAN(20),
    GOLDEN_DEL(18),
    RED_DEL(90),
    WINESAP(50),
    CORTLAND(25);

    private int price;

    Apple(int p){
        price = p;
    }

    public int getPrice() {
        return price;
    }
}
