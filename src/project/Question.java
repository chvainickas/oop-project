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
    private int number;
    private String text, imgPath, section;
    private Answer[] answers;

    public Question() {
    }

    public Question(int number, String text, String imgPath, String section) {
        this.number = number;
        this.text = text;
        this.imgPath = imgPath;
        this.section = section;
    }

    public boolean checkAnswer(char option){
        for(int i=0; i<this.answers.length; i++)
        {
            if(option == this.answers[i].getOption() && this.answers[i].isCorrect())
            {
                //If option is the same as the correct answer option returns true
                return true;
            }
        }
        return false;
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

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public int getNumber() {
        return number;
    }

    public String getSection() {
        return section;
    }

    public String getText() {
        return text;
    }

    public Answer[] getAnswers() {
        return answers;
    }

    public String getImgPath() {
        return imgPath;
    }
}
