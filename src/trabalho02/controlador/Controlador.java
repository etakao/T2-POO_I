/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho02.controlador;

import trabalho02.modelo.Biblioteca;
import trabalho02.modelo.Config;
import trabalho02.modelo.Emprestimo;
import trabalho02.modelo.Usuario;

/**
 *
 * @author Danilo Medeiros Eler
 */
public class Controlador {

    private Biblioteca biblio = Biblioteca.getInstance();
    
    public Config getConfiguracoes() {
        return biblio.getConfiguracoes();
    }

    public void addAluno(String codUsuario, String nome, String curso, int ano) {
        biblio.addAluno(codUsuario, nome, curso, ano);
    }
    
    public void addProfessor(String codUsuario, String nome, String titulacao) {
        biblio.addProfessor(codUsuario, nome, titulacao);
    }
    
    public void addLivro(String codLivro, String nome, int ano) {
        biblio.addLivro(codLivro, nome, ano);
    }
    
    public void addEmprestimo(Emprestimo emprestimo) {
        biblio.addEmprestimo(emprestimo);
    }
}
