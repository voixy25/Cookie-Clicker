/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package demo;

import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import java.util.*;
import java.io.*;

/**
 *
 * @author Voixy
 */
public class Okno1 extends javax.swing.JFrame implements Runnable{
    
    double score = (int) (0);
    int autoclicker = 0;
    int grandma = 0;
    int farm = 0;
    int mine = 0;
    int factory = 0;
    boolean running = true;
    boolean pause = false;
    int timer = 0;
    int autoclickerCost = 15;
    int grandmaCost = 100;
    int farmCost = 1100;
    int mineCost = 12000;
    int factoryCost = 130000;
    double spers = 0;
    
    
    Thread t1;

    /**
     * Creates new form Okno1
     */
    public Okno1() {
        initComponents();
        this.setTitle(UvodnaStran.save.getName());
        
        
        try {
            BufferedReader br=new BufferedReader(new FileReader(UvodnaStran.save));
            while(br.ready()){
                score = (int) (Double.parseDouble(br.readLine()));
                spers = Double.parseDouble(br.readLine());
                gamescore.setText("Score: "+(int) (score));
                autoclicker = Integer.parseInt(br.readLine());
                    if (autoclicker>0) acounter.setText(autoclicker+"");
                autoclickerCost = Integer.parseInt(br.readLine());
                    if (autoclicker>0) autoclickerCost = (int) (Math.round((15*Math.pow(1.15, autoclicker))*10)/10.0);
                jLabel1.setText(autoclickerCost+"");
                
                grandma = Integer.parseInt(br.readLine());
                    if (grandma>0) gcounter.setText(grandma+"");
                grandmaCost = Integer.parseInt(br.readLine());
                    if (grandma>0) grandmaCost = (int) (Math.round((100*Math.pow(1.15, grandma))*10)/10.0);
                
                farm = Integer.parseInt(br.readLine());
                    if (farm>0) farmcounter.setText(farm+"");
                farmCost = Integer.parseInt(br.readLine());
                    if (farm>0) farmCost = (int) (Math.round((100*Math.pow(1.15, farm))*10)/10.0);
                    
                mine = Integer.parseInt(br.readLine());
                    if (mine>0) mcounter.setText(mine+"");
                mineCost = Integer.parseInt(br.readLine());
                    if (mine>0) mineCost = (int) (Math.round((100*Math.pow(1.15, mine))*10)/10.0);
                    
                factory = Integer.parseInt(br.readLine());
                    if (factory>0) factorycounter.setText(factory+"");
                factoryCost = Integer.parseInt(br.readLine());
                    if (factory>0) factoryCost = (int) (Math.round((100*Math.pow(1.15, factory))*10)/10.0);
                
            }
        } catch (IOException ex) {
            Logger.getLogger(Okno1.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        jOptionPane1.setVisible(false);
        t1 = new Thread(this);
        t1.start();
        
        gamescore.setText("Score: "+(int) (score));
        
        sps.setText("Score per Second: "+(spers));
        
        if (autoclicker==0) {
            jLabel1.setText("Cost: 15");
        } else {
            jLabel1.setText("Cost: "+autoclickerCost);
        }
        if (grandma==0) {
            jLabel2.setText("Cost: 100");
        } else {
            jLabel2.setText("Cost: "+grandmaCost);
        }
        if (farm==0) {
            jLabel3.setText("Cost: 1100");
        } else {
            jLabel3.setText("Cost: "+farmCost);
        }
        if (mine==0) {
            jLabel4.setText("Cost: 12000");
        } else {
            jLabel4.setText("Cost: "+mineCost);
        }
        if (factory==0) {
            jLabel5.setText("Cost: 130000");
        } else {
            jLabel5.setText("Cost: "+factoryCost);
        }
        
    
}
    
    public void run() {

        //če se blnTreadIsRunning postavi na false se zanka prekine in nit se uniči
        //cas1 = System.currentTimeMillis();
        while (running == true) {

            // vsako sekundo povečaj števec za 1
            // za logiko se dejansko rabi samo števec, intSekunde je le za prikaz
            // intStevec se resetira na začetek, po vsaki periodi, da ne gre v neskonnost.           

            if (autoclicker >= 1) {
                score = Math.round((score + 0.1*autoclicker)*10)/10.0;
                gamescore.setText("Score: "+(int) (score));
                //System.out.println(Okno1.score);
                pause = true;
            }
            
            if (grandma >= 1) {
                score = Math.round((score + 1*grandma)*10)/10.0;
                gamescore.setText("Score: "+(int) (score));
                //System.out.println(Okno1.score);
                pause = true;
            }
            
            if (farm >= 1) {
                score = Math.round((score + 8*farm)*10)/10.0;
                gamescore.setText("Score: "+(int) (score));
                //System.out.println(Okno1.score);
                pause = true;
            }
            
            if (mine >= 1) {
                score = Math.round((score + 47*farm)*10)/10.0;
                gamescore.setText("Score: "+(int) (score));
                //System.out.println(Okno1.score);
                pause = true;
            }
            
            if (factory >= 1) {
                score = Math.round((score + 260*factory)*10)/10.0;
                gamescore.setText("Score: "+(int) (score));
                //System.out.println(Okno1.score);
                pause = true;
            }
            

            // če nočemo menjati slike(pavza) nit čaka da jo spet potrebujemo
            // pavza je zmnanjšana, ker drugače ob kliku lahko čakaš celo sekundo za nadaljevanje
            
                try {
                    t1.sleep(1000);
                    //Okno1.pause = false;
                    } 
                
                catch (Exception e) {
                    //Okno1.pause = false;
                }
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cookie = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        autoclickerbutton = new javax.swing.JLabel();
        minebutton = new javax.swing.JLabel();
        grandmabutton = new javax.swing.JLabel();
        farmbutton = new javax.swing.JLabel();
        factorybutton = new javax.swing.JLabel();
        factorycounter = new javax.swing.JLabel();
        acounter = new javax.swing.JLabel();
        gcounter = new javax.swing.JLabel();
        farmcounter = new javax.swing.JLabel();
        mcounter = new javax.swing.JLabel();
        gamescore = new javax.swing.JLabel();
        sps = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(960, 540));
        setMinimumSize(new java.awt.Dimension(960, 540));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jOptionPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(694, 426, -1, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(822, 58, 104, 20));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 146, 106, 20));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 228, 96, 20));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(832, 310, 96, 20));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(832, 392, 98, 20));

        cookie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/PerfectCookie (1).png"))); // NOI18N
        cookie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cookieMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cookieMousePressed(evt);
            }
        });
        getContentPane().add(cookie, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 118, -1, -1));

        jLabel20.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("AUTOCLICKER");
        jLabel20.setFocusable(false);
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(786, 32, -1, -1));

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("FACTORY");
        jLabel18.setFocusable(false);
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 366, -1, -1));

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("FARM");
        jLabel15.setFocusable(false);
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(846, 202, -1, -1));

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("MINE");
        jLabel16.setFocusable(false);
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(842, 284, -1, -1));

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("GRANDMA");
        jLabel17.setFocusable(false);
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(818, 118, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/Farm.png"))); // NOI18N
        jLabel6.setFocusable(false);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 192, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/Factory_new.png"))); // NOI18N
        jLabel7.setFocusable(false);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 354, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/Cursor_64px.png"))); // NOI18N
        jLabel8.setFocusable(false);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(744, 26, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/Grandmas-1.png"))); // NOI18N
        jLabel9.setFocusable(false);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(752, 106, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/Mine_new.png"))); // NOI18N
        jLabel10.setFocusable(false);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 278, -1, -1));

        autoclickerbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/—Pngtree—buttons games button illustration_5544907 (1).png"))); // NOI18N
        autoclickerbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                autoclickerbuttonMouseClicked(evt);
            }
        });
        getContentPane().add(autoclickerbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 18, 196, -1));

        minebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/—Pngtree—buttons games button illustration_5544907 (1).png"))); // NOI18N
        minebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minebuttonMouseClicked(evt);
            }
        });
        getContentPane().add(minebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 272, 196, -1));

        grandmabutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/—Pngtree—buttons games button illustration_5544907 (1).png"))); // NOI18N
        grandmabutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grandmabuttonMouseClicked(evt);
            }
        });
        getContentPane().add(grandmabutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(744, 106, 196, -1));

        farmbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/—Pngtree—buttons games button illustration_5544907 (1).png"))); // NOI18N
        farmbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                farmbuttonMouseClicked(evt);
            }
        });
        getContentPane().add(farmbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(744, 190, 196, -1));

        factorybutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/—Pngtree—buttons games button illustration_5544907 (1).png"))); // NOI18N
        factorybutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                factorybuttonMouseClicked(evt);
            }
        });
        getContentPane().add(factorybutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 352, 196, -1));

        factorycounter.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        factorycounter.setForeground(new java.awt.Color(255, 255, 255));
        factorycounter.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        factorycounter.setText("0");
        getContentPane().add(factorycounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(666, 366, 76, 50));

        acounter.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        acounter.setForeground(new java.awt.Color(255, 255, 255));
        acounter.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        acounter.setText("0");
        getContentPane().add(acounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(666, 34, 76, 50));

        gcounter.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        gcounter.setForeground(new java.awt.Color(255, 255, 255));
        gcounter.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        gcounter.setText("0");
        getContentPane().add(gcounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 120, 76, 50));

        farmcounter.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        farmcounter.setForeground(new java.awt.Color(255, 255, 255));
        farmcounter.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        farmcounter.setText("0");
        getContentPane().add(farmcounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 206, 76, 50));

        mcounter.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        mcounter.setForeground(new java.awt.Color(255, 255, 255));
        mcounter.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mcounter.setText("0");
        getContentPane().add(mcounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 288, 76, 50));

        gamescore.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        gamescore.setForeground(new java.awt.Color(255, 255, 255));
        gamescore.setText("Score: 0");
        getContentPane().add(gamescore, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 16, 272, -1));

        sps.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        sps.setForeground(new java.awt.Color(255, 255, 255));
        sps.setText("Score per Second: 0");
        getContentPane().add(sps, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 68, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/game.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -20, -1, -1));

        jMenu1.setText("File");

        jMenuItem2.setText("Save");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setText("Start Over");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText("Exit and Save");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(UvodnaStran.save,false));
            pw.println(score);
            pw.println(spers);
            pw.println(autoclicker);
            pw.println(autoclickerCost);
            pw.println(grandma);
            pw.println(grandmaCost);
            pw.println(farm);
            pw.println(farmCost);
            pw.println(mine);
            pw.println(mineCost);
            pw.println(factory);
            pw.println(factoryCost);
            pw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Okno1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(UvodnaStran.save,false));
            pw.println(score);
            pw.println(spers);
            pw.println(autoclicker);
            pw.println(autoclickerCost);
            pw.println(grandma);
            pw.println(grandmaCost);
            pw.println(farm);
            pw.println(farmCost);
            pw.println(mine);
            pw.println(mineCost);
            pw.println(factory);
            pw.println(factoryCost);
            pw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Okno1.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(UvodnaStran.save);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Okno1.class.getName()).log(Level.SEVERE, null, ex);
        }
        pw.write("");
        pw.flush(); 
        pw.close();
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void cookieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cookieMouseClicked
        
    }//GEN-LAST:event_cookieMouseClicked

    private void cookieMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cookieMousePressed
        score++;
        gamescore.setText("Score: "+(int) (score));
    }//GEN-LAST:event_cookieMousePressed

    private void autoclickerbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_autoclickerbuttonMouseClicked
        if (score >= autoclickerCost){
            score = (int) (score-autoclickerCost);
            gamescore.setText("Score: "+(int) (score));
            autoclicker++;
            spers = spers + 0.1;
            sps.setText("Score per Second: "+(spers));
            autoclickerCost = (int) (Math.round((15*Math.pow(1.15, autoclicker))*10)/10.0);
            jLabel1.setText("Cost: "+autoclickerCost);
            acounter.setText(autoclicker+"");
        } else {
            jOptionPane1.showMessageDialog(null, "You don't have enough cookies!");
        }
    }//GEN-LAST:event_autoclickerbuttonMouseClicked

    private void minebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minebuttonMouseClicked
        if (score >= mineCost){
            score = (int) (score-mineCost);
            gamescore.setText("Score: "+(int) (score));
            mine++;
            spers = spers + 47;
            sps.setText("Score per Second: "+(spers));
            mineCost = (int) (Math.round((15*Math.pow(1.15, mine))*10)/10.0);
            jLabel4.setText("Cost: "+mineCost);
            mcounter.setText(mine+"");
        } else {
            jOptionPane1.showMessageDialog(null, "You don't have enough cookies!");
        }
    }//GEN-LAST:event_minebuttonMouseClicked

    private void grandmabuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grandmabuttonMouseClicked
        if (score >= grandmaCost){
            score = (int) (score-grandmaCost);
            gamescore.setText("Score: "+(int) (score));
            grandma++;
            spers = spers + 1;
            sps.setText("Score per Second: "+(spers));
            grandmaCost = (int) (Math.round((100*Math.pow(1.15, grandma))*10)/10.0);
            jLabel2.setText("Cost: "+grandmaCost);
            gcounter.setText(grandma+"");
        } else {
            jOptionPane1.showMessageDialog(null, "You don't have enough cookies!");
        }
    }//GEN-LAST:event_grandmabuttonMouseClicked

    private void farmbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_farmbuttonMouseClicked
        if (score >= farmCost){
            score = (int) (score-farmCost);
            gamescore.setText("Score: "+(int) (score));
            farm++;
            spers = spers + 8;
            sps.setText("Score per Second: "+(spers));
            farmCost = (int) (Math.round((15*Math.pow(1.15, farm))*10)/10.0);
            jLabel3.setText("Cost: "+farmCost);
            farmcounter.setText(farm+"");
        } else {
            jOptionPane1.showMessageDialog(null, "You don't have enough cookies!");
        }
    }//GEN-LAST:event_farmbuttonMouseClicked

    private void factorybuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_factorybuttonMouseClicked
        if (score >= factoryCost){
            score = (int) (score-factoryCost);
            gamescore.setText("Score: "+(int) (score));
            factory++;
            spers = spers + 260;
            sps.setText("Score per Second: "+(spers));
            factoryCost = (int) (Math.round((15*Math.pow(1.15, factory))*10)/10.0);
            jLabel5.setText("Cost: "+factoryCost);
            factorycounter.setText(factory+"");
        } else {
            jOptionPane1.showMessageDialog(null, "You don't have enough cookies!");
        }
    }//GEN-LAST:event_factorybuttonMouseClicked

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
            java.util.logging.Logger.getLogger(Okno1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Okno1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Okno1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Okno1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Okno1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acounter;
    private javax.swing.JLabel autoclickerbutton;
    private javax.swing.JLabel background;
    private javax.swing.JLabel cookie;
    private javax.swing.JLabel factorybutton;
    private javax.swing.JLabel factorycounter;
    private javax.swing.JLabel farmbutton;
    private javax.swing.JLabel farmcounter;
    private javax.swing.JLabel gamescore;
    private javax.swing.JLabel gcounter;
    private javax.swing.JLabel grandmabutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JLabel mcounter;
    private javax.swing.JLabel minebutton;
    private javax.swing.JLabel sps;
    // End of variables declaration//GEN-END:variables
}
