/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.caissemarven.service;

import java.awt.BorderLayout; 

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import javax.swing.JPanel;
import javax.swing.JTextField;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.caissemarven.windows.ScanFrame;
/**
 *
 * @author Dory
 * 
 */
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

@Service
@Component
public class ScanService   {
	/*	private JPanel contentPane;
	private JTextField textField;
	private WebcamPanel panel=null;
	private Webcam webcam=null;
	
	
	private static final long serialVersionUID=6441489157408381878L;
	private Executor executor= Executors.newSingleThreadExecutor(this);

	@Autowired
	@Qualifier
	public ScanFrame initWebcam() {
		ScanFrame sc= new ScanFrame();
		Dimension size=WebcamResolution.QVGA.getSize();
		webcam=Webcam.getWebcams().get(0);  
		webcam.setViewSize(size);
		
		panel=new WebcamPanel(webcam);
		panel.setPreferredSize(size);
		panel.setFPSDisplayed(true);
		contentPane.add(panel); 
		executor.execute(this);
		return sc;
	}

		@Override
		public Thread newThread(Runnable r) {
			// TODO Auto-generated method stub
			Thread t = new Thread(r, "My thread");
			t.setDaemon(true);
			
			
			return t;
		}


		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			
			do {
				try {
					Thread.sleep(100);
					
				}catch(InterruptedException e) {
					
					e.printStackTrace();
				}
				Result result=null;
				BufferedImage image=null;
				
				if (webcam.isOpen()) {
					if ((image=webcam.getImage()) == null) {
						continue;
					}
				}
				
				LuminanceSource source = new BufferedImageLuminanceSource(image);
				BinaryBitmap bitmap=new BinaryBitmap(new HybridBinarizer(source));
				
				try	{
					 result= new MultiFormatReader().decode(bitmap);
					 System.out.println(result);
					
				} catch (NotFoundException e) {
					// No result...
					
				}
				
				if (result != null) {
					textField.setText(result.getText());
					String id=result.getText();
					Integer idres=Integer.parseInt(id);
					
				
			}
			
			
		}while (true);
			
			

		}*/
		}
	
    

