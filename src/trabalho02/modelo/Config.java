/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalho02.modelo;

import java.io.Serializable;

/**
 *
 * @author Danilo Medeiros Eler
 */
public class Config implements Serializable{
    private static String arquivoLivros = ".\\livros.dat";
    private static String arquivoUsuarios = ".\\usuarios.txt";
    private static String arquivoEmprestimos = ".\\emprestimos.dat";
    private int diasAluno = 10;
    private int diasProfessor = 20;

    public static String getArquivoEmprestimos() {
        return arquivoEmprestimos;
    }

    public void setArquivoEmprestimos(String arquivoEmprestimos) {
        Config.arquivoEmprestimos = arquivoEmprestimos;
    }

    public static String getArquivoLivros() {
        return arquivoLivros;
    }

    public void setArquivoLivros(String arquivoLivros) {
        Config.arquivoLivros = arquivoLivros;
    }

    public static String getArquivoUsuarios() {
        return arquivoUsuarios;
    }

    public void setArquivoUsuarios(String arquivoUsuarios) {
        Config.arquivoUsuarios = arquivoUsuarios;
    }

    public int getDiasAluno() {
        return diasAluno;
    }

    public void setDiasAluno(int diasAluno) {
        this.diasAluno = diasAluno;
    }

    public int getDiasProfessor() {
        return diasProfessor;
    }

    public void setDiasProfessor(int diasProfessor) {
        this.diasProfessor = diasProfessor;
    }

}
