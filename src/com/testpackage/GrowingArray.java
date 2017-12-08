package com.testpackage;

public class GrowingArray {
    private String[] array;
    private int sizeArray;

    public GrowingArray( int sizeArray) {
        this.array = array;
        this.sizeArray=sizeArray;
    }


    public void setSizeArray(int sizeArray,int indexArray) {
        if(sizeArray<indexArray) {
            array=arrayGrow(array,sizeArray);
        }
        else {
            this.sizeArray = sizeArray;
        }

    }

    public String[] getArray() {
        return array;
    }

    public int getSizeArray() {
        return sizeArray;
    }
    
    private String [] arrayGrow(String[] array, int number) {
        String[] bigArray=new String[number+10];
        bigArray = array;
        return bigArray;
    }
    public static void divideIntoLexemes(String string, String[]array,int sizeArray) {
        int indexArray = 0;
        String symbol = " ,.;:";
        String word = "";
        for (int i = 0; i <= string.length() - 1; i++) {
            boolean isContainsSymbol = symbol.contains(String.valueOf(string.charAt(i)));
            if (!isContainsSymbol) {
                word += string.charAt(i);
                if (i == string.length() - 1) {
                    array[indexArray] = word;
                }
            } else {
                array[indexArray] = word;
                word = "";
                indexArray++;
                if(indexArray>sizeArray){

                }
            }
        }
    }
}
