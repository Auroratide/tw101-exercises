package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static final String NAME = "Timothy";

    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        for(int i = 0; i < n; ++i)
            printRow(i, n);
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        drawAnIsoscelesTriangle(n);
        for(int i = 1; i < n; ++i)
            printRow(n - i - 1, n);
    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
    //  starPadding is needed due to the potential for the name to be really long
        int starPadding = NAME.length() / 2 - n + 1;
        for(int i = 0; i < n - 1; ++i) {
            pad(starPadding, " ");
            printRow(i, n);
        }
        pad((2 * n + 1 - NAME.length()) / 2 - 1, " ");
        System.out.print(NAME + "\n");
        for(int i = 1; i < n; ++i) {
            pad(starPadding, " ");
            printRow(n - i - 1, n);
        }
    }

//  Rows are 0-indexed
    private static void printRow(int row, int total) {
        pad(total - 1 - row, " ");
        pad(2 * row + 1, "*");
        System.out.print("\n");
    }

    private static void pad(int count, String character) {
        for(int i = 0; i < count; ++i)
            System.out.print(character);
    }
}
