/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerCidade;
import controller.ControllerCliente;
import controller.ControllerClienteCidadeEstado;
import controller.ControllerEstado;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ModelCidade;
import model.ModelCliente;
import model.ModelClienteCidadeEstado;
import model.ModelEstado;

/**
 *
 * @author leand
 */
public class ViewEnderecoCliente extends javax.swing.JFrame {

    ControllerEstado controllerEstado = new ControllerEstado();
    ArrayList<ModelEstado> listaModelEstados = new ArrayList<>();
    ControllerCidade controllerCidade = new ControllerCidade();
    ArrayList<ModelCidade> listaModelCidades = new ArrayList<>();
    ModelClienteCidadeEstado modelClienteCidadeEstado = new ModelClienteCidadeEstado();
    ControllerClienteCidadeEstado controllerClienteCidadeEstado = new ControllerClienteCidadeEstado();
    ModelCliente modelCliente = new ModelCliente();
    ControllerCliente controllerCliente = new ControllerCliente();

    /**
     * Creates new form ViewEnderecoCliente
     */
    public ViewEnderecoCliente() {
        initComponents();
        listarEstados();
        listarCidades();
        setLocationRelativeTo(null);
    }

    public void retornarClientePeloCodigo() {
        modelClienteCidadeEstado = controllerClienteCidadeEstado.getClienteCidadeEstadoController(Integer.parseInt(jtfCodigo.getText()));

        this.jtfNome.setText(modelClienteCidadeEstado.getModelCliente().getNome());
        this.jtfEndereco.setText(modelClienteCidadeEstado.getModelCliente().getEndereco());
        this.jtfBairro.setText(modelClienteCidadeEstado.getModelCliente().getBairro());
        this.jcbEstado.setSelectedItem(modelClienteCidadeEstado.getModelEstado().getUf());
        this.listarCidades();
        this.jcbCidade.setSelectedItem(modelClienteCidadeEstado.getModelCidade().getNome());
        this.jtfTelefone.setText(modelClienteCidadeEstado.getModelCliente().getTelefone());
        this.jtfcep.setText(modelClienteCidadeEstado.getModelCliente().getCep());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbCancelar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jtfNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfEndereco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfBairro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jcbEstado = new javax.swing.JComboBox<>();
        jcbCidade = new componentes.UJComboBox();
        jLabel5 = new javax.swing.JLabel();
        jtfcep = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfTelefone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Endereço do cliente");
        setAlwaysOnTop(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));

        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons 20/icons8-fechar-janela-filled-50.png"))); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons 20/icons8-salvar-filled-50.png"))); // NOI18N
        jbSalvar.setText("Salvar alteração");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jLabel1.setText("Cliente:");

        jtfCodigo.setEditable(false);

        jLabel2.setText("Endereço:");

        jLabel3.setText("Bairro:");

        jLabel4.setText("UF:");

        jcbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbEstado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jcbEstadoFocusLost(evt);
            }
        });
        jcbEstado.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jcbEstadoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel5.setText("Cidade:");

        try {
            jtfcep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel6.setText("CEP:");

        jLabel7.setText("Telefone:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfEndereco)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 293, Short.MAX_VALUE)
                        .addComponent(jbSalvar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfNome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jcbCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jtfcep, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfcep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar)
                    .addComponent(jbSalvar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        modelCliente.setCodigo(Integer.parseInt(this.jtfCodigo.getText()));
        modelCliente.setNome(this.jtfNome.getText());
        modelCliente.setEndereco(this.jtfEndereco.getText());
        modelCliente.setBairro(this.jtfBairro.getText());
        modelCliente.setCodCidade(controllerCidade.getCidadeController(this.jcbCidade.getSelectedItem().toString()).getCodigo());
        modelCliente.setCep(this.jtfcep.getText());
        modelCliente.setTelefone(this.jtfTelefone.getText());

        //alterar 
        if (controllerCliente.atualizarEnderecoClienteController(modelCliente)) {
            JOptionPane.showMessageDialog(this, "Registro alterado com sucesso!");
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao alterar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jcbEstadoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbEstadoPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        if (this.jcbEstado.isPopupVisible()) {
            listarCidades();
        }
    }//GEN-LAST:event_jcbEstadoPopupMenuWillBecomeInvisible

    private void jcbEstadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbEstadoFocusLost
        // TODO add your handling code here:
        listarCidades();
    }//GEN-LAST:event_jcbEstadoFocusLost

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
            java.util.logging.Logger.getLogger(ViewEnderecoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEnderecoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEnderecoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEnderecoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewEnderecoCliente().setVisible(true);
            }
        });
    }

    /**
     * Preencher combobox cidades
     */
    private void listarCidades() {
        try {
            listaModelCidades = controllerCidade.getListaCidadePorEstadoController(controllerEstado.getEstadoUFController(this.jcbEstado.getSelectedItem().toString()).getCodigo());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Você deve cadastrar cidades e estados primeiro!");
        }
        jcbCidade.removeAllItems();
        for (int i = 0; i < listaModelCidades.size(); i++) {
            jcbCidade.addItem(listaModelCidades.get(i).getNome());
        }
    }

    /**
     * Preencher combobox estados
     */
    private void listarEstados() {
        listaModelEstados = controllerEstado.getListaEstadoController();
        jcbEstado.removeAllItems();
        for (int i = 0; i < listaModelEstados.size(); i++) {
            jcbEstado.addItem(listaModelEstados.get(i).getUf());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbSalvar;
    private componentes.UJComboBox jcbCidade;
    private javax.swing.JComboBox<String> jcbEstado;
    private javax.swing.JTextField jtfBairro;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfEndereco;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfTelefone;
    private javax.swing.JFormattedTextField jtfcep;
    // End of variables declaration//GEN-END:variables

    public void setTextFildCodigo(int pcodigo) {
        this.jtfCodigo.setText(pcodigo + "");
    }
}