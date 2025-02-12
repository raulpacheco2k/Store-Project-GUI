/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.raulpacheco.views;

import br.com.raulpacheco.models.DAO.ConnectionFactory;
import br.com.raulpacheco.models.bo.Bairro;
import br.com.raulpacheco.models.bo.Cidade;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author house
 */
public class TelaCadEndereco extends JFrame implements BaseMenuButtonsInterface {

    /**
     * Creates new form FormModeloCadastros
     */
    public TelaCadEndereco() {
        initComponents();
        preencheCidades();
        preencheBairros();
    }

    private void preencheCidades() {
        String sqlExecutar = "SELECT idcidade, descricaoCidade, ufCidade FROM cidade";
        Connection conexao = ConnectionFactory.getConnection();

        try {
            assert conexao != null;
            PreparedStatement pstm = conexao.prepareStatement(sqlExecutar);
            ResultSet result = pstm.executeQuery();

            result.first();

            while (result.next()) {
                cities.addItem(new Cidade(result));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Erro:" + e);
        }
    }

    private void preencheBairros() {
        String sqlExecutar = "SELECT idbairro, descricaoBairro FROM bairro";
        Connection conexao = ConnectionFactory.getConnection();

        try {
            assert conexao != null;
            PreparedStatement pstm = conexao.prepareStatement(sqlExecutar);
            ResultSet result = pstm.executeQuery();

            result.first();

            while (result.next()) {
                neighborhood.addItem(new Bairro(result));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Erro:" + e);
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

        jPanelTitulo = new JPanel();
        jLabelTitulo = new JLabel();
        jPanelDados = new JPanel();
        cities = new JComboBox<>();
        zipCode = new JTextField();
        jLabel1 = new JLabel();
        street = new JTextField();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        neighborhood = new JComboBox<>();
        jLabel4 = new JLabel();
        id = new JTextField();
        jLabel5 = new JLabel();
        jPanelBotoes = new JPanel();
        jButtonNovo = new JButton();
        jButtonCancelar = new JButton();
        jButtonGravar = new JButton();
        jButtonBuscar = new JButton();
        jButtonSair = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Endereço");
        setResizable(false);

        jPanelTitulo.setBackground(new java.awt.Color(204, 255, 0));
        jPanelTitulo.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelTitulo.setPreferredSize(new java.awt.Dimension(533, 75));

        jLabelTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(51, 0, 153));
        jLabelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelTitulo.setText("Cadastro de Endereços");

        GroupLayout jPanelTituloLayout = new GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
                jPanelTituloLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelTitulo, GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
        );
        jPanelTituloLayout.setVerticalGroup(
                jPanelTituloLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelTitulo, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelTitulo, java.awt.BorderLayout.NORTH);

        jPanelDados.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citiesActionPerformed(evt);
            }
        });

        zipCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zipCodeActionPerformed(evt);
            }
        });

        jLabel1.setText("CEP");

        street.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                streetActionPerformed(evt);
            }
        });

        jLabel2.setText("Logadouro");

        jLabel3.setText("Cidade");

        neighborhood.setModel(new DefaultComboBoxModel<>(new String[]{}));
        neighborhood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neighborhoodActionPerformed(evt);
            }
        });

        jLabel4.setText("Bairro");

        jLabel5.setText("Código");

        GroupLayout jPanelDadosLayout = new GroupLayout(jPanelDados);
        jPanelDados.setLayout(jPanelDadosLayout);
        jPanelDadosLayout.setHorizontalGroup(
                jPanelDadosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanelDadosLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanelDadosLayout.createSequentialGroup()
                                                .addGroup(jPanelDadosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(id, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanelDadosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(zipCode, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanelDadosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(street, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel2)))
                                        .addGroup(jPanelDadosLayout.createSequentialGroup()
                                                .addGroup(jPanelDadosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(cities, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanelDadosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(neighborhood, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDadosLayout.setVerticalGroup(
                jPanelDadosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanelDadosLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelDadosLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(id, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(zipCode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(street, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelDadosLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanelDadosLayout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cities, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelDadosLayout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(neighborhood, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelDados, java.awt.BorderLayout.CENTER);

        jPanelBotoes.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelBotoes.setPreferredSize(new java.awt.Dimension(533, 50));

//        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/New document.png"))); // NOI18N
        jButtonNovo.setText("Novo");
        jButtonNovo.setPreferredSize(new java.awt.Dimension(100, 30));
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        jPanelBotoes.add(jButtonNovo);

//        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cancel.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanelBotoes.add(jButtonCancelar);

//        jButtonGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/OK.png"))); // NOI18N
        jButtonGravar.setText("Gravar");
        jButtonGravar.setEnabled(false);
        jButtonGravar.setPreferredSize(new java.awt.Dimension(100, 30));
        jButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarActionPerformed(evt);
            }
        });
        jPanelBotoes.add(jButtonGravar);

//        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Find.png"))); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanelBotoes.add(jButtonBuscar);

//        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Exit.png"))); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanelBotoes.add(jButtonSair);

        getContentPane().add(jPanelBotoes, java.awt.BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void citiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citiesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_citiesActionPerformed

    private void streetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_streetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_streetActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGravarActionPerformed

    private void neighborhoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neighborhoodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_neighborhoodActionPerformed

    private void zipCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zipCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zipCodeActionPerformed

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
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadEndereco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JComboBox<Object> cities;
    private JTextField id;
    private JButton jButtonBuscar;
    private JButton jButtonCancelar;
    private JButton jButtonGravar;
    private JButton jButtonNovo;
    private JButton jButtonSair;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabelTitulo;
    private JPanel jPanelBotoes;
    private JPanel jPanelDados;
    private JPanel jPanelTitulo;
    private JComboBox<Object> neighborhood;
    private JTextField street;
    private JTextField zipCode;
    // End of variables declaration//GEN-END:variables

    public JTextField getId() {
        return id;
    }

    public JTextField getZipCode() {
        return zipCode;
    }

    public JTextField getStreet() {
        return street;
    }

    public JComboBox getCity() {
        return cities;
    }

    public JComboBox getNeighborhood() {
        return neighborhood;
    }

    public JButton getjButtonBuscar() {
        return jButtonBuscar;
    }

    @Override
    public JButton getjButtonCarregar() {
        return null;
    }

    public JButton getjButtonCancelar() {
        return jButtonCancelar;
    }

    public JButton getjButtonGravar() {
        return jButtonGravar;
    }

    public JButton getjButtonNovo() {
        return jButtonNovo;
    }

    public JButton getjButtonSair() {
        return jButtonSair;
    }

    public JPanel getjPanelDados() {
        return jPanelDados;
    }
}
