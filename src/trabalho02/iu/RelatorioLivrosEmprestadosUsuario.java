/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho02.iu;

import java.util.ArrayList;
import trabalho02.modelo.Biblioteca;
import trabalho02.modelo.Livro;
import trabalho02.modelo.Emprestimo;
import trabalho02.modelo.Item;
/**
 *
 * @author Erick Yoshike and now Luskas
 */
public class RelatorioLivrosEmprestadosUsuario extends javax.swing.JFrame {
    Biblioteca b = Biblioteca.getInstance();
    Emprestimo e = Emprestimo.getInstance();

        ArrayList<Emprestimo>emprestimos = b.getEmprestimos();
        ArrayList<Item>itens;
        ArrayList<Livro>livros = b.getLivros();
    /**
     * Creates new form RelatorioTodosUsuarios
     */
    public RelatorioLivrosEmprestadosUsuario() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        txtCodUser = new javax.swing.JTextField();
        txtNomeUser = new javax.swing.JTextField();
        LocalizarU = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        txtCodUser.setEditable(false);
        txtCodUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodUserActionPerformed(evt);
            }
        });

        txtNomeUser.setEditable(false);
        txtNomeUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeUserActionPerformed(evt);
            }
        });

        LocalizarU.setText("Localizar");
        LocalizarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocalizarUActionPerformed(evt);
            }
        });

        jLabel1.setText("Código usuário");

        jLabel2.setText("Nome do usuário");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodUser, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtNomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(LocalizarU)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(LocalizarU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodUserActionPerformed

    private void txtNomeUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeUserActionPerformed

    private void LocalizarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocalizarUActionPerformed
        LocalizaLivrosEmprestadosUsuario lu = new LocalizaLivrosEmprestadosUsuario(null, true);
        lu.setTitle("Localizar Livro emprestado para um usuario");
        lu.setVisible(true);
        String cod = lu.getCodUsuario();
        String nome = lu.getNome();
        if (cod != null) {
            txtCodUser.setText(cod);
            txtNomeUser.setText(nome);
        }
        lu.dispose();
        String codlivro[] = new String[20];
        for (Emprestimo e1 : emprestimos) {
            if (e1.getCodUsuario().equals(cod)) {
                itens = e1.getItens();
                int j=0;
                for (Item i : itens) {
                    codlivro[j] = i.getCodLivro();
                    j++;
                }
            }
        }
        if (codlivro.length != 0) {
            for (int k = 0; k < livros.size(); k++) {
                for (Livro l : livros) {
                    if (codlivro[k].equals(l.getCodLivro())) {
                        jTextArea1.append("Código do livro: " + l.getCodLivro()
                                + "\nNome do livro: " + l.getNome()
                                + "\nAno do livro: " + l.getAno()
                                + "\n\n\n----------------------------------------------------"
                                + "-------------------------------------------------"
                                + "--------\n");
                    }
                }
            }
        }
        
    }//GEN-LAST:event_LocalizarUActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioLivrosEmprestadosUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LocalizarU;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtCodUser;
    private javax.swing.JTextField txtNomeUser;
    // End of variables declaration//GEN-END:variables
}