/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.caissemarven.windows;


import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
 
/**
 *
 * @author user
 */
public class Home extends javax.swing.JFrame {
    
    
    protected JTextField textField ;
    DefaultListModel model = new DefaultListModel();
    /**
     * Creates new form Home
     */
    public Home() {
        super("Autmate d'achat");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {


       // panelContainer = new javax.swing.JPanel();

        jPanel3 = new javax.swing.JPanel();
        separator = new javax.swing.JPanel();
        labelName = new javax.swing.JLabel();
        labelEtoile = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panelResult = new javax.swing.JPanel();
        btnRemove = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
//>>>>>>> ff0e9df reprise des frames de shella
  //      panelWebcam = new javax.swing.JPanel();
    //    btnPayer = new javax.swing.JButton();
      //  btnAnnuler = new javax.swing.JButton();
//<<<<<<< Upstream, based on origin/master
//        panelPanier = new javax.swing.JPanel();
  //      labelPanier = new javax.swing.JLabel();
    //    jLabel2 = new javax.swing.JLabel();
      //  labelTotal = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();


        btnAjouter =  new javax.swing.JButton("submit");
        textField = new JTextField(10);
       

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

//        panelContainer.setBackground(new java.awt.Color(0, 0, 0));

//<<<<<<< Upstream, based on origin/master
 //       panelWebcam.setBackground(new java.awt.Color(255, 255, 255));

        separator.setBackground(new java.awt.Color(0, 0, 0));

        labelName.setBackground(new java.awt.Color(255, 255, 255));
        labelName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelName.setForeground(new java.awt.Color(255, 255, 255));
        labelName.setText("MON PANIER");

        labelEtoile.setBackground(new java.awt.Color(255, 255, 255));
        labelEtoile.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelEtoile.setForeground(new java.awt.Color(255, 255, 255));
        labelEtoile.setText("************");

        panelResult.setBackground(new java.awt.Color(255, 204, 204));

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
       btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });
           
          String[] strings = { "ScanProduit","hello" };
          
         
          
          jList1 = new JList();
          //int n =5;
          //for(int i=0;i<n;i++){
            //String b = "essai"+i;
             //model.addElement(b);
             //jList1.setModel(model);
                     
               //      }
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout panelResultLayout = new javax.swing.GroupLayout(panelResult);
        panelResult.setLayout(panelResultLayout);
        panelResultLayout.setHorizontalGroup(
            panelResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnRemove)
                .addGap(56, 56, 56))
                .addComponent( btnAjouter)
                .addGap(99, 99, 99)
                .addComponent( textField)
                .addGap(55, 55, 55)
        );
        panelResultLayout.setVerticalGroup(
            panelResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultLayout.createSequentialGroup()
                .addGroup(panelResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelResultLayout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(textField))
                    .addGroup(panelResultLayout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(btnAjouter))
                    .addGroup(panelResultLayout.createSequentialGroup()   
                        .addGap(59, 59, 59)
                        .addComponent(btnRemove))
                    .addGroup(panelResultLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout separatorLayout = new javax.swing.GroupLayout(separator);
        separator.setLayout(separatorLayout);
        separatorLayout.setHorizontalGroup(
            separatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(separatorLayout.createSequentialGroup()
                .addGroup(separatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(separatorLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel3))
                    .addGroup(separatorLayout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(labelName))
                    .addGroup(separatorLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(labelEtoile))
                    .addGroup(separatorLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(panelResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        separatorLayout.setVerticalGroup(
            separatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(separatorLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(labelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelEtoile)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(286, Short.MAX_VALUE))
        );

        /*jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("SCANNER PRODUIT");**/
        
        
    }
//>>>>>>> ff0e9df reprise des frames de shella

  /*      javax.swing.GroupLayout panelWebcamLayout = new javax.swing.GroupLayout(panelWebcam);
        panelWebcam.setLayout(panelWebcamLayout);
        panelWebcamLayout.setHorizontalGroup(
            panelWebcamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 262, Short.MAX_VALUE)
        );
        panelWebcamLayout.setVerticalGroup(
            panelWebcamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 231, Short.MAX_VALUE)
        );

        btnPayer.setBackground(new java.awt.Color(0, 102, 0));
        btnPayer.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPayer.setForeground(new java.awt.Color(255, 255, 255));
        btnPayer.setText("Payment");
        btnPayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayerActionPerformed(evt);
            }
        });

        btnAnnuler.setBackground(new java.awt.Color(102, 0, 0));
        btnAnnuler.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAnnuler.setForeground(new java.awt.Color(255, 255, 255));
        btnAnnuler.setText("Annuler");
        btnAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnulerActionPerformed(evt);
            }
        });

        panelPanier.setBackground(new java.awt.Color(255, 255, 255));

        labelPanier.setBackground(new java.awt.Color(255, 255, 255));
        labelPanier.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelPanier.setForeground(new java.awt.Color(0, 0, 0));
        labelPanier.setText("MON PANIER");

        javax.swing.GroupLayout panelPanierLayout = new javax.swing.GroupLayout(panelPanier);
        panelPanier.setLayout(panelPanierLayout);
        panelPanierLayout.setHorizontalGroup(
            panelPanierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPanierLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(labelPanier)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        panelPanierLayout.setVerticalGroup(
            panelPanierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPanierLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelPanier)
                .addContainerGap(279, Short.MAX_VALUE))
        );

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Total: ");

        labelTotal.setBackground(new java.awt.Color(255, 255, 255));
        labelTotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelTotal.setForeground(new java.awt.Color(255, 255, 255));
        labelTotal.setText("Montant a payer");

        btnRemove.setBackground(new java.awt.Color(153, 0, 0));
        btnRemove.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRemove.setForeground(new java.awt.Color(255, 255, 255));
        btnRemove.setText("Supprimer");

        javax.swing.GroupLayout panelContainerLayout = new javax.swing.GroupLayout(panelContainer);
        panelContainer.setLayout(panelContainerLayout);
        panelContainerLayout.setHorizontalGroup(
            panelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContainerLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContainerLayout.createSequentialGroup()
                        .addComponent(btnPayer)
                        .addGap(78, 78, 78)
                        .addComponent(btnAnnuler))
                    .addGroup(panelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(panelWebcam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelContainerLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(32, 32, 32)
                            .addComponent(labelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(panelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContainerLayout.createSequentialGroup()
                        .addComponent(panelPanier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContainerLayout.createSequentialGroup()
                        .addComponent(btnRemove)
                        .addGap(83, 83, 83))))
        );
        panelContainerLayout.setVerticalGroup(
            panelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContainerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContainerLayout.createSequentialGroup()
                        .addComponent(panelWebcam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(labelTotal))
                        .addGap(33, 33, 33)
                        .addGroup(panelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPayer)
                            .addComponent(btnAnnuler))
                        .addGap(22, 22, 22))
                    .addGroup(panelContainerLayout.createSequentialGroup()
                        .addComponent(panelPanier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemove)
                        .addContainerGap(28, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< Upstream, based on origin/master
=======
        
>>>>>>> ff0e9df reprise des frames de shella
    private void btnPayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayerActionPerformed
        // TODO add your handling code here:
        Payment pay = new Payment();
        pay.setVisible(true);
    }//GEN-LAST:event_btnPayerActionPerformed**/
    
    
    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayerActionPerformed
        // TODO add your handling code here:
        String evenement = evt.getActionCommand();
        if(evenement.equals("submit")){
            String note = textField.getText();
            String evaluation = "" ;
            if(model.contains(note)){
                System.out.println("Changer de produit");
            }
            else {
                
             model.addElement(note);
             jList1.setModel(model);
          
            }
            
        }
    }//GEN-LAST:event_btnPayerActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        int index = jList1.getSelectedIndex();
            if(index >= 0){ //Remove only if a particular item is selected
            model.removeElementAt(index);
    }
        
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnulerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnnulerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
           
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnuler;
    private javax.swing.JButton btnPayer;
    private javax.swing.JButton btnRemove;

    private javax.swing.JButton btnAjouter;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelEtoile;
    private javax.swing.JLabel labelName;
    private javax.swing.JPanel panelResult;

    private javax.swing.JPanel separator;
   // private   DefaultListModel model;

    // End of variables declaration//GEN-END:variables
}
