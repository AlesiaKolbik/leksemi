package com.testpackage;

public class LexemeArray {
    private String[] array;
    private int size;
    private int index = 0;

    public LexemeArray() {
        this.size = 5;
        this.array = new String[this.size];
    }

    public int length() {
        return this.index;
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

    public String get(int index){
        return this.array[index];
    }

    public void print(){
        for(int i=0;i<index;i++){
            System.out.print(this.get(i)+" ");
        }
    }

    public LexemeArray concat(LexemeArray array) {
        LexemeArray result = new LexemeArray();
        int min = Math.min(this.length(), array.length());
        for (int i = 0; i < min; i++) {
            result.split(this.get(i) + " " + array.get(i));
        }
        return result;
    }

    private int findNextIndexWord(String string, int index, String separators) {
        while (separators.contains(String.valueOf(string.charAt(index)))) {
            index++;
        }
        return index;
    }

    private int findLastIndexWord(String string, int index, String separators) {
        while (!separators.contains(String.valueOf(string.charAt(index)))) {
            index++;
            if (index == string.length())
                break;
        }
        return index;
    }

    private void add(String string) {
         if(index <= array.length-1) {
             array[index] = string;
             index++;
         }
        else {
            this.copy();
            array[index]=string;
            index++;
        }
    }
    private void copy(){
        String newArray[]=new String[array.length+1];
        for(int i=0;i<array.length;i++){
            newArray[i]=array[i];
        }
        this.array=newArray;
    }
}