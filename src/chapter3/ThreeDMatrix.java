package chapter3;

public class ThreeDMatrix {
    public static void main(String[] args) {
        int threeD[][][] = new int[4][5][6];
        for (int i = 0; i < threeD.length; i++) {
            for (int j = 0; j < threeD[i].length; j++) {
                for (int k = 0; k < threeD[i][j].length; k++) {
                    threeD[i][j][k] = i * j * k;
                    System.out.print(threeD[i][j][k]+", ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
