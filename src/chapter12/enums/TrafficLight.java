package chapter12.enums;

public enum TrafficLight {
    GREEN, YELLOW, RED;

    public static void main(String[] args) throws InterruptedException {
        TrafficLight tl = TrafficLight.RED;
        for (int i = 0; i < 30; i++) {
            System.out.print("\b\b\b\b\b\b"+tl);
            switch (tl) {
                case RED:
                    Thread.sleep(6000);
                    tl = YELLOW;
                    break;
                case YELLOW:
                    Thread.sleep(1000);
                    tl = GREEN;
                    break;
                case GREEN:
                    Thread.sleep(6000);
                    tl = RED;
                    break;
            }
        }
    }
}
