/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.caissemarven.repository;
import com.example.caissemarven.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Dory
 */
@Repository
public interface ProduitRepository extends JpaRepository <Produit ,Long> {
    
}
