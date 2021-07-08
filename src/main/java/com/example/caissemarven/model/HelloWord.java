/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.caissemarven.model;

/**
 *
 * @author Dory
 */
public class HelloWord {
    private String value = "Hello Dory";
    
    public void setValue(){
        this.value = value;
    }
    public String getValue(String value){
        return value;
    }
    
    public String toString(){
        return value;
    }
}
