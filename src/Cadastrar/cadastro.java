/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastrar;

import AppFicha.Painel;
import Autenticacao.Login;
import Conecta.Conexao;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

 /* @author Pedro Amorim, Pedro Ostroski e Rodrigo Neves
 */
public class cadastro extends javax.swing.JFrame {
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public cadastro() {
        initComponents();
        conexao= Conexao.conector();
        
        if(conexao == null){
         
            lblStatus.setText("Desonectado");
        }
        else {
           
            lblStatus.setText("Conectado");      
        }
    }
    
    private void possuo(){
            Login login = new Login();
            login.setVisible(true);
            this.dispose();
    }
    
    private boolean findCod() {
        PreparedStatement pstFind = null;
        ResultSet rsFind = null;
        boolean ret = false;
        
        String sql = "select * from tb_cad where nm_user = ?";
        
        try {
            pstFind = conexao.prepareStatement(sql);
            pstFind.setString(1, nm_user.getText());
            rsFind = pstFind.executeQuery();
            if (rsFind.next()) {
                ret = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return ret;
    }
    
    private void cadastrar() {
        String sql = "insert into tb_cad(nm_cmpl, nm_user, ds_pass, ds_email) values (?,?,?,?)";
    try{    
        pst = conexao.prepareStatement(sql);
        pst.setString(1, nm_cmpl.getText());
        pst.setString(2, nm_user.getText());
        pst.setString(3, ds_pass.getText());
        pst.setString(4, ds_email.getText());
        int i = 10;
       if (ds_pass.getText().length() > i){
           JOptionPane.showMessageDialog(null,"A senha só pode ter 10 caracteres ", "Aviso", JOptionPane.WARNING_MESSAGE);
       }  else {
        if (nm_cmpl.getText().isEmpty() || nm_user.getText().isEmpty() || ds_pass.getText().isEmpty() || ds_email.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Todos os campos devem ser preenchidos", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {
 
            boolean bAchou = findCod();
            System.out.println(bAchou);
            if (bAchou == true) {
                JOptionPane.showMessageDialog(null,"Nome de Usuário já existe", "Aviso", JOptionPane.WARNING_MESSAGE);
            } else {
                int adicionado = pst.executeUpdate();
                
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
                    nm_cmpl.setText(null);
                    nm_user.setText(null);
                    ds_pass.setText(null);
                    ds_email.setText(null);
                    ds_conf.setText(null);
                }
            }
        }
       }  
    } catch (Exception e) {
        System.out.println(e);
    }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nm_cmpl = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ds_pass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        ds_conf = new javax.swing.JPasswordField();
        btn_cad = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        nm_user = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ds_email = new javax.swing.JTextField();
        btn_return = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dungeons & Drives");

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro");

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel2.setText("Nome Completo");

        nm_cmpl.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel3.setText("Senha");

        ds_pass.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel4.setText("Confirmar Senha");

        ds_conf.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N

        btn_cad.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        btn_cad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconfinder_Monster_2913115 (1).png"))); // NOI18N
        btn_cad.setText("Cadastrar");
        btn_cad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel5.setText("Usuário");

        nm_user.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel6.setText("Email");

        ds_email.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N

        btn_return.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        btn_return.setText("Possuo uma Conta");
        btn_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returnActionPerformed(evt);
            }
        });

        lblStatus.setText("Conectado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_cad)
                        .addGap(18, 18, 18)
                        .addComponent(btn_return))
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ds_conf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                        .addComponent(ds_pass, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nm_cmpl, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(lblStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(ds_email, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nm_user, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nm_cmpl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nm_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ds_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ds_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ds_conf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cad)
                    .addComponent(btn_return, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblStatus)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadActionPerformed
        cadastrar();
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_cadActionPerformed

    private void btn_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnActionPerformed
        possuo();
    }//GEN-LAST:event_btn_returnActionPerformed


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
            java.util.logging.Logger.getLogger(cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cad;
    private javax.swing.JButton btn_return;
    private javax.swing.JPasswordField ds_conf;
    private javax.swing.JTextField ds_email;
    private javax.swing.JPasswordField ds_pass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTextField nm_cmpl;
    private javax.swing.JTextField nm_user;
    // End of variables declaration//GEN-END:variables
}
