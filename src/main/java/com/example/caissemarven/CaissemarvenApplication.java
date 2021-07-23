package com.example.caissemarven;

import org.springframework.boot.SpringApplication;



import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.boot.CommandLineRunner;
import com.example.caissemarven.service.BusinessService;
import com.example.caissemarven.service.Scan;
import com.example.caissemarven.service.ScanService;

import com.example.caissemarven.windows.ScanFrame;
import com.example.caissemarven.model.HelloWord;

import javax.swing.JFrame;

import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication

public class CaissemarvenApplication extends JFrame implements CommandLineRunner  {
    
	
    @Autowired
    private  BusinessService bs;
    public static  ScanService service;
    
       
    public static void main(String[] args) {
	SpringApplication.run(CaissemarvenApplication.class, args);
		
	try {
		ScanFrame frame = new ScanFrame();
		frame.setVisible(true);
	} catch (Exception e) {
		e.printStackTrace();
	}
		//scan=service.initWebcam();
		
	}  
    
    @Override
    public void run(String... args) throws Exception {
        HelloWord hey = bs.getHelloWorld();
        //ScanFrame scan = new ScanFrame();
        //scan.setVisible(true);
        
        		
        
    
           
    
    }
    
    
    
}
         
        
    



