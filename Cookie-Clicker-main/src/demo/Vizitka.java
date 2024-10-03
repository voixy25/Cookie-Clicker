/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package demo;

import javax.swing.ImageIcon;

/**
 *
 * @author Domen
 */
public class Vizitka extends javax.swing.JFrame {

    /**
     * Creates new form Vizitka
     */
    public Vizitka() {
        initComponents();
        this.setTitle("Info");
        ImageIcon img = new ImageIcon("src/slike/PerfectCookie (1).png");
        this.setIconImage(img.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gamescore = new javax.swing.JLabel();
        gamescore1 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(780, 540));
        setMinimumSize(new java.awt.Dimension(780, 540));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gamescore.setFont(new java.awt.Font("Burbank Big Rg Bk", 0, 36)); // NOI18N
        gamescore.setForeground(new java.awt.Color(255, 255, 255));
        gamescore.setText("USTVARIL: DOMEN SKOMINA, 3RB");
        getContentPane().add(gamescore, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 710, 60));

        gamescore1.setFont(new java.awt.Font("Burbank Big Rg Bk", 0, 36)); // NOI18N
        gamescore1.setForeground(new java.awt.Color(255, 255, 255));
        gamescore1.setText("MENTORJA: TOMAŽ MAVRI, EDI MEDVEŠČEK");
        getContentPane().add(gamescore1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 710, 60));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/back.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backMousePressed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/login.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, -40, 960, 630));

        setSize(new java.awt.Dimension(796, 548));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMousePressed
        new UvodnaStran().setVisible(true);
        dispose();
    }//GEN-LAST:event_backMousePressed

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
            java.util.logging.Logger.getLogger(Vizitka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vizitka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vizitka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vizitka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vizitka().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel gamescore;
    private javax.swing.JLabel gamescore1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
