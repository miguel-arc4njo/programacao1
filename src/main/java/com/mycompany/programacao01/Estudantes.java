/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programacao01;

import java.util.Date;

/**
 *
 * @author aluno
 */
// ano = semestre
public class Estudantes {
    private String nomeAluno;
    private Date datanascimento;
    private String cpf;
    private char genero;
    private String matricula;
    private String email;
    private String nivelEnsino;
    private String telefone;
    private int anoIngresso;
    private int semestreIngresso;
    private String situacao;
    private String digito;
    
 
    public Estudantes() {
        nomeAluno = "Nobody";
    }
   
    public int obterIdade(Date hoje) {
        int idade = 0;
        // Lógica de calculo de idade
        return idade;
    }
   
    public String getnomeAluno() {
        return nomeAluno;
    }
   
    public void setnomeAluno(String _nome) {
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
        return String.valueOf(anoIngresso)+String.valueOf(semestreIngresso)+digito;
    }
   
    public void setmatricula(String _digito) {
        digito = _digito;
    }
   
    public String getEmail() {
        return email;
    }
   
    public void getEmail(String _email) {
        email = _email;
    }
    
    public String gettelefone() {
        return telefone;
    }
    
    public String setTelefone(String _telefone){
        return telefone = _telefone;
    }
    
     public String getnivelEnsino() {
        return nivelEnsino;
    }
     
    public void setnivelEnsino(String _nivelEnsino){
     nivelEnsino = _nivelEnsino;
    }
    
    public String getsituacao(){
        return situacao;
    }
    
    public void setsituacao(String _situacao){
        situacao = _situacao;
    }  

    void setNome(String marcos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
