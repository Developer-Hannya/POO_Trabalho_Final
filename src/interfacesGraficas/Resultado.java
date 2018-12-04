/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesGraficas;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import javax.swing.ImageIcon;

/**
 *
 * @author Marcelo
 */
public class Resultado extends javax.swing.JFrame {

    /**
     * Creates new form Resultado
     */
    public Resultado() {
        initComponents();
        setLocationRelativeTo(null);
        int r2 = leR();
        setaIF(r2);
    }
    
    /**
     * Esse método lê o inteiro que representa o resultado da batalha.
     * @return
     */
    public int leR() {
        int r = 2;
        try { 
            FileInputStream fis = new FileInputStream("resultado.ser");            
            ObjectInputStream ois = new ObjectInputStream(fis);
            r = (int) ois.readObject();
        } catch (Exception i) {
            System.out.println(i.toString());
        }
        return r;
    }
    
    /**
     * Esse método seta a imagem de fundo baseado no resultado obtido na batalha.
     * @param r2
     */
    public void setaIF(int r2) {
        ImageIcon fundo = new ImageIcon();
        if (r2 == 0) {
            fundo = new ImageIcon("src/imagensResultado/bgempate.png");
            FundoResultado.setIcon(fundo);
        }
        else if (r2 == 1) {
            fundo = new ImageIcon("src/imagensResultado/bgvitoria.png");
            FundoResultado.setIcon(fundo);
        }
        else {
            fundo = new ImageIcon("src/imagensResultado/bgderrota.png");
            FundoResultado.setIcon(fundo);
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

        BotaoDeNovo = new javax.swing.JButton();
        BotaoSair = new javax.swing.JButton();
        FundoResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 795, 450));
        setMinimumSize(new java.awt.Dimension(795, 450));
        setResizable(false);
        setSize(new java.awt.Dimension(795, 450));
        getContentPane().setLayout(null);

        BotaoDeNovo.setText("Joga de Novo");
        BotaoDeNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDeNovoActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoDeNovo);
        BotaoDeNovo.setBounds(70, 363, 170, 50);

        BotaoSair.setText("Sair");
        BotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoSair);
        BotaoSair.setBounds(580, 363, 170, 50);
        getContentPane().add(FundoResultado);
        FundoResultado.setBounds(0, 0, 800, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Ao clicar no botão 'Jogar de novo', o jogo retorna a janela de seleção.
     */
    private void BotaoDeNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDeNovoActionPerformed
        // TODO add your handling code here:
        Selecao vs = new Selecao();
        vs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaoDeNovoActionPerformed

    /**
     * Ao clicar no botão sair, o jogo fecha.
     */
    private void BotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BotaoSairActionPerformed

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
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resultado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoDeNovo;
    private javax.swing.JButton BotaoSair;
    private javax.swing.JLabel FundoResultado;
    // End of variables declaration//GEN-END:variables
}
