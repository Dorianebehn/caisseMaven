package com.example.caissemarven;


import org.hibernate.*;
import org.hibernate.cfg.Configuration; 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import com.example.caissemarven.service.BusinessService;
import com.example.caissemarven.service.ProduitService;
import com.example.caissemarven.repository.ProduitRepository;
import com.example.caissemarven.model.HelloWord;
import com.example.caissemarven.model.Produit;
import com.example.caissemarven.windows.Panier;
import javax.swing.JFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.*;
import javax.swing.*;

@SpringBootApplication
public class CaissemarvenApplication extends JFrame implements CommandLineRunner  {
    
	
    @Autowired
    private  ProduitRepository produitRepository;
    
    //@Autowired
   // private ProduitService proSer;
    private Logger logger = LoggerFactory.getLogger(this.getClass());
 
    private static final Logger log = LoggerFactory.getLogger(CaissemarvenApplication.class);
    
    
 
    public static void main(String[] args) {
	SpringApplication.run(CaissemarvenApplication.class, args);
         
        System.setProperty("java.awt.headless", "false");
        SwingUtilities.invokeLater(() -> {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panier().setVisible(true);
            }
        });
        
                });
        
  
    }  

    
    @Override
    public void run(String... args) throws Exception {
        
        //HelloWord hey = bs.getHelloWorld();
        //System.out.println(hey);
        
       // List listProduit = proSer.listAll();
        //System.out.println(listProduit);
        
        List listProduit = produitRepository.findAll();
        System.out.println(listProduit);
        
       logger.info("Modification-> {}", produitRepository.update(new Produit(2,"barbouche-BR",900,"payed")));
   
       
       //logger.info("Inserting -> {}", produitRepository.insert(new Produit (3, "Hp-Laptop", 700)));
       
    }
    
    
    }

         
        
    



