/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author pylyp
 */
public class Review extends Results {
    private int num;
    private String explain;

    public Review() {
    }

    public Review(int num, String explain) {
        this.num = num;
        this.explain = explain;
    }

    public int getNum() {
        return num;
    }

    public String getExplain() {
        return explain;
    }
    

    public void setNum(int num) {
        this.num = num;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }
    
    
}

