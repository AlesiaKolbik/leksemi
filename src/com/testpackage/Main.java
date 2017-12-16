package com.testpackage;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.print("Введите первую строку:");
        String string1 = sca.nextLine();
        Scanner sca2 = new Scanner(System.in);
        System.out.print("Введите вторую строку:");
        String string2 = sca2.nextLine();
        LexemeArray lexeme1 = new LexemeArray();
        lexeme1.split(string1);
        LexemeArray lexeme2 = new LexemeArray();
        lexeme2.split(string2);
        LexemeArray result = lexeme1.concat(lexeme2);
        result.print();
    }
}
