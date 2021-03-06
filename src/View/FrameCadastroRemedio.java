/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import Control.Impl.Exception.DAOException;
import Control.Impl.ImplRemedioDAO;
import Model.Remedio;
import Util.ComponentValidator;
import Util.Mensagens;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Eduardo
 */
public class FrameCadastroRemedio extends javax.swing.JFrame {
    
    private Remedio remedio;
    
    /**
     * Creates new form FrameCadastroRemedio
     */
    public FrameCadastroRemedio() {
        initComponents();
    }
    
    private void limparCadastro() {
        campoNome.setText("");
        campoQntEstoque.setText("");
        campoUnidadeMedida.setText("");
    }
    
    private void limparEdicao() {
        campoNomeEdicao.setText("");
        campoQntEstoqueEdicao.setText("");
        campoUnidadeMedidaEdicao.setText("");
        comboBoxRemedio.setSelectedIndex(0);
        habilitado(false);
    }
    
    private void habilitado(boolean flag) {
        campoNomeEdicao.setEnabled(flag);
        campoQntEstoqueEdicao.setEnabled(flag);
        campoUnidadeMedidaEdicao.setEnabled(flag);
        botaoSalvar.setEnabled(flag);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoQntEstoque = new javax.swing.JFormattedTextField();
        botaoCadastrar = new javax.swing.JButton();
        campoNome = new javax.swing.JTextField();
        campoUnidadeMedida = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        campoUnidadeMedidaEdicao = new javax.swing.JTextField();
        campoQntEstoqueEdicao = new javax.swing.JFormattedTextField();
        campoNomeEdicao = new javax.swing.JTextField();
        botaoSalvar = new javax.swing.JButton();
        comboBoxRemedio = new javax.swing.JComboBox();
        botaoConsultar = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CadastroRemedio");
        setResizable(false);

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jLabel2.setText("Quantidade em estoque:");

        jLabel1.setText("Nome:");

        jLabel3.setText("Unidade de medida:");

        campoQntEstoque.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoCadastrar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoNome)
                            .addComponent(campoQntEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(campoUnidadeMedida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoQntEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoUnidadeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(botaoCadastrar)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cadastro", jPanel1);

        jLabel8.setText("Nome:");

        jLabel9.setText("Quantidade em estoque:");

        jLabel10.setText("Unidade de medida:");

        campoUnidadeMedidaEdicao.setEnabled(false);

        campoQntEstoqueEdicao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        campoQntEstoqueEdicao.setEnabled(false);

        campoNomeEdicao.setEnabled(false);

        botaoSalvar.setText("Salvar alterações");
        botaoSalvar.setEnabled(false);
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        comboBoxRemedio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione remédio" }));

        botaoConsultar.setText("Consultar");
        botaoConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(comboBoxRemedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoConsultar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoSalvar))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoQntEstoqueEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoNomeEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoUnidadeMedidaEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxRemedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoConsultar))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(campoNomeEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(campoQntEstoqueEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(campoUnidadeMedidaEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(botaoSalvar)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Consulta", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        Remedio r = new Remedio();
        if(!campoNome.getText().equals("")) {
            r.setNomeRemedio(campoNome.getText());
        }
        else {
            Mensagens.campoInvalido(this, "Campo Nome");
            return;
        }
        if(ComponentValidator.integerNotNegativeAndNotZero(campoQntEstoque)) {
            r.setQtdEstoque(Integer.parseInt(campoQntEstoque.getText()));
        }
        else {
            Mensagens.campoInvalido(this, "Campo Quantidade em Estoque");
            return;
        }
        if(!campoUnidadeMedida.getText().equals("")) {
            r.setUnidadeMedida(campoUnidadeMedida.getText());
        }
        else {
            Mensagens.campoInvalido(this, "Campo Unidade de Medida");
            return;
        }
        try {
            r.setCodigo(ImplRemedioDAO.getInstance().encontrarCodMax());
            ImplRemedioDAO.getInstance().inserir(r);
            limparCadastro();
            Mensagens.cadastradoComSucesso(this);
        } catch(SQLException | DAOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        if(!campoNomeEdicao.getText().equals("")) {
            remedio.setNomeRemedio(campoNomeEdicao.getText());
        }
        else {
            Mensagens.campoInvalido(this, "Campo Nome");
            return;
        }
        if(ComponentValidator.integerNotNegativeAndNotZero(campoQntEstoqueEdicao)) {
            remedio.setQtdEstoque(Integer.parseInt(campoQntEstoqueEdicao.getText()));
        }
        else {
            Mensagens.campoInvalido(this, "Campo Quantidade em Estoque");
            return;
        }
        if(!campoUnidadeMedidaEdicao.getText().equals("")) {
            remedio.setUnidadeMedida(campoUnidadeMedidaEdicao.getText());
        }
        else {
            Mensagens.campoInvalido(this, "Campo Unidade de Medida");
            return;
        }
        try {
            ImplRemedioDAO.getInstance().atualizar(remedio);
            limparCadastro();
            Mensagens.cadastradoComSucesso(this);
            habilitado(false);
        } catch(SQLException | DAOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        if(jTabbedPane1.getSelectedIndex() == 1) {
            try {
                comboBoxRemedio.removeAllItems();
                comboBoxRemedio.addItem("Selecione remédio");
                List<Remedio> lista = ImplRemedioDAO.getInstance().encontrarTodos();
                if(lista != null) {
                    for (Iterator<Remedio> it = lista.iterator(); it.hasNext();) {
                        Remedio r = it.next();
                        comboBoxRemedio.addItem(r);
                    }
                }
            } catch(SQLException | DAOException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void botaoConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultarActionPerformed
        if(comboBoxRemedio.getSelectedIndex() != 0) {
            remedio = (Remedio)comboBoxRemedio.getSelectedItem();
            campoNomeEdicao.setText(remedio.getNomeRemedio());
            campoQntEstoqueEdicao.setText(remedio.getQtdEstoque() + "");
            campoUnidadeMedidaEdicao.setText(remedio.getUnidadeMedida());
            habilitado(true);
        }
    }//GEN-LAST:event_botaoConsultarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoConsultar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoNomeEdicao;
    private javax.swing.JFormattedTextField campoQntEstoque;
    private javax.swing.JFormattedTextField campoQntEstoqueEdicao;
    private javax.swing.JTextField campoUnidadeMedida;
    private javax.swing.JTextField campoUnidadeMedidaEdicao;
    private javax.swing.JComboBox comboBoxRemedio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
