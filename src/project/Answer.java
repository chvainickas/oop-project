/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package project;

/**
 *
 * @author Daniel García
 * 24 oct 2023
 */
public class Answer extends Quiz{
    private char option;
    private String text;
    private boolean isCorrect;

    public Answer() {
    }

    public Answer(char option, String text, boolean isCorrect) {
        this.option = option;
        this.text = text;
        this.isCorrect = isCorrect;
    }

    public char getOption() {
        return option;
    }

    public String getText() {
        return text;
    }

    public boolean isIsCorrect() {
        return isCorrect;
    }

    public boolean checkAnswer(char option){
        return false;
    }
}
