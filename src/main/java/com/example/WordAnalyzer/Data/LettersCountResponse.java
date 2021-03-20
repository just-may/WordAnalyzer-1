package com.example.WordAnalyzer.Data;

public class LettersCountResponse {
    public char letter;
    public int count;

    public LettersCountResponse(char letter, int count){
        this.letter = letter;
        this.count = count;
    }
}
