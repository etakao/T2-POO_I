/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho02.modelo;

import java.util.ArrayList;
import trabalho02.dados.Database;

/**
 *
 * @author Danilo Medeiros Eler
 */
public class Biblioteca {
    private static Biblioteca instancia;
   private Config configuracoes;
   private Database db = Database.getInstance();
   private ArrayList<Usuario>usuarios = new ArrayList<Usuario>();
   private ArrayList<Livro>livros = new ArrayList<Livro>();
   private ArrayList<Emprestimo>emprestimos= new ArrayList<Emprestimo>();

    public Biblioteca() {       
        this.configuracoes = new Config();
        usuarios = new ArrayList<>();
        livros = new ArrayList<>();
        emprestimos = new ArrayList<>();
    }
    
    public static Biblioteca getInstance(){
        if (instancia == null){
            instancia = new Biblioteca();
        }
        return instancia;
    }

    public Config getConfiguracoes() {
        return configuracoes;
    }

    public void setConfiguracoes(Config configuracoes) {
        this.configuracoes = configuracoes;
    }

    public void addAluno(String codUsuario, String nome, String curso, int ano){
        Aluno aluno = new Aluno(codUsuario, nome, curso, ano, configuracoes.getDiasAluno());
        db.addUsuario(aluno);
        usuarios.add(aluno);

    }

    public void addProfessor(String codUsuario, String nome, String titulacao){
        Professor professor = new Professor(codUsuario, nome, titulacao, configuracoes.getDiasProfessor());
        usuarios.add(professor);
        db.addUsuario(professor);
        

    }

    public void addLivro(String codLivro, String nome, int ano) {
        Livro livro = new Livro(codLivro, nome, ano);
        db.addLivro(livro);
        livros.add(livro);
    }
    
    public void addEmprestimo(String codEmprestimo, Usuario usuario) {
        Emprestimo emprestimo = new Emprestimo(codEmprestimo, usuario);
        db.addEmprestimo(emprestimo);
        emprestimos.add(emprestimo);
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
    
    

    

}
