package by.teachmeskills.yadevich.lesson12.task2;

import java.util.Scanner;

/** Написать программу, которая будет проверять, что введенная ссылка валидная.
 Например, при анализе вот такой ссылки
 https://teachmeskills.by/kursy/programmirovaniya-online - программа должна вернуть,
 что ссылка валидна.
 а при вводе tcp://teachmeskills.by/kursy/programmirovaniya-online -
 программа должна вернуть, что ссылка не валидна (ссылка начинается ни с http, ни с https)
 */

public class ApplicationRunner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter link: ");
        String str = sc.nextLine();

        CheckLink.isValidLink(str);
    }
}
