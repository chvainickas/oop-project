/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.Connection;

/**
 *
 * @author pylyp
 */
public class Leader extends Results{
    private String name;
    private int score, topNum;


    public Leader(String name, int score, int topNum) {
        this.name = name;
        this.score = score;
        this.topNum = topNum;
    }
        
    public Leader() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setTopNum(int topNum) {
        this.topNum = topNum;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int getTopNum() {
        return topNum;
    }
    
    
}
