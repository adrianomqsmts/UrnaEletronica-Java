/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufv.caf.votacaoeletronica.view;

import br.ufv.caf.votacaoeletronica.control.ApuracaoControl;
import br.ufv.caf.votacaoeletronica.control.CandidatoControl;
import br.ufv.caf.votacaoeletronica.control.EleitorControl;
import br.ufv.caf.votacaoeletronica.control.MesarioControl;
import br.ufv.caf.votacaoeletronica.control.VotacaoControl;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
/**
 *
 * @author Adriano Marques Martins 02640
 */
public class ApuracaoVotacao extends javax.swing.JFrame {
    
    ApuracaoControl apuracaoC;
    VotacaoControl votacaoC;
    CandidatoControl candidatoC;
    EleitorControl eleitorC;
    MesarioControl mesarioC;

    /**
     * Creates new form ApuracaoVotacao
     *
     * @param apuracaoC
     * @param votacaoC
     * @param candidatoC
     * @param eleitorC
     * @param mesarioC
     */
    protected ApuracaoVotacao(ApuracaoControl apuracaoC, VotacaoControl votacaoC,
            CandidatoControl candidatoC, EleitorControl eleitorC, MesarioControl mesarioC) {
        this.apuracaoC = apuracaoC;
        this.votacaoC = votacaoC;
        this.candidatoC = candidatoC;
        this.eleitorC = eleitorC;
        this.mesarioC = mesarioC;
        //Código acessado em: http://www.larback.com.br/aula/91/Alterando-o-%C3%ADcone-da-janela-em-java
        URL url = getClass().getResource("../image/icone.png");
        Image icone = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(icone);
        this.setSize(200, 200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        initComponents();
        Icon figura = new ImageIcon(getToolkit().createImage(getClass().getResource("../image/ok.png")));        
        try {
            apuracaoC.apurarVotacao(votacaoC, candidatoC);
            JOptionPane.showMessageDialog(null, "FINALIZADO COM SUCESSO", "Apuração concluída", JOptionPane.ERROR_MESSAGE, figura);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NÃO FOI FINALIZADO COM SUCESSO", "APURAÇÃO NÃO CONCLUÍDA", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }
    
    private ApuracaoVotacao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Votação Apurada");
        setMinimumSize(new java.awt.Dimension(720, 480));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(153, 153, 153)));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufv/caf/votacaoeletronica/image/brasaoGrande.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setEnabled(false);
        jButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("JUSTIÇA ELEITORAL ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel1)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
