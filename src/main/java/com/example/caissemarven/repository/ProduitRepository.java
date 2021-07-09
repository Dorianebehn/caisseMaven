/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.caissemarven.repository;
import com.example.caissemarven.model.produit;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Dory
 */
public interface ProduitRepository extends JpaRepository <produit ,Integer> {
    
}
