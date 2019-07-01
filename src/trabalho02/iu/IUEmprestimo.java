/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho02.iu;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import trabalho02.modelo.Biblioteca;
import trabalho02.modelo.Emprestimo;
import trabalho02.modelo.Item;
import trabalho02.modelo.Livro;
import trabalho02.modelo.Usuario;

/**
 *
 * @author luskas
 */
public class IUEmprestimo extends javax.swing.JFrame {
    Biblioteca b = Biblioteca.getInstance();
    private DefaultTableModel modelo;

    /**
     * Creates new form Emprestimo
     */
    public IUEmprestimo() {
        initComponents();
        DefaultTableModel model = (DefaultTableModel)tabelaEmprestimo.getModel();
        ArrayList<Emprestimo>emprestimos = b.getEmprestimos();
        int i=0;
        for (Emprestimo e: emprestimos) {
            Object[] linha = new Object[3];
            linha[0] = e.getCodEmprestimo();
            linha[1] = e.getCodUsuario();
            linha[2] = e.getItens().get(i).getCodEmprestimo();
            modelo.addRow(linha);
            
        }
        txtData.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date(System.currentTimeMillis())));
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtCodigoLivro = new javax.swing.JTextField();
        btnAdiciona = new javax.swing.JButton();
        btnLimparL = new javax.swing.JButton();
        btnLocalizaL = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtCodEmp = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNomeUser = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        LocalizarU = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEmprestimo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Item"));

        jLabel5.setText("Código Livro");

        jLabel6.setText("Título");

        txtTitulo.setEditable(false);
        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });

        txtCodigoLivro.setEditable(false);
        txtCodigoLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoLivroActionPerformed(evt);
            }
        });

        btnAdiciona.setText("Adicionar");
        btnAdiciona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionaActionPerformed(evt);
            }
        });

        btnLimparL.setText("Limpar");
        btnLimparL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparLActionPerformed(evt);
            }
        });

        btnLocalizaL.setText("Localizar");
        btnLocalizaL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizaLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLimparL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLocalizaL)
                        .addGap(77, 77, 77)
                        .addComponent(btnAdiciona)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdiciona)
                    .addComponent(btnLimparL)
                    .addComponent(btnLocalizaL)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cabeçalho"));

        txtCodEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodEmpActionPerformed(evt);
            }
        });

        jLabel1.setText("Código Empréstimo");

        jLabel2.setText("Código Usuário");

        txtCodUser.setEditable(false);
        txtCodUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodUserActionPerformed(evt);
            }
        });

        jLabel3.setText("Data");

        txtData.setEditable(false);
        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });

        jLabel4.setText("Nome");

        txtNomeUser.setEditable(false);
        txtNomeUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeUserActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        LocalizarU.setText("Localizar");
        LocalizarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocalizarUActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(134, 134, 134))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtCodUser, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNomeUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LocalizarU)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(LocalizarU))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabelaEmprestimo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod Empréstimo", "Cod Usuário", "Cod Livro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaEmprestimo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodEmpActionPerformed

    private void txtCodUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodUserActionPerformed

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed

    private void txtNomeUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeUserActionPerformed

    private void txtCodigoLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoLivroActionPerformed

    private void LocalizarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocalizarUActionPerformed
        LocalizaUsuario lu = new LocalizaUsuario(null, true);
        lu.setTitle("Localizar Usuário");
        lu.setVisible(true);
        String cod = lu.getCodUsuario();
        String nome = lu.getNome();
        if (cod != null) {
            txtCodUser.setText(cod);
            txtNomeUser.setText(nome);
        }
        lu.dispose();
    }//GEN-LAST:event_LocalizarUActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtNomeUser.setText("");
        txtCodUser.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnLocalizaLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizaLActionPerformed
        LocalizaLivro ll = new LocalizaLivro(null, true);
        ll.setTitle("Localizar Livro");
        ll.setVisible(true);
        String cod = ll.getCodLivro();
        String titulo = ll.getTitulo();
        if (cod != null) {
            txtCodigoLivro.setText(cod);
            txtTitulo.setText(titulo);
        }
        ll.dispose();
    }//GEN-LAST:event_btnLocalizaLActionPerformed

    private void btnAdicionaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionaActionPerformed
        if (txtCodEmp.getText() == null || txtCodEmp.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite o código do empréstimo antes de adicionar!!");
            txtCodEmp.requestFocus();
        } else if (txtCodUser.getText() == null || txtCodUser.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Localize o usuário antes de adicionar!!");
        } else if (txtCodigoLivro.getText() == null || txtCodigoLivro.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Localize o livro antes de adicionar!!");
        } else {
            ArrayList<Livro>livros=b.getLivros();
            for (Livro l : livros) {
                if (l.getCodLivro().equals(txtCodigoLivro.getText())) {
                    if (l.estaEmprestado()) {
                        JOptionPane.showMessageDialog
                        (null, "Não foi possível realizar o empréstimo pois esse "
                                + "livro ja está emprestado");
                    }
                    else {
                        Item novoItem = new Item(txtCodEmp.getText(), 
                                txtCodigoLivro.getText());
                        ArrayList<Usuario> users = b.getUsuarios();
                        Emprestimo emprestimo;
                        for (Usuario u : users) {
                            if (u.getCodUsuario().equals(txtCodUser.getText())) {
                                emprestimo = new Emprestimo(txtCodEmp.getText(), u);
                                emprestimo.addItem(novoItem);
                            }
                        }
                        l.emprestar();

                        DefaultTableModel model;
                        model = (DefaultTableModel) tabelaEmprestimo.getModel();
                        Object[] linha = new Object[3];
                        linha[0] = txtCodEmp.getText();
                        linha[1] = txtCodUser.getText();
                        linha[2] = txtCodigoLivro.getText();
                        model.addRow(linha);
                    }
                }
            }
            
            
        }
    }//GEN-LAST:event_btnAdicionaActionPerformed

    private void btnLimparLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparLActionPerformed
        txtCodigoLivro.setText("");
        txtTitulo.setText("");
    }//GEN-LAST:event_btnLimparLActionPerformed

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
            java.util.logging.Logger.getLogger(IUEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IUEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IUEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IUEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUEmprestimo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LocalizarU;
    private javax.swing.JButton btnAdiciona;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnLimparL;
    private javax.swing.JButton btnLocalizaL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaEmprestimo;
    private javax.swing.JTextField txtCodEmp;
    private javax.swing.JTextField txtCodUser;
    private javax.swing.JTextField txtCodigoLivro;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtNomeUser;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}