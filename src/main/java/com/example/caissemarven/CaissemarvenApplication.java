package com.example.caissemarven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import com.example.caissemarven.service.BusinessService;
import com.example.caissemarven.model.HelloWord;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class CaissemarvenApplication implements CommandLineRunner {
    
    @Autowired
    private  BusinessService bs;
       
    public static void main(String[] args) {
	SpringApplication.run(CaissemarvenApplication.class, args);
	}  
    
    @Override
    public void run(String... args) throws Exception {
        HelloWord hey = bs.getHelloWorld();
        System.out.println(hey);
    }

}

