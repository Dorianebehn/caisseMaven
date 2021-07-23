package com.example.caissemarven.windows;

import java.awt.BorderLayout; 


import java.awt.EventQueue;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class ScanFrame extends JFrame implements Runnable, ThreadFactory {

	private JPanel contentPane;
	private JTextField textField;
	private WebcamPanel panel=null;
	private Webcam webcam=null;
	
	private static final long serialVersionUID=6441489157408381878L;
	private Executor executor= Executors.newSingleThreadExecutor(this);
	private JPanel panel_1;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public ScanFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 505, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.setMaximumSize(new Dimension(10, 10));
		textField.setMinimumSize(new Dimension(7, 13));
		contentPane.add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
		
		
		//contentPane.add(panel, BorderLayout.WEST);
		initWebcam();
	}
	
	
	private void initWebcam() {
		Dimension size=WebcamResolution.QVGA.getSize();
		webcam=Webcam.getWebcams().get(0);  
		webcam.setViewSize(size);
		
		panel=new WebcamPanel(webcam);
		panel.setPreferredSize(size);
		panel.setFPSDisplayed(true);
		contentPane.add(panel, BorderLayout.WEST);
		
		panel_1 = new JPanel();
		panel_1.setMinimumSize(new Dimension(30, 30));
		contentPane.add(panel_1, BorderLayout.EAST);
		
		executor.execute(this);
		
		
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
				
				String res = result.getText();
				JLabel l= new JLabel();
				l.setBounds(20, 20, 20, 20);
				l.setText(res);
				panel_1.add(l);
				//label.setText(res);
				//System.out.println(res);
				int i=1;
				for(i=1; i<=5;i++) {
				String	res1=result.getText();
					while(res!=res1) {
						JLabel l2 = new JLabel();
						//l2.setBounds(20, 20, 100, 30);
						l2.setText(res1);
						panel_1.add(l2, BorderLayout.EAST);
						
						//String res = result.getText();
						System.out.println("good");	
						i++;
					}
					
				}
				
				
				
				
				
				//Integer idres=Integer.parseInt(id);
				
			
		}
		
		
	}while (true);

	}
}