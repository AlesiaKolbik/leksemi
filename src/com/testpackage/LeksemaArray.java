package com.testpackage;

public class LeksemaArray {
    private String[] array;
    private int size;

    public LeksemaArray() {
        this.size = 5;
        this.array = new String[this.size];
    }

    public int length() {
        return this.array.length;
    }

    public void split(String string) {
        String separators = " ,.;:";
        for (int i = 0; i <= string.length() - 1; i++) {
            int startWord = findNextIndexWord(string, i, separators);
            int endWord = findLastIndexWord(string, startWord, separators);
            String word = string.substring(startWord, endWord);
            this.add(word);
            i = endWord;
        }
    }

    private int findNextIndexWord(String string, int index, String separators) {
        while (!separators.contains(String.valueOf(string.charAt(index)))) {
            index++;
        }
        return index;
    }

    private int findLastIndexWord(String string, int index, String separators) {
        while (separators.contains(String.valueOf(string.charAt(index)))) {
            index++;
            if (index == string.length() - 1)
                break;
        }
        return index;
    }

    private void add(String string) {
        int index=array.length;
         if(array.length==0) {
             array[0] = string;
         }
        else if(index<array.length){
            array[index]=string;
            }
        else if(index>array.length) {
            String array2[] = new String[array.length+1];
            array2

        }
    }
}