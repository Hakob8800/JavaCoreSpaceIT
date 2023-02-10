package homeWork.ticTacTou;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {


    public static void main(String[] args) {

        final String player_X = "X  ";
        final String player_O = "O  ";

        //create a board
        String[][] board = new String[3][3];
        for (int i = 0; i < board.length; i++) {
            Arrays.fill(board[i], "*  ");
        }

        while (isFreeSpace(board)) {
            showBoard(board);

            playersMove(board, player_X);

            if (isWin(board, player_X)) {
                System.out.println("Player X is win!");
                showBoard(board);
                break;
            }

            if (!isFreeSpace(board)) {
                showBoard(board);
                System.out.println("It is a draw!");
                break;
            }

            showBoard(board);

            playersMove(board, player_O);

            if (isWin(board, player_O)) {
                System.out.println("Player O is win!");
                showBoard(board);
                break;
            }

        }
    }

    public static void showBoard(String[][] board) {
        for (int j = 0; j < board.length; j++) {
            System.out.println("\n-------");
            for (int k = 0; k < board[j].length; k++) {
                System.out.print(board[j][k]);
            }
        }
        System.out.println("\n");
    }

    public static boolean isWin(String[][] board, String player) {

        if (board[0][0].equals(player) && board[0][1].equals(player) && board[0][2].equals(player)) {
            return true;
        } else if (board[1][0].equals(player) && board[1][1].equals(player) && board[1][2].equals(player)) {
            return true;
        } else if (board[2][0].equals(player) && board[2][1].equals(player) && board[2][2].equals(player)) {
            return true;
        } else if (board[0][0].equals(player) && board[1][0].equals(player) && board[2][0].equals(player)) {
            return true;
        } else if (board[0][1].equals(player) && board[1][1].equals(player) && board[2][1].equals(player)) {
            return true;
        } else if (board[0][2].equals(player) && board[1][2].equals(player) && board[2][2].equals(player)) {
            return true;
        } else if (board[0][0].equals(player) && board[1][1].equals(player) && board[2][2].equals(player)) {
            return true;
        } else if (board[0][2].equals(player) && board[1][1].equals(player) && board[2][0].equals(player)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isFreeSpace(String[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].equals("*  ")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void playersMove(String[][] board, String player) {
        Scanner scan = new Scanner(System.in);
        int line;
        int column;
        while (true) {
            System.out.println("Player " + player + " turn");
            System.out.println("Please choose line: 1, 2, 3");
            line = scan.nextInt() - 1;
            System.out.println("Please choose column: 1, 2, 3");
            column = scan.nextInt() - 1;
            if (!board[line][column].equals("*  ")) {
                System.out.println("Not a legal move! Please try again.");
            } else {
                board[line][column] = player;
                break;
            }
        }
    }

}

