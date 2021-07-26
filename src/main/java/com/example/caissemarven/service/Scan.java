package com.example.caissemarven.service;

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

public class Scan extends JFrame implements Runnable, ThreadFactory {

	private JPanel contentPane;
	private JTextField textField;
	private WebcamPanel panel=null;
	private Webcam webcam=null;
	
	private static final long serialVersionUID=6441489157408381878L;
	private Executor executor= Executors.newSingleThreadExecutor(this);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scan frame = new Scan();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Scan() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.setMaximumSize(new Dimension(10, 10));
		textField.setMinimumSize(new Dimension(7, 13));
		contentPane.add(textField, BorderLayout.EAST);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
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
		contentPane.add(panel); 
		
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
				textField.setText(result.getText());
				String id=result.getText();
				Integer idres=Integer.parseInt(id);
				
			
		}
		
		
	}while (true);

	}
	}
