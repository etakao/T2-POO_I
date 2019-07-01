/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * IUPrincipal.java
 *
 * Created on 24/05/2013, 23:19:53
 */
package trabalho02.iu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import trabalho02.controlador.Controlador;
import trabalho02.modelo.Biblioteca;
import trabalho02.modelo.Usuario;
import trabalho02.dados.Database;
import trabalho02.modelo.Professor;
import trabalho02.modelo.Emprestimo;
import trabalho02.modelo.Livro;
import trabalho02.modelo.Config;
/**
 *
 * @author Danilo Medeiros Eler
 */
public class IUPrincipal extends javax.swing.JFrame {
    Biblioteca b = Biblioteca.getInstance();
    ArrayList<Usuario>usuarios = b.getUsuarios();
    ArrayList<Livro> livros = b.getLivros();
    ArrayList<Emprestimo> emprestimos = b.getEmprestimos();
    boolean carregado = false;

    /** Creates new form IUPrincipal */
    public IUPrincipal() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel(new ImageIcon("trabalho02\\imgs\\library.jpg"));
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem16 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho02/imgs/library.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jMenu1.setText("Cadastros");

        jMenu3.setText("Usuários");

        jMenuItem1.setText("Aluno");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Professor");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenu1.add(jMenu3);

        jMenuItem3.setText("Livros");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Movimentação");

        jMenuItem4.setText("Empréstimo");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Devolução");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Relatórios");

        jMenuItem6.setText("Todos Usuários");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuItem7.setText("Todos Alunos");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem8.setText("Todos Professores");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuItem17.setText("Todos Livros já Emprestados para um Usuário");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem17);

        jMenuItem18.setText("Livros não Devolvidos por um Usuário");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem18);
        jMenu4.add(jSeparator1);

        jMenuItem9.setText("Todos os Livros");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuItem10.setText("Livros Disponíveis");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuItem11.setText("Livros Emprestados");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);
        jMenu4.add(jSeparator2);

        jMenuItem12.setText("Livros com Atraso");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem12);

        jMenuItem13.setText("Usuários com Atraso");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem13);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Outros");

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem14.setText("Salvar Dados");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem14);

        jMenuItem15.setText("Carregar Dados");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem15);
        jMenu5.add(jSeparator3);

        jMenuItem16.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem16.setText("Configurações");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem16);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 941, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // TODO add your handling code here:
        Controlador control = new Controlador();
        IUConfig iuConfig = IUConfig.getInstancia(this);
        iuConfig.exibir(control.getConfiguracoes());

        //alternativamente, podemos chamar assim:
        //IUConfig.getInstancia(this).exibir(biblioteca.getConfiguracoes());
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        try {
            if(!usuarios.isEmpty()) {
                FileOutputStream usuario = new FileOutputStream(Config.getArquivoUsuarios());
                ObjectOutputStream ousuario = new ObjectOutputStream(usuario);
                for(Usuario u : usuarios){
                    ousuario.writeObject(u);
                }
                ousuario.flush();
                ousuario.close();
                usuario.flush();
                usuario.close();
            }
        }
        catch(IOException e) {
        }
        try {
            if(!livros.isEmpty()) {
                FileOutputStream livro = new FileOutputStream(Config.getArquivoLivros());
                ObjectOutputStream olivro = new ObjectOutputStream(livro);
                for(Livro l : livros){
                    olivro.writeObject(l);
                }
                olivro.flush();
                olivro.close();
                livro.flush();
                livro.close();
            }
        }
        catch(IOException e) {
        }
        try {
            if(!emprestimos.isEmpty()) {
                FileOutputStream emprestimo = new FileOutputStream(Config.getArquivoEmprestimos());
                ObjectOutputStream oemprestimo = new ObjectOutputStream(emprestimo);
                for(Emprestimo e : emprestimos){
                    oemprestimo.writeObject(e);
                }
                oemprestimo.flush();
                oemprestimo.close();
                emprestimo.flush();
                emprestimo.close();
            }
           
        }
        
        catch(IOException e) {
            
        }
        JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!!");
        carregado = true;
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed

        if (carregado) {
            JOptionPane.showMessageDialog(null, "Você já carregou os dados!!");
        } else {
            try {
                FileInputStream usuario = new FileInputStream(Config.getArquivoUsuarios());
                ObjectInputStream ousuario = new ObjectInputStream(usuario);
                Usuario u = (Usuario)ousuario.readObject();
                usuarios.add(u);
                ousuario.close();
                usuario.close();
            }
            catch (ClassNotFoundException | IOException e) {
            }
            try {
                FileInputStream livro = new FileInputStream(Config.getArquivoLivros());
                ObjectInputStream olivro = new ObjectInputStream(livro);
                Livro l = (Livro) olivro.readObject();
                livros.add(l);
                olivro.close();
                livro.close();
            }
            catch (ClassNotFoundException | IOException e) {
            }
            try {
                FileInputStream emprestimo = new FileInputStream(Config.getArquivoEmprestimos());
                ObjectInputStream oemprestimo = new ObjectInputStream(emprestimo);
                Emprestimo e = (Emprestimo) oemprestimo.readObject();
                emprestimos.add(e);
                oemprestimo.close();
                emprestimo.close();
                
            } catch (ClassNotFoundException | IOException e) {

            }
            carregado = true;
            JOptionPane.showMessageDialog(null, "Dados carregados com sucesso!!");
        }
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        RelatorioTodosLivros livros = new RelatorioTodosLivros();
        livros.setTitle("Relatório de todos os livros");
        livros.setVisible(true);
        livros.setDefaultCloseOperation(RelatorioTodosLivros.DISPOSE_ON_CLOSE);
        livros.setResizable(false);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CadastroAlunos alunos = new CadastroAlunos();
        alunos.setTitle("Cadastro de alunos");
        alunos.setVisible(true);
        alunos.setDefaultCloseOperation(CadastroAlunos.DISPOSE_ON_CLOSE);
        alunos.setResizable(false);
        //eu estou testando
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        CadastroProfessor professores = new CadastroProfessor();
        professores.setTitle("Cadastro de professores");
        professores.setVisible(true);
        professores.setDefaultCloseOperation(CadastroProfessor.DISPOSE_ON_CLOSE);
        professores.setResizable(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        CadastroLivros livros = new CadastroLivros();
        livros.setTitle("Cadastro de livros");
        livros.setVisible(true);
        livros.setDefaultCloseOperation(CadastroLivros.DISPOSE_ON_CLOSE);
        livros.setResizable(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed
                                       
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        IUDevolver devolver = new IUDevolver();
        devolver.setTitle("Devolução");
        devolver.setVisible(true);
        devolver.setDefaultCloseOperation(IUEmprestimo.DISPOSE_ON_CLOSE);
        devolver.setResizable(false);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        RelatorioTodosProfessores professor = new RelatorioTodosProfessores();
        professor.setTitle("Relatorio de todos os professores");
        professor.setVisible(true);
        professor.setDefaultCloseOperation(RelatorioTodosProfessores.DISPOSE_ON_CLOSE);
        professor.setResizable(false);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        RelatorioTodosUsuarios usuarios = new RelatorioTodosUsuarios();
        usuarios.setTitle("Relatório de todos os usuarios");
        usuarios.setVisible(true);
        usuarios.setDefaultCloseOperation(RelatorioTodosUsuarios.DISPOSE_ON_CLOSE);
        usuarios.setResizable(false);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        RelatorioLivrosDisponiveis livros = new RelatorioLivrosDisponiveis();
        livros.setTitle("Relatório de livros disponíveis");
        livros.setVisible(true);
        livros.setDefaultCloseOperation(RelatorioLivrosDisponiveis.DISPOSE_ON_CLOSE);
        livros.setResizable(false);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        RelatorioLivrosEmprestados livros = new RelatorioLivrosEmprestados();
        livros.setTitle("Relatório de livros emprestados");
        livros.setVisible(true);
        livros.setDefaultCloseOperation(RelatorioLivrosEmprestados.DISPOSE_ON_CLOSE);
        livros.setResizable(false);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        RelatorioLivrosAtraso livros = new RelatorioLivrosAtraso();
        livros.setTitle("Relatório de livros atrasados");
        livros.setVisible(true);
        livros.setDefaultCloseOperation(RelatorioLivrosAtraso.DISPOSE_ON_CLOSE);
        livros.setResizable(false);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        RelatoriosTodosAlunos alunos = new RelatoriosTodosAlunos();
        alunos.setTitle("Relatório de todos os alunos");
        alunos.setVisible(true);
        alunos.setDefaultCloseOperation(RelatoriosTodosAlunos.DISPOSE_ON_CLOSE);
        alunos.setResizable(false);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        RelatorioLivrosEmprestadosUsuario livros = new RelatorioLivrosEmprestadosUsuario();
        livros.setTitle("Relatório de todos os livros emprestados para um usuário");
        livros.setVisible(true);
        livros.setDefaultCloseOperation(RelatoriosTodosAlunos.DISPOSE_ON_CLOSE);
        livros.setResizable(false);
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        IUEmprestimo emprestimo = new IUEmprestimo();
        emprestimo.setTitle("Empréstimo");
        emprestimo.setVisible(true);
        emprestimo.setDefaultCloseOperation(IUEmprestimo.DISPOSE_ON_CLOSE);
        emprestimo.setResizable(false);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        RelatorioLivrosNaoDevolvidos livros = new RelatorioLivrosNaoDevolvidos();
        livros.setTitle("Relatório de todos os livros não devolvidos de um usuário");
        livros.setVisible(true);
        livros.setDefaultCloseOperation(RelatoriosTodosAlunos.DISPOSE_ON_CLOSE);
        livros.setResizable(false);
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        RelatorioUsuariosAtraso usuario = new RelatorioUsuariosAtraso();
        usuario.setTitle("Relatório de usuários com atraso");
        usuario.setVisible(true);
        usuario.setDefaultCloseOperation(RelatoriosTodosAlunos.DISPOSE_ON_CLOSE);
        usuario.setResizable(false);
    }//GEN-LAST:event_jMenuItem13ActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new IUPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
