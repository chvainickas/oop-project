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
public class Question extends Quiz{
    private int number, section;
    private String text;
    private Answer[] answers;

    public Question() {
    }

    public Question(int number, String text, int section) {
        this.number = number;
        this.text = text;
        this.section = section;
    }

    public void setAnswers(Answer[] answers) {
        this.answers = answers;
    }

    
    public void setNumber(int number) {
        this.number = number;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumber() {
        return number;
    }

    public String getText() {
        return text;
    }

    public Answer[] getAnswers() {
        return answers;
    }
}
