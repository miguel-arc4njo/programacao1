/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programacao01;

import java.util.Date;

/**
 *
 * @author aluno
 */


public class Estudantes {
    private String nomeAluno;
    private Date datanascimento;
    private String cpf;
    private char genero;
    private String matricula;
    private String email;
    private String telefone;
    private Date anoIngresso;
    private String semestreIngresso;
    private String situacao;
    
 
    public Estudantes() {
        nomeAluno = "Nobody";
    }
   
    public int obterIdade(Date hoje) {
        int idade = 0;
        // Lógica de calculo de idade
        return idade;
    }
   
    public String getNome() {
        return nomeAluno;
    }
   
    public void setNome(String _nome) {
        nomeAluno = _nome;
    }
   
    public Date getData() {
        return datanascimento;
    }
   
    public void setData(Date _datanascimento) {
        datanascimento = _datanascimento;
    }
   
    public String getCPF() {
        return cpf;
    }
   
    public void setCPF(String _cpf) {
        cpf = _cpf;
    }
   
    public char getGenero() {
        return genero;
    }
   
    public void setGenero(char _genero) {
        genero = _genero;
    }
   
    public String getMatricula() {
        return matricula;
    }
   
    public void setmatricula(String _matricula) {
        matricula = _matricula;
    }
   
    public String getEmail() {
        return email;
    }
   
    public void getEmail(String _email) {
        email = _email;
    }
    
}

