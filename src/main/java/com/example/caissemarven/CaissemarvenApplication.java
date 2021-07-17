package com.example.caissemarven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import com.example.caissemarven.service.BusinessService;
import com.example.caissemarven.service.ProduitService;
import com.example.caissemarven.model.HelloWord;
import com.example.caissemarven.model.Produit;
import com.example.caissemarven.windows.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import javax.swing.*;

@SpringBootApplication
public class CaissemarvenApplication implements CommandLineRunner {
    
    @Autowired
    private  BusinessService bs;
    
    @Autowired
    private ProduitService proSer;
       
    public static void main(String[] args) {
	SpringApplication.run(CaissemarvenApplication.class, args);
	JFrame frame = new Principal();
        frame.setVisible(true) ;
    }  
    
    @Override
    public void run(String... args) throws Exception {
        HelloWord hey = bs.getHelloWorld();
        System.out.println(hey);
       
        List listProduit = proSer.listAll();
        System.out.println(listProduit);
        
        
     
    }

}

