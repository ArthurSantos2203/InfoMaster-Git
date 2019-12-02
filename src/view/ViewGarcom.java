/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerCidade;
import controller.ControllerEstado;
import controller.ControllerGarcom;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelCidade;
import model.ModelEstado;
import model.ModelGarcom;
import util.BLMascaras;

/**
 *
 * @author Leandro
 */
public class ViewGarcom extends javax.swing.JFrame {

    ModelEstado modelEstado = new ModelEstado();
    ControllerEstado controllerEstados = new ControllerEstado();
    ArrayList<ModelEstado> listaModelEstados = new ArrayList<>();
    ModelGarcom modelGarcom = new ModelGarcom();
    ModelCidade modelCidade = new ModelCidade();
    ControllerCidade controllerCidade = new ControllerCidade();
    ArrayList<ModelCidade> listaModelCidades = new ArrayList<>();
    ControllerGarcom controllerGarcom = new ControllerGarcom();
    ArrayList<ModelGarcom> listaModelGarcoms = new ArrayList<>();
    String tipoCadastro = "novo";
    BLMascaras bLMascaras = new BLMascaras();

    /**
     * Creates new form ViewGarcom
     */
    public ViewGarcom() {
        initComponents();
        setLocationRelativeTo(null);
        carregarGarcom();
        novoGarcom();
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
        jtfCodigoGarcom = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtfNomeGarcom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfEndereco = new javax.swing.JTextField();
        jcbCidade = new javax.swing.JComboBox();
        jcbUf = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtfSenha1 = new javax.swing.JPasswordField();
        jtfSenha2 = new javax.swing.JPasswordField();
        jtfComissao = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtGarcom = new javax.swing.JTable();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        jtfTelefone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtfCep = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Garçom");
        setIconImage(new ImageIcon(getClass().getResource("/imagens/blicon.png")).getImage());

        jtfCodigoGarcom.setEditable(false);

        jLabel1.setText("Código:");

        jtfNomeGarcom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfNomeGarcomFocusLost(evt);
            }
        });

        jLabel2.setText("Nome:");

        jLabel3.setText("Endereço:");

        jLabel4.setText("Cidade:");

        jcbUf.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jcbUfPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel5.setText("UF:");

        jLabel6.setText("CEP:");

        jLabel7.setText("Senha:");

        jLabel8.setText("Repita Senha:");

        jLabel9.setText("Comissão:");

        jtGarcom.setAutoCreateRowSorter(true);
        jtGarcom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Telefone", "Comissão"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtGarcom.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jtGarcom.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jtGarcom);
        if (jtGarcom.getColumnModel().getColumnCount() > 0) {
            jtGarcom.getColumnModel().getColumn(1).setMinWidth(280);
            jtGarcom.getColumnModel().getColumn(1).setPreferredWidth(280);
            jtGarcom.getColumnModel().getColumn(2).setMinWidth(150);
            jtGarcom.getColumnModel().getColumn(2).setPreferredWidth(150);
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

        jLabel10.setText("Telefone:");

        try {
            jtfCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfCodigoGarcom, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jtfNomeGarcom)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jcbUf, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jtfCep, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfComissao, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfSenha2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCodigoGarcom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNomeGarcom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfComissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar)
                    .addComponent(btSalvar)
                    .addComponent(btAlterar)
                    .addComponent(btExcluir))
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

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        int linhaSelecionada = jtGarcom.getSelectedRow();
        // Verificamos se existe realmente alguma linha selecionada
        if (linhaSelecionada < 0) {
            JOptionPane.showMessageDialog(this, "Você deve selecionar um item na tabela antes de clicar no botão!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
        } else {
            limparCampos();
            tipoCadastro = "alteracao";
            retornarGarcom();
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int linhaSelecionada = jtGarcom.getSelectedRow();
        // Verificamos se existe realmente alguma linha selecionada
        if (linhaSelecionada < 0) {
            JOptionPane.showMessageDialog(this, "Você deve selecionar um item na tabela antes de clicar no botão!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
        } else {
            this.excluir();
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // TODO add your handling code here:
        novoGarcom();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        String senha, confirmaSenha;
        senha = new String(this.jtfSenha1.getPassword());
        confirmaSenha = new String(this.jtfSenha2.getPassword());

        if (!senha.equals(confirmaSenha)) {
            JOptionPane.showMessageDialog(rootPane, "Senhas não conferem!!", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (tipoCadastro.equals("novo")) {
            salvar();
        } else if (tipoCadastro.equals("alteracao")) {
            alterar();
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void jcbUfPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbUfPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        if (this.jcbUf.isPopupVisible()) {
            listarCidades();
        }
    }//GEN-LAST:event_jcbUfPopupMenuWillBecomeInvisible

    private void jtfNomeGarcomFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfNomeGarcomFocusLost
        // converte em maiusculo o que o usuario digitar
        this.jtfNomeGarcom.setText(jtfNomeGarcom.getText().toUpperCase());
        //tira acentos
        this.jtfNomeGarcom.setText(bLMascaras.TiraAcentos(jtfNomeGarcom.getText()));
    }//GEN-LAST:event_jtfNomeGarcomFocusLost

    private boolean retornarGarcom() {
        //recebe a linha selecionada
        int linha = this.jtGarcom.getSelectedRow();
        //pega o codigo do cliente na linha selecionada
        int codigo = (Integer) jtGarcom.getValueAt(linha, 0);

        try {
            //recupera os dados do banco
            modelGarcom = controllerGarcom.getGarcomController(codigo);
            //seta os dados na interface
            this.jtfCodigoGarcom.setText(String.valueOf(modelGarcom.getCodigo()));
            this.jtfNomeGarcom.setText(modelGarcom.getNome());
            this.jtfEndereco.setText(modelGarcom.getEndereco());
            this.jcbUf.setSelectedItem(controllerEstados.getEstadoController(modelGarcom.getCodEstado()).getUf());
            listarCidades();
            this.jcbCidade.setSelectedItem(controllerCidade.getCidadeController(modelGarcom.getCodCidade()).getNome());
            this.jtfCep.setText(modelGarcom.getCep());
            this.jtfComissao.setText(modelGarcom.getComissao() + "");
            this.jtfTelefone.setText(modelGarcom.getTelefone());
            this.jtfSenha1.setText(modelGarcom.getSenha());
            this.jtfSenha2.setText(modelGarcom.getSenha());
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro selecionado", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

    //excluir dados da tabela banco
    private void excluir() {
        int linha = jtGarcom.getSelectedRow();
        String nome = (String) jtGarcom.getValueAt(linha, 1);
        int codigo = (Integer) jtGarcom.getValueAt(linha, 0);
        //pegunta se realmente deseja excluir
        int opcao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja"
                + " excluir o registro \nNome: "
                + nome + " ?", "Atenção", JOptionPane.YES_NO_OPTION);
        //se sim exclui, se não não faz nada    
        if (opcao == JOptionPane.OK_OPTION) {
            if (controllerGarcom.excluirGarcomController(codigo)) {
                JOptionPane.showMessageDialog(this, "Registro excluido com suscesso!");
                carregarGarcom();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao e os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void limparCampos() {
        jtfNomeGarcom.setText("");
        jtfCep.setText("");
        jtfComissao.setText("");
        jtfEndereco.setText("");
        jtfTelefone.setText("");
        jtfSenha1.setText("");
        jtfSenha2.setText("");
    }

    private void novoGarcom() {
        limparCampos();
        jtfCodigoGarcom.setText("Novo");
        listarEstados();
        listarCidades();
        tipoCadastro = "novo";
    }

    /**
     * Preencher combobox cidades
     */
    private void listarCidades() {
        listaModelCidades = controllerCidade.getListaCidadePorEstadoController(controllerEstados.getEstadoUFController(this.jcbUf.getSelectedItem().toString()).getCodigo());
        jcbCidade.removeAllItems();
        for (int i = 0; i < listaModelCidades.size(); i++) {
            jcbCidade.addItem(listaModelCidades.get(i).getNome());
        }
    }

    //Salvar dados
    private boolean salvar() {
        modelGarcom = new ModelGarcom();
        modelGarcom.setNome(jtfNomeGarcom.getText());
        modelGarcom.setEndereco(jtfEndereco.getText());
        modelGarcom.setCodEstado(controllerEstados.getEstadoUFController(this.jcbUf.getSelectedItem().toString()).getCodigo());
        modelGarcom.setCodCidade(controllerCidade.getCidadeController(this.jcbCidade.getSelectedItem().toString()).getCodigo());
        modelGarcom.setCep(jtfCep.getText());
        modelGarcom.setComissao(Float.parseFloat(jtfComissao.getText()));
        modelGarcom.setTelefone(jtfTelefone.getText());
        modelGarcom.setSenha(new String(this.jtfSenha1.getPassword()));
        //salvar 
        if (controllerGarcom.salvarGarcomController(modelGarcom) > 0) {
            JOptionPane.showMessageDialog(this, "Registro gravado com sucesso!");
            this.novoGarcom();
            this.carregarGarcom();
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao gravar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    //alterar dados
    private boolean alterar() {
        modelGarcom = new ModelGarcom();
        modelGarcom.setCodigo(Integer.parseInt(jtfCodigoGarcom.getText()));
        modelGarcom.setNome(jtfNomeGarcom.getText());
        modelGarcom.setEndereco(jtfEndereco.getText());
        modelGarcom.setCodEstado(controllerEstados.getEstadoUFController(this.jcbUf.getSelectedItem().toString()).getCodigo());
        modelGarcom.setCodCidade(controllerCidade.getCidadeController(this.jcbCidade.getSelectedItem().toString()).getCodigo());
        modelGarcom.setCep(jtfCep.getText());
        modelGarcom.setComissao(Float.parseFloat(jtfComissao.getText()));
        modelGarcom.setTelefone(jtfTelefone.getText());
        modelGarcom.setSenha(new String(this.jtfSenha1.getPassword()));
        //salvar 
        if (controllerGarcom.atualizarGarcomController(modelGarcom)) {
            JOptionPane.showMessageDialog(this, "Registro alterado com sucesso!");
            novoGarcom();
            this.carregarGarcom();
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao alterar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    //carregar lista de garço na tabvela
    private void carregarGarcom() {
        listaModelGarcoms = controllerGarcom.getListaGarcomController();
        DefaultTableModel modelo = (DefaultTableModel) jtGarcom.getModel();
        modelo.setNumRows(0);
        //CARREGA OS DADOS DA LISTA NA TABELA
        int cont = listaModelGarcoms.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelGarcoms.get(i).getCodigo(),
                listaModelGarcoms.get(i).getNome(),
                listaModelGarcoms.get(i).getTelefone(),
                listaModelGarcoms.get(i).getComissao()
            });
        }
    }

    //carregar estado no combobox
    private void listarEstados() {
        listaModelEstados = controllerEstados.getListaEstadoController();
        jcbUf.removeAllItems();
        for (int i = 0; i < listaModelEstados.size(); i++) {
            jcbUf.addItem(listaModelEstados.get(i).getUf());
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
            java.util.logging.Logger.getLogger(ViewGarcom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewGarcom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewGarcom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewGarcom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewGarcom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox jcbCidade;
    private javax.swing.JComboBox jcbUf;
    private javax.swing.JTable jtGarcom;
    private javax.swing.JFormattedTextField jtfCep;
    private javax.swing.JTextField jtfCodigoGarcom;
    private javax.swing.JTextField jtfComissao;
    private javax.swing.JTextField jtfEndereco;
    private javax.swing.JTextField jtfNomeGarcom;
    private javax.swing.JPasswordField jtfSenha1;
    private javax.swing.JPasswordField jtfSenha2;
    private javax.swing.JTextField jtfTelefone;
    // End of variables declaration//GEN-END:variables
}
