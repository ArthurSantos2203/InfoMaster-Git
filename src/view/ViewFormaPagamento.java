/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerFormaPagamento;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelFormaPagamento;

/**
 *
 * @author Administrador
 */
public class ViewFormaPagamento extends javax.swing.JFrame {

    ControllerFormaPagamento controllerFormaPagamento = new ControllerFormaPagamento();
    ModelFormaPagamento modelFormaPagamento = new ModelFormaPagamento();
    ArrayList<ModelFormaPagamento> listaFormaPagamentos = new ArrayList<>();
    String tipoCadastro;

    /**
     * Creates new form ViewFormaPagamento
     */
    public ViewFormaPagamento() {
        initComponents();
        setLocationRelativeTo(null);
        this.carregarFormaPagamento();
        this.limparCampos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        tfDescricao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btCancelar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tfDesconto = new javax.swing.JFormattedTextField();
        tfQuantidadeParcelas = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbFormaPagamento = new javax.swing.JTable();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfObservacao = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rbAtivo = new javax.swing.JRadioButton();
        rbInativo = new javax.swing.JRadioButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Forma de pagamento");
        setIconImage(new ImageIcon(getClass().getResource("/imagens/blicon.png")).getImage());
        setResizable(false);

        jLabel1.setText("Código:");

        tfCodigo.setEditable(false);
        tfCodigo.setEnabled(false);

        jLabel2.setText("Descrição:");

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons 20/icons8-fechar-janela-filled-50.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons 20/icons8-salvar-filled-50.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        jLabel3.setText("% Desconto:");

        tfDesconto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        tfQuantidadeParcelas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        jLabel4.setText("Quant. Parcelas:");

        tbFormaPagamento.setAutoCreateRowSorter(true);
        tbFormaPagamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Descrição", "Desconto", "Parcela", "Situação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbFormaPagamento.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbFormaPagamento.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbFormaPagamento.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbFormaPagamento);
        if (tbFormaPagamento.getColumnModel().getColumnCount() > 0) {
            tbFormaPagamento.getColumnModel().getColumn(1).setMinWidth(300);
            tbFormaPagamento.getColumnModel().getColumn(1).setPreferredWidth(300);
            tbFormaPagamento.getColumnModel().getColumn(4).setMinWidth(110);
            tbFormaPagamento.getColumnModel().getColumn(4).setPreferredWidth(110);
            tbFormaPagamento.getColumnModel().getColumn(4).setMaxWidth(110);
        }

        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons 20/icons8-editar-filled-50.png"))); // NOI18N
        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons 20/icons8-excluir-filled-50.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        tfObservacao.setColumns(20);
        tfObservacao.setRows(5);
        jScrollPane1.setViewportView(tfObservacao);

        jLabel6.setText("Observação:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Situação:"));

        buttonGroup1.add(rbAtivo);
        rbAtivo.setSelected(true);
        rbAtivo.setText("Ativo");

        buttonGroup1.add(rbInativo);
        rbInativo.setText("Inativo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(rbAtivo)
                .addGap(32, 32, 32)
                .addComponent(rbInativo)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbAtivo)
                    .addComponent(rbInativo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSalvar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tfDescricao)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfQuantidadeParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfQuantidadeParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar)
                    .addComponent(btSalvar)
                    .addComponent(btAlterar)
                    .addComponent(btExcluir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (tipoCadastro.equals("novo")) {
            salvarFormaPagamento();
            limparCampos();
            this.tfCodigo.setText("");
        } else if (tipoCadastro.equals("alteracao")) {
            alterarFormaPagamento();
            limparCampos();
            this.tfCodigo.setText("");
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        limparCampos();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        int linhaSelecionada = tbFormaPagamento.getSelectedRow();
        // Verificamos se existe realmente alguma linha selecionada
        if (linhaSelecionada < 0) {
            JOptionPane.showMessageDialog(this, "Você deve selecionar um item na tabela antes de clicar no botão!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
        } else {
            limparCampos();
            tipoCadastro = "alteracao";
            retornarFormaPagamento();
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int linhaSelecionada = tbFormaPagamento.getSelectedRow();
        //Verificamos se existe realmente alguma linha selecionada
        if (linhaSelecionada < 0) {
            JOptionPane.showMessageDialog(this, "Você deve selecionar um item na tabela antes de clicar no botão!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
        } else {
            this.excluirFormapagamento();
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private boolean alterarFormaPagamento() {
        modelFormaPagamento.setCodigo(Integer.parseInt(this.tfCodigo.getText()));
        modelFormaPagamento.setDescricao(this.tfDescricao.getText());
        modelFormaPagamento.setDesconto(Float.parseFloat(this.tfDesconto.getText()));
        modelFormaPagamento.setQuantidadeParcelas(Integer.parseInt(this.tfQuantidadeParcelas.getText()));
        modelFormaPagamento.setObservacao(tfObservacao.getText());
        if (rbAtivo.isSelected()) {
            modelFormaPagamento.setSituacao(true);
        } else {
            modelFormaPagamento.setSituacao(false);
        }

        //salvar 
        if (controllerFormaPagamento.atualizarFormaPagamentoController(modelFormaPagamento)) {
            JOptionPane.showMessageDialog(this, "Registro gravado com sucesso!");
            this.limparCampos();
            this.carregarFormaPagamento();
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao gravar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private boolean salvarFormaPagamento() {
        modelFormaPagamento.setDescricao(this.tfDescricao.getText());
        try {
            modelFormaPagamento.setDesconto(Float.parseFloat(this.tfDesconto.getText()));
        } catch (Exception e) {
            modelFormaPagamento.setDesconto(0);
        }
        try {
            modelFormaPagamento.setQuantidadeParcelas(Integer.parseInt(this.tfQuantidadeParcelas.getText()));
        } catch (Exception e) {
            modelFormaPagamento.setQuantidadeParcelas(0);
        }
        modelFormaPagamento.setObservacao(tfObservacao.getText());
        if (rbAtivo.isSelected()) {
            modelFormaPagamento.setSituacao(true);
        } else {
            modelFormaPagamento.setSituacao(false);
        }

        //salvar 
        if (controllerFormaPagamento.salvarFormaPagamentoController(modelFormaPagamento) > 0) {
            JOptionPane.showMessageDialog(this, "Registro gravado com sucesso!");
            this.limparCampos();
            this.carregarFormaPagamento();
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao gravar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private void excluirFormapagamento() {
        int linha = tbFormaPagamento.getSelectedRow();
        String nome = (String) tbFormaPagamento.getValueAt(linha, 1);
        int codigo = (Integer) tbFormaPagamento.getValueAt(linha, 0);
        //pegunta se realmente deseja excluir
        int opcao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja"
                + " excluir o registro \nNome: "
                + nome + " ?", "Atenção", JOptionPane.YES_NO_OPTION);
        //se sim exclui, se não não faz nada    
        if (opcao == JOptionPane.OK_OPTION) {
            if (controllerFormaPagamento.excluirFormaPagamentoController(codigo)) {
                JOptionPane.showMessageDialog(this, "Registro excluido com suscesso!");
                carregarFormaPagamento();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao e os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private boolean retornarFormaPagamento() {
        //recebe a linha selecionada
        int linha = this.tbFormaPagamento.getSelectedRow();
        //pega o codigo do cliente na linha selecionada
        int codigo = (Integer) tbFormaPagamento.getValueAt(linha, 0);
        try {
            //recupera os dados do banco
            modelFormaPagamento = controllerFormaPagamento.getFormaPagamentoController(codigo);
            //seta os dados na interface
            this.tfCodigo.setText(String.valueOf(modelFormaPagamento.getCodigo()));
            this.tfDescricao.setText(modelFormaPagamento.getDescricao());
            this.tfDesconto.setText(String.valueOf(modelFormaPagamento.getDesconto()));
            this.tfQuantidadeParcelas.setText(String.valueOf(modelFormaPagamento.getQuantidadeParcelas()));
            this.tfObservacao.setText(modelFormaPagamento.getObservacao());
            if (modelFormaPagamento.isSituacao() == true) {
                rbAtivo.setSelected(true);
            } else {
                rbInativo.setSelected(true);
            }
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro selecionado", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

    private void limparCampos() {
        tfCodigo.setText("Novo");
        tfDescricao.setText("");
        tfDesconto.setText("");
        tfQuantidadeParcelas.setText("");
        tfObservacao.setText("");
        tipoCadastro = "novo";
    }

    private void carregarFormaPagamento() {
        listaFormaPagamentos = controllerFormaPagamento.getListaFormaPagamentoController();
        DefaultTableModel modelo = (DefaultTableModel) tbFormaPagamento.getModel();
        modelo.setNumRows(0);
        String situacao = "";
        //CARREGA OS DADOS DA LISTA NA TABELA
        int cont = listaFormaPagamentos.size();
        for (int i = 0; i < cont; i++) {
            if (listaFormaPagamentos.get(i).isSituacao() == false) {
                situacao = "Inativo";
            } else {
                situacao = "Ativo";
            }
            modelo.addRow(new Object[]{
                listaFormaPagamentos.get(i).getCodigo(),
                listaFormaPagamentos.get(i).getDescricao(),
                listaFormaPagamentos.get(i).getDesconto(),
                listaFormaPagamentos.get(i).getQuantidadeParcelas(),
                situacao
            });
        }
    }

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
            java.util.logging.Logger.getLogger(ViewFormaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFormaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFormaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFormaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewFormaPagamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rbAtivo;
    private javax.swing.JRadioButton rbInativo;
    private javax.swing.JTable tbFormaPagamento;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JFormattedTextField tfDesconto;
    private javax.swing.JTextField tfDescricao;
    private javax.swing.JTextArea tfObservacao;
    private javax.swing.JFormattedTextField tfQuantidadeParcelas;
    // End of variables declaration//GEN-END:variables
}
