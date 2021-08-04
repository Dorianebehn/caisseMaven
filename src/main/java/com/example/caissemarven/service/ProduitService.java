/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.caissemarven.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.caissemarven.repository.ProduitRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import com.example.caissemarven.model.Produit;
import org.springframework.stereotype.Component;


/**
 *
 * @author Dory
 */
@Service("productService")
@Transactional
@Component
public class ProduitService implements ProduitServiceInterface {  
        @Autowired
        private ProduitRepository proRe;
            
        
        @Override
        public Iterable<Produit> findAll(){
            return proRe.findAll();
        }
        
        public List<Produit> listAll(){
           return proRe.findAll();
        }
        
        //public void save (Produit produit){
          //  proRe.save(produit);
        //}
        
        
        //public Produit get(Integer id){
         //return proRe.findById(id).get();
        //}
        
     //  public void delete(Long id){
       //    proRe.deleteById(id);
       //}
}
