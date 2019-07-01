/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho02.iu;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import trabalho02.modelo.Biblioteca;
import trabalho02.modelo.Emprestimo;
import trabalho02.modelo.Item;
import trabalho02.modelo.Livro;

/**
 *
 * @author luskas
 */
public class IUDevolver extends javax.swing.JFrame {
    Biblioteca b = Biblioteca.getInstance();
    Emprestimo e = Emprestimo.getInstance();
    private DefaultTableModel modelo;
    private String codLivro;
    private static final DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    /**
     * Creates new form IUDevolver
     */
    public IUDevolver() {
        initComponents();
        modelo = (DefaultTableModel) tabelaEmprestimo.getModel();
        ArrayList<Emprestimo>emprestimos = b.getEmprestimos();
        for (Emprestimo e1: emprestimos) {
            for(int i=0; i<e1.getItens().size(); i++) { 
            Object[] linha = new Object[4];
            linha[0] = e1.getItens().get(i).getCodEmprestimo();
            linha[1] = e1.getItens().get(i).getCodLivro();
            linha[2] = e1.getCodUsuario();
            linha[3] = sdf.format(e1.getDataDevolucao().getTime());
            modelo.addRow(linha);
           }
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

        btnDevolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEmprestimo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnDevolver.setText("Devolver");
        btnDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolverActionPerformed(evt);
            }
        });

        tabelaEmprestimo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod Empréstimo", "Cod Livro", "Cod Usuario", "Data devolução"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(tabelaEmprestimo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(btnDevolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDevolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolverActionPerformed
        if (tabelaEmprestimo.getSelectedRowCount() > 0) {
            int index = tabelaEmprestimo.getSelectedRow();
            this.codLivro = (String)tabelaEmprestimo.getModel().getValueAt(index, 1);
            ArrayList<Livro> livros = b.getLivros();
            for (Livro l : livros) {
                if (l.getCodLivro().equals(codLivro)) {
                    l.devolver();
                }
            }
            ArrayList<Emprestimo>emprestimos = b.getEmprestimos();
            for(Emprestimo e1 : emprestimos) {
                ArrayList<Item> itens = e1.getItens();
                for (int i=0; i<itens.size(); i++) {
                    if (itens.get(i).getCodLivro().equals(codLivro)) {
                        modelo.removeRow(index);
                        itens.remove(i);
                    }
                }

            }
            
            
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnDevolverActionPerformed

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
            java.util.logging.Logger.getLogger(IUDevolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IUDevolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IUDevolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IUDevolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUDevolver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDevolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaEmprestimo;
    // End of variables declaration//GEN-END:variables
}