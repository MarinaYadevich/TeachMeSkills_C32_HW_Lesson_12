package by.teachmeskills.yadevich.lesson12.task1;

import java.util.Scanner;

/** Написать программу, что переданная строка это hex code для описания цвета.
 Например, при вводе в программу значения #8b2323, программа должна вернуть - Yes.*/

public class ApplicationRunner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hex code: ");
        String st = sc.nextLine();

        HexValidatorColor.hexValidatorColor(st);
    }
}
