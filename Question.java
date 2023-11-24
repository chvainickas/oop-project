/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package assignment1;

/**
 *
 * @author Daniel García
 * 24 oct 2023
 */
public class Question extends Quiz{
    private int number;
    private String text;
    private String topic;

    public Question() {
    }

    public Question(int number, String text, String topic) {
        this.number = number;
        this.text = text;
        this.topic = topic;
    }

    public void load(){
        //load questions into array
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
    
    
}
