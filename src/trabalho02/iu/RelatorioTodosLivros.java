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
public class RelatorioTodosLivros extends javax.swing.JFrame {
 Biblioteca b = Biblioteca.getInstance();

        ArrayList<Livro>livros = b.getLivros();
        ArrayList<Emprestimo>emprestimos = b.getEmprestimos();
        ArrayList<Item>itens;
    /**
     * Creates new form RelatorioTodosUsuarios
     */
    public RelatorioTodosLivros() {
        initComponents();
        
        

        for (Livro l: livros) {
            for (Emprestimo e : emprestimos) {
                itens = e.getItens();
                for (Item i : itens) {
                    if(i.getCodLivro().equals(l.getCodLivro())) {
                        if (e.possuiPendencia()) {
                            jTextArea1.append("Código do livro: " + l.getCodLivro()
                                    + "\nNome do livro: " + l.getNome()
                                    + "\nAno do livro: " + l.getAno()
                                    + "\nLivro emprestado: Sim"
                                    + "\nLivro com atraso: Sim"
                                    + "\n\n\n----------------------------------------------------"
                                    + "-------------------------------------------------"
                                    + "--------\n");
                        }
                        else {
                            jTextArea1.append("Código do livro: " + l.getCodLivro()
                                    + "\nNome do livro: " + l.getNome()
                                    + "\nAno do livro: " + l.getAno()
                                    + "\nLivro emprestado: Sim"
                                    + "\nLivro com atraso: Não"
                                    + "\n\n\n----------------------------------------------------"
                                    + "-------------------------------------------------"
                                    + "--------\n");
                        }
                    }
                    else {
                        jTextArea1.append("Código do livro: " + l.getCodLivro()
                                + "\nNome do livro: " + l.getNome()
                                + "\nAno do livro: " + l.getAno()
                                + "\nLivro emprestado: Não"
                                + "\nLivro com atraso: Não"
                                + "\n\n\n----------------------------------------------------"
                                + "-------------------------------------------------"
                                + "--------\n");
                    }
                }
            }
            if (emprestimos.isEmpty()) {
                jTextArea1.append("Código do livro: " + l.getCodLivro()
                        + "\nNome do livro: " + l.getNome()
                        + "\nAno do livro: " + l.getAno()
                        + "\nLivro emprestado: Não"
                        + "\nLivro com atraso: Não"
                        + "\n\n\n----------------------------------------------------"
                        + "-------------------------------------------------"
                        + "--------\n");
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(RelatorioTodosLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioTodosLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioTodosLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioTodosLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new RelatorioTodosLivros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
