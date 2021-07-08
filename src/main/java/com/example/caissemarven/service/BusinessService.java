/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.caissemarven.service;
import com.example.caissemarven.model.HelloWord;
import org.springframework.stereotype.Component;

/**
 *
 * @author Dory
 */
 @Component
public class BusinessService {
    
    public HelloWord getHelloWorld(){
        HelloWord hey = new HelloWord();
        return hey;
    }
}
