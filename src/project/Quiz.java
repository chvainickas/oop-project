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
public abstract class Quiz {
    protected Question[] questionList;
    protected Answer[] correctAnswers;
    protected Answer[] userAnswers;
    protected int finalTime;

    public Quiz() {
    }

    public int getFinalTime() {
        return finalTime;
    }
    
    public void startTimer(){
    }
    
    public void stopTimer(){
    }
    
    public abstract void load();
    
}
