package com.company.Grids;

import java.util.List;

public class LetterGrid extends Grid{
    public LetterGrid(){
        super();
    }
    public LetterGrid(int i){
       super(i);
    }
    public LetterGrid(String a){
        super(a);
    }

    public void setXY(char x,char y,int num){
        int i=0;
        int j=0;
        char[] alphabet = "abcdefghij".toCharArray();

        for (int f = 0;f<alphabet.length;f++){
            if (x == alphabet[f]){
                i = f;
            }
        }
        for (int f = 0;f<alphabet.length;f++){
            if (y == alphabet[f]){
                j = f;
            }
        }


        Array[i][j] = num;
    }

    public int getNum(char x,char y) {
        int i=0;
        int j=0;
        char[] alphabet = "abcdefghij".toCharArray();

        for (int f = 0;f<alphabet.length;f++){
            if (x == alphabet[f]){
                i = f;
            }
        }
        for (int f = 0;f<alphabet.length;f++){
            if (y == alphabet[f]){
                j = f;
            }
        }

        return Array[i][j];
    }

    public int getLetter(char x,char y) {
        int i=0;
        int j=0;
        char[] alphabet = "abcdefghij".toCharArray();

        for (int f = 0;f<alphabet.length;f++){
            if (x == alphabet[f]){
                i = f;
            }
        }
        for (int f = 0;f<alphabet.length;f++){
            if (y == alphabet[f]){
                j = f;
            }
        }

        char returner;
        if (Array[i][j]>26){
            returner = (char)Array[i][j];
        }else {returner = '!';}

        return returner;
    }
}
