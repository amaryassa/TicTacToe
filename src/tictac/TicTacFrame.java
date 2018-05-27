/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictac;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AMAR
 */
public class TicTacFrame extends javax.swing.JFrame {
    
String nom="yassa";
String Signe= "";
String joueur="";
String JoueurActuel="";
int NombreCoups=1;
String SigneX="X";
String SigneO="O";

    /**
     * Creates new form TicTacFrame
     */
    public TicTacFrame() {
        initComponents();
        setSize(600, 600);
        setLocationRelativeTo(null);
    }
    
    //Connexion et reception non stop
   

           
    public void DesactiverBoutons(){
                                 case1.setEnabled(false);
                                 case2.setEnabled(false);
                                 case3.setEnabled(false);
                                 case4.setEnabled(false);
                                 case5.setEnabled(false);
                                 case6.setEnabled(false);
                                 case7.setEnabled(false);
                                 case8.setEnabled(false);
                                 case9.setEnabled(false);
  
    }
    public void Gagnant(String winner, String joueur){
     String un=case1.getText();
    String deux=case2.getText();
    String trois=case3.getText();
    String quatre=case4.getText();
    String cinq=case5.getText();
    String six=case6.getText();
    String sept=case7.getText();
    String huit=case8.getText();
    String neuf=case9.getText();
   
if   (   (un.equalsIgnoreCase(SigneX) && deux.equalsIgnoreCase(SigneX) && trois.equalsIgnoreCase(SigneX)) ||
        (quatre.equalsIgnoreCase(SigneX) && cinq.equalsIgnoreCase(SigneX) && six.equalsIgnoreCase(SigneX)) ||
        (sept.equalsIgnoreCase(SigneX) && huit.equalsIgnoreCase(SigneX) && neuf.equalsIgnoreCase(SigneX)) ||
        
        (un.equalsIgnoreCase(SigneX) && quatre.equalsIgnoreCase(SigneX) && sept.equalsIgnoreCase(SigneX))||
        (deux.equalsIgnoreCase(SigneX) && cinq.equalsIgnoreCase(SigneX) && huit.equalsIgnoreCase(SigneX)) ||
        (trois.equalsIgnoreCase(SigneX) && six.equalsIgnoreCase(SigneX) && neuf.equalsIgnoreCase(SigneX)) ||
        
        (un.equalsIgnoreCase(SigneX) && cinq.equalsIgnoreCase(SigneX) && neuf.equalsIgnoreCase(SigneX)) ||
        (trois.equalsIgnoreCase(SigneX) && cinq.equalsIgnoreCase(SigneX) && sept.equalsIgnoreCase(SigneX)))
   
    {
        if (winner.equalsIgnoreCase(joueur)){
         JOptionPane.showMessageDialog(this, " vous avez gagné", "gagnant 'X' "+winner, JOptionPane.INFORMATION_MESSAGE);
        }
        else{
        JOptionPane.showMessageDialog(this, " vous avez Perdu", "gagnant 'X' "+winner, JOptionPane.WARNING_MESSAGE);}
        
        System.out.println(winner+" 'X' a gagner");
        DesactiverBoutons();
    }

else if (   (un.equalsIgnoreCase(SigneO) && deux.equalsIgnoreCase(SigneO) && trois.equalsIgnoreCase(SigneO)) ||
        (quatre.equalsIgnoreCase(SigneO) && cinq.equalsIgnoreCase(SigneO) && six.equalsIgnoreCase(SigneO)) ||
        (sept.equalsIgnoreCase(SigneO) && huit.equalsIgnoreCase(SigneO) && neuf.equalsIgnoreCase(SigneO)) ||
        
        (un.equalsIgnoreCase(SigneO) && quatre.equalsIgnoreCase(SigneO) && sept.equalsIgnoreCase(SigneO))||
        (deux.equalsIgnoreCase(SigneO) && cinq.equalsIgnoreCase(SigneO) && huit.equalsIgnoreCase(SigneO)) ||
        (trois.equalsIgnoreCase(SigneO) && six.equalsIgnoreCase(SigneO) && neuf.equalsIgnoreCase(SigneO)) ||
        
        (un.equalsIgnoreCase(SigneO) && cinq.equalsIgnoreCase(SigneO) && neuf.equalsIgnoreCase(SigneO)) ||
        (trois.equalsIgnoreCase(SigneO) && cinq.equalsIgnoreCase(SigneO) && sept.equalsIgnoreCase(SigneO)))
   
    {
          if (winner.equalsIgnoreCase(joueur)){
         JOptionPane.showMessageDialog(this, " vous avez gagné", "gagnant 'O' "+winner, JOptionPane.INFORMATION_MESSAGE);
        }
        else{
        JOptionPane.showMessageDialog(this, " vous avez Perdu", "gagnant 'O' "+winner, JOptionPane.WARNING_MESSAGE);}
        
        System.out.println(winner+" 'O' a gagner");
        DesactiverBoutons();
    }

    
 
    
    }
   
    

     public void ReceptionNom(String nom){
    LabelNom.setText(nom);
    }
    public void Envoyer(String CaseSelectionnee  ){

 final Socket clientSocket;
      final BufferedReader in;
      final PrintWriter out;
      final Scanner sc = new Scanner(System.in);
      
       
    try {
       
        clientSocket = new Socket("localhost",234);
          out = new PrintWriter(clientSocket.getOutputStream());
      
        
   
         Thread envoyer = new Thread(new Runnable() {
     
             String tour=LabelNom.getText();
              @Override
              public void run() {
               if (Signe.equalsIgnoreCase(""))
               {
                   Signe="X";
                
               }
                
                             
               else if (Signe.equalsIgnoreCase("X"))
               {Signe="O";}
               else{Signe="X";}
                
             out.println(Signe+","+CaseSelectionnee+","+tour);
                  //out.println(msg);
                  out.flush();
                
             }
         });
         envoyer.start();
        
        
    } catch (IOException ex) {
        Logger.getLogger(TicTacFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
   
         //flux pour envoyer
       
   




}
    
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LabelNom = new javax.swing.JLabel();
        jPanel_GridHolder = new javax.swing.JPanel();
        jPanel_1 = new javax.swing.JPanel();
        case1 = new javax.swing.JButton();
        jPanel_2 = new javax.swing.JPanel();
        case2 = new javax.swing.JButton();
        jPanel_3 = new javax.swing.JPanel();
        case3 = new javax.swing.JButton();
        jPanel_4 = new javax.swing.JPanel();
        case4 = new javax.swing.JButton();
        jPanel_5 = new javax.swing.JPanel();
        case5 = new javax.swing.JButton();
        jPanel_6 = new javax.swing.JPanel();
        case6 = new javax.swing.JButton();
        jPanel_7 = new javax.swing.JPanel();
        case7 = new javax.swing.JButton();
        jPanel_8 = new javax.swing.JPanel();
        case8 = new javax.swing.JButton();
        jPanel_9 = new javax.swing.JPanel();
        case9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Amar");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(600, 600));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setLayout(new java.awt.BorderLayout());
        jPanel1.add(LabelNom, java.awt.BorderLayout.PAGE_END);

        jPanel_GridHolder.setBackground(new java.awt.Color(204, 204, 204));
        jPanel_GridHolder.setLayout(new java.awt.GridLayout(4, 3, 1, 1));

        jPanel_1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel_1.setLayout(new java.awt.BorderLayout());

        case1.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        case1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                case1ActionPerformed(evt);
            }
        });
        jPanel_1.add(case1, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel_1);

        jPanel_2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_2.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel_2.setLayout(new java.awt.BorderLayout());

        case2.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        case2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                case2ActionPerformed(evt);
            }
        });
        jPanel_2.add(case2, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel_2);

        jPanel_3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_3.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel_3.setLayout(new java.awt.BorderLayout());

        case3.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        case3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                case3ActionPerformed(evt);
            }
        });
        jPanel_3.add(case3, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel_3);

        jPanel_4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_4.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel_4.setLayout(new java.awt.BorderLayout());

        case4.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        case4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                case4ActionPerformed(evt);
            }
        });
        jPanel_4.add(case4, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel_4);

        jPanel_5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_5.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel_5.setLayout(new java.awt.BorderLayout());

        case5.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        case5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                case5ActionPerformed(evt);
            }
        });
        jPanel_5.add(case5, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel_5);

        jPanel_6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_6.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel_6.setLayout(new java.awt.BorderLayout());

        case6.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        case6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                case6ActionPerformed(evt);
            }
        });
        jPanel_6.add(case6, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel_6);

        jPanel_7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_7.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel_7.setLayout(new java.awt.BorderLayout());

        case7.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        case7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                case7ActionPerformed(evt);
            }
        });
        jPanel_7.add(case7, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel_7);

        jPanel_8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_8.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel_8.setLayout(new java.awt.BorderLayout());

        case8.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        case8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                case8ActionPerformed(evt);
            }
        });
        jPanel_8.add(case8, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel_8);

        jPanel_9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_9.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel_9.setLayout(new java.awt.BorderLayout());

        case9.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        case9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                case9ActionPerformed(evt);
            }
        });
        jPanel_9.add(case9, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel_9);
        jPanel_GridHolder.add(jPanel2);
        jPanel_GridHolder.add(jPanel3);

        jButton1.setText("connexion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jButton1)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jButton1)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jPanel_GridHolder.add(jPanel4);

        jPanel1.add(jPanel_GridHolder, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void case1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_case1ActionPerformed
     
              String CaseSelectionnee="case1";
  String nom=LabelNom.getText();

if (joueur.equalsIgnoreCase(nom))
{}
   else   {
            Envoyer(CaseSelectionnee);
          
            }
   
    
    }//GEN-LAST:event_case1ActionPerformed

    private void case5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_case5ActionPerformed
    
       String CaseSelectionnee="case5";
  String nom=LabelNom.getText();

if (joueur.equalsIgnoreCase(nom))
{}
    else   {
            Envoyer(CaseSelectionnee);
      
            }
    
    }//GEN-LAST:event_case5ActionPerformed

    private void case2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_case2ActionPerformed
String CaseSelectionnee="case2";
  String nom=LabelNom.getText();

if (joueur.equalsIgnoreCase(nom))
{}
   else   {
            Envoyer(CaseSelectionnee);
          
            }

      
    }//GEN-LAST:event_case2ActionPerformed

    private void case3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_case3ActionPerformed
            String CaseSelectionnee="case3";
  String nom=LabelNom.getText();

if (joueur.equalsIgnoreCase(nom))
{}
   else   {
            Envoyer(CaseSelectionnee);
         
            }


    }//GEN-LAST:event_case3ActionPerformed

    private void case4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_case4ActionPerformed
            String CaseSelectionnee="case4";
  String nom=LabelNom.getText();

if (joueur.equalsIgnoreCase(nom))
{}
    else   {
            Envoyer(CaseSelectionnee);
            
            }

    }//GEN-LAST:event_case4ActionPerformed

    private void case6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_case6ActionPerformed
           String CaseSelectionnee="case6";
  String nom=LabelNom.getText();

if (joueur.equalsIgnoreCase(nom))
{}
    else   Envoyer(CaseSelectionnee); 
    
    }//GEN-LAST:event_case6ActionPerformed

    private void case7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_case7ActionPerformed
          String CaseSelectionnee="case7";
  String nom=LabelNom.getText();

if (joueur.equalsIgnoreCase(nom))
{}
  else   {
            Envoyer(CaseSelectionnee);
            
            }


    }//GEN-LAST:event_case7ActionPerformed

    private void case8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_case8ActionPerformed
           String CaseSelectionnee="case8";
  String nom=LabelNom.getText();

if (joueur.equalsIgnoreCase(nom))
{}
    else   {
            Envoyer(CaseSelectionnee);
         
            } 

     
    }//GEN-LAST:event_case8ActionPerformed

    private void case9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_case9ActionPerformed
       String CaseSelectionnee="case9";
  String nom=LabelNom.getText();

if (joueur.equalsIgnoreCase(nom))
{}
    else   {
            Envoyer(CaseSelectionnee);
        
            }
   
    }//GEN-LAST:event_case9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 final Socket clientSocket;
      final BufferedReader in;
      final PrintWriter out;
      final Scanner sc = new Scanner(System.in);
      
        try {
         /*
         * les informations du serveur ( port et adresse IP ou nom d'hote
         * 127.0.0.1 est l'adresse local de la machine
         */
         clientSocket = new Socket("localhost",234);
         out = new PrintWriter(clientSocket.getOutputStream());
         in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
   
   
        Thread recevoir;
                 recevoir = new Thread(new Runnable() {
                     String tour=LabelNom.getText();
                     String msg;
                     @Override
                     public void run() {
                         try {
                             msg = in.readLine();
                             while(msg!=null){
                                 
                      
                                 
                                 
                                 System.out.println("Serveur : "+msg);
                                 msg = in.readLine();
                               
                                 String tab[]=msg.split(",");
                                 Signe= tab[0];
                                 joueur=tab[2];
 if (tab[1].equalsIgnoreCase("case1")){case1.setText(tab[0]);case1.setEnabled(false);
 if(Signe.equalsIgnoreCase(SigneX)){ case1.setForeground(new java.awt.Color(0, 0, 255));}
 else{   case1.setForeground(new java.awt.Color(255, 0, 0));}
 }
 
 else if (tab[1].equalsIgnoreCase("case2")){case2.setText(tab[0]);case2.setEnabled(false);
 if(Signe.equalsIgnoreCase(SigneX)){ case2.setForeground(new java.awt.Color(0, 0, 255));}
 else{   case2.setForeground(new java.awt.Color(255, 0, 0));}
 }
 
 else if (tab[1].equalsIgnoreCase("case3")){case3.setText(tab[0]);case3.setEnabled(false);
 if(Signe.equalsIgnoreCase(SigneX)){ case3.setForeground(new java.awt.Color(0, 0, 255));}
 else{   case3.setForeground(new java.awt.Color(255, 0, 0));}
 }
 
 else if (tab[1].equalsIgnoreCase("case4")){case4.setText(tab[0]);case4.setEnabled(false);
 if(Signe.equalsIgnoreCase(SigneX)){ case4.setForeground(new java.awt.Color(0, 0, 255));}
 else{   case4.setForeground(new java.awt.Color(255, 0, 0));}
 }
 
 else if (tab[1].equalsIgnoreCase("case5")){case5.setText(tab[0]);case5.setEnabled(false);
 if(Signe.equalsIgnoreCase(SigneX)){ case5.setForeground(new java.awt.Color(0, 0, 255));}
 else{   case5.setForeground(new java.awt.Color(255, 0, 0));}
 }
 
 else if (tab[1].equalsIgnoreCase("case6")){case6.setText(tab[0]);case6.setEnabled(false);
 if(Signe.equalsIgnoreCase(SigneX)){ case6.setForeground(new java.awt.Color(0, 0, 255));}
 else{   case6.setForeground(new java.awt.Color(255, 0, 0));}
 }
 
 else if (tab[1].equalsIgnoreCase("case7")){case7.setText(tab[0]);case7.setEnabled(false);
 if(Signe.equalsIgnoreCase(SigneX)){ case7.setForeground(new java.awt.Color(0, 0, 255));}
 else{   case7.setForeground(new java.awt.Color(255, 0, 0));}
 }
 
 else if (tab[1].equalsIgnoreCase("case8")){case8.setText(tab[0]);case8.setEnabled(false);
 if(Signe.equalsIgnoreCase(SigneX)){ case8.setForeground(new java.awt.Color(0, 0, 255));}
 else{   case8.setForeground(new java.awt.Color(255, 0, 0));}
 }
 
 else if (tab[1].equalsIgnoreCase("case9")){case9.setText(tab[0]);case9.setEnabled(false);
 if(Signe.equalsIgnoreCase(SigneX)){ case9.setForeground(new java.awt.Color(0, 0, 255));}
 else{   case9.setForeground(new java.awt.Color(255, 0, 0));}
 }
                                      
   
    
    
                                      
                                      
                                      
                             
                                      
                                       
                                      
                                      Gagnant(joueur, tour);
                                       
                                 
                                 
                       
                            
                                 
                             }
                             System.out.println("Serveur déconecté");
                             out.close();
                             clientSocket.close();
                         } catch (IOException e) {
                             e.printStackTrace();
                         }
                     }
                 });
        recevoir.start();
   
      } catch (IOException e) {
           e.printStackTrace();
      }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelNom;
    private javax.swing.JButton case1;
    private javax.swing.JButton case2;
    private javax.swing.JButton case3;
    private javax.swing.JButton case4;
    private javax.swing.JButton case5;
    private javax.swing.JButton case6;
    private javax.swing.JButton case7;
    private javax.swing.JButton case8;
    private javax.swing.JButton case9;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel_1;
    private javax.swing.JPanel jPanel_2;
    private javax.swing.JPanel jPanel_3;
    private javax.swing.JPanel jPanel_4;
    private javax.swing.JPanel jPanel_5;
    private javax.swing.JPanel jPanel_6;
    private javax.swing.JPanel jPanel_7;
    private javax.swing.JPanel jPanel_8;
    private javax.swing.JPanel jPanel_9;
    private javax.swing.JPanel jPanel_GridHolder;
    // End of variables declaration//GEN-END:variables
}
