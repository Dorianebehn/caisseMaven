/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.caissemarven.windows;
import com.example.caissemarven.CaissemarvenApplication;
import com.example.caissemarven.model.Produit;
import com.example.caissemarven.repository.ProduitRepository;
import java.awt.event.*;
import javax.swing.*;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author Dory
 */

@Component
public class Principal  {
     @Autowired
    private  ProduitRepository produitRepository;
    
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private static final Logger log = LoggerFactory.getLogger(Principal.class);
    
    public void esai(){
     produitRepository.insert(new Produit (3, "Hp-Laptop", 700,""));
    }
}
