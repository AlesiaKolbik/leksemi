package com.testpackage;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.print("Введите первую строку:");
        String string1 = sca.nextLine();
        Scanner sca2 = new Scanner(System.in);
        System.out.print("Введите вторую строку:");
        String string2 = sca2.nextLine();

        ArrayList<String> lexeme1 = new ArrayList<>(1000);
        ArrayList<String> lexeme2 = new ArrayList<>(1000);
        divideIntoLexemes(lexeme1, string1);
        divideIntoLexemes(lexeme2,string2);
        String resultString=formNewString(lexeme1, lexeme2);
        System.out.print(resultString);
    }


    public static void divideIntoLexemes(ArrayList<String> lexeme,String string) {
        int indexArray = 0;
        String symbol = " ,.;:?!";
        String word = "";
        for (int i = 0; i <= string.length() - 1; i++) {
            boolean isContainsSymbol = symbol.contains(String.valueOf(string.charAt(i)));
            if (!isContainsSymbol) {
                word += string.charAt(i);
                if (i == string.length() - 1) {
                    lexeme.add(indexArray,word);
                }
            }
            else {
                boolean earlySymbolContain=symbol.contains(String.valueOf(string.charAt(i-1)));
                if(earlySymbolContain) {
                }
                else {
                lexeme.add(indexArray,word);
                word = "";
                indexArray++;
                }
            }
        }
    }


    public static String formNewString(ArrayList<String>array, ArrayList<String>array2) {
        ArrayList<String> result = new ArrayList<>();
        int min=Math.min(array.size(),array2.size());
        for (int i = 0; i < min; i++) {
            result.add(array.get(i) + ' ' + array2.get(i) + ' ');
        }
        return String.valueOf(result);
    }
}
