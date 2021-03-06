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
import java.io.IOException;
import java.net.URL;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;

/**
 *
 * @author Adriano Marques Martins 02640
 */
public class MenuMesario extends javax.swing.JFrame {

    ApuracaoControl apuracaoC;
    VotacaoControl votacaoC;
    CandidatoControl candidatoC;
    EleitorControl eleitorC;
    MesarioControl mesarioC;

    /**
     * Creates new form MenuMesario
     *
     * @param apuracaoC
     * @param votacaoC
     * @param candidatoC
     * @param eleitorC
     * @param mesarioC
     * @throws java.io.IOException
     */
    protected MenuMesario(ApuracaoControl apuracaoC, VotacaoControl votacaoC,
            CandidatoControl candidatoC, EleitorControl eleitorC, MesarioControl mesarioC) throws IOException {
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

    }

    private MenuMesario() {
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

        jRadioButton1 = new javax.swing.JRadioButton();
        panel1 = new java.awt.Panel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        textFieldTitulo = new java.awt.TextField();
        textFieldZona = new java.awt.TextField();
        buttonConsultar = new java.awt.Button();
        label3 = new java.awt.Label();
        buttonApurar = new java.awt.Button();
        label4 = new java.awt.Label();
        jButton1 = new javax.swing.JButton();
        label5 = new java.awt.Label();
        textField1 = new java.awt.TextField();
        textField2 = new java.awt.TextField();
        textField3 = new java.awt.TextField();
        jTextFieldSecao = new javax.swing.JTextField();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mesário");
        setMinimumSize(new java.awt.Dimension(720, 480));
        setResizable(false);

        panel1.setBackground(new java.awt.Color(204, 204, 204));

        label1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        label1.setText("TITULO DE LEITOR: ");

        label2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        label2.setText("ZONA ELEITORAL: ");

        buttonConsultar.setLabel("Consultar");
        buttonConsultar.setName(""); // NOI18N
        buttonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConsultarActionPerformed(evt);
            }
        });

        buttonApurar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        buttonApurar.setLabel("APURAR ELEIÇÃO");
        buttonApurar.setName(""); // NOI18N
        buttonApurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonApurarActionPerformed(evt);
            }
        });

        label4.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        label4.setText("CONSULTAR ELEITOR");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufv/caf/votacaoeletronica/image/braso.png"))); // NOI18N
        jButton1.setText("JUSTIÇA ELEITORAL");
        jButton1.setEnabled(false);
        jButton1.setFocusable(false);

        label5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        label5.setText("SEÇÃO:");

        textField1.setText("textField1");

        textField2.setText("textField2");

        textField3.setText("textField3");

        jTextFieldSecao.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldSecao, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buttonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(textFieldZona, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(367, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                                .addGap(27, 27, 27)
                                .addComponent(jButton1))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(buttonApurar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)))
                        .addGap(30, 30, 30))))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(textFieldZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(buttonApurar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        buttonApurar.getAccessibleContext().setAccessibleDescription("Finalizar Eleição");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonApurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonApurarActionPerformed
        ApuracaoVotacao aV = new ApuracaoVotacao(apuracaoC, votacaoC, candidatoC, eleitorC, mesarioC);
        this.setVisible(false);
        aV.setVisible(true);
    }//GEN-LAST:event_buttonApurarActionPerformed

    private void buttonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConsultarActionPerformed
        try {
            String zona = textFieldZona.getText();
            String titulo = textFieldTitulo.getText();
            String secao = jTextFieldSecao.getText();
            if (zona.contains("^[a-Z]") || titulo.contains("^[a-Z]") || secao.contains("^[a-Z]")) {
                throw new Exception("Entrada(s) inválida(s)!");
            } else {
                int iZona = Integer.parseInt(zona);
                int iTitulo = Integer.parseInt(titulo);
                int iSecao = Integer.parseInt(secao);
                if (iZona < 100 || iZona >= 10000 || iTitulo < 10000 || iSecao < 0) {
                    throw new Exception("Entrada(s) inválida(s)!");
                } else {
                    if (eleitorC.pesquisarEleitor(iTitulo, iZona, iSecao) == null) {
                        throw new Exception("Eleitor não cadastrado");
                    } else if (mesarioC.autorizarVoto(iTitulo, iZona, iSecao) == null) {
                        throw new Exception("Eleitor não pode votar na ZONA: "
                                + mesarioC.getZona() + " e SECAO: " + mesarioC.getSecao());
                    } else if (mesarioC.votou(iTitulo, iZona, iSecao)) {
                        throw new Exception("Eleitor já votou");
                    } else {
                        UrnaEletronica urna = new UrnaEletronica(apuracaoC, votacaoC, candidatoC, eleitorC, mesarioC);
                        mesarioC.ComputarVoto(iTitulo, iZona, iSecao);
                        this.setVisible(false);
                        urna.setVisible(true);
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        textFieldTitulo.setText("");
        textFieldZona.setText("");
        jTextFieldSecao.setText("");
    }//GEN-LAST:event_buttonConsultarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button buttonApurar;
    private java.awt.Button buttonConsultar;
    private javax.swing.JButton jButton1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField jTextFieldSecao;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Panel panel1;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    private java.awt.TextField textFieldTitulo;
    private java.awt.TextField textFieldZona;
    // End of variables declaration//GEN-END:variables
}
