
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.caissemarven.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



/**
 *
 * @author Dory
 */

@Entity

public class Produit {
    @Id
    private Integer id;
    private String name;
    private Integer price;
    private String status;
    
    
    public Produit(){
    
    }
    
    public Produit(Integer id,String name,Integer price,String status){
    this.id = id;
    this.name = name;
    this.price = price;
    this.status = status;
    
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    public String toString(){
        return name+"   -------   "+ price+" FCFA";
    }
}