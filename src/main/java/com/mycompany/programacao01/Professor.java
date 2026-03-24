/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacao01;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Professor {
     private String nomeProfessor;
     private String SIAPE;
     private String email;
     private String telefone;
     private String titulacaoAcademica;
     private String areaAtuacao;
     private String regimeTrabalho;
     private Date anoIngresso;
     private String formacao;
     
     public Professor() {
        nomeProfessor = "Nobody";
    }
     
     //nomeProfessor
      public String getnomeProfessor() {
        return nomeProfessor;
    }
      public void setnomeProfessor(String _nome) {
        nomeProfessor = _nome;
    }
      
      //SIAPE
      public String getSIAPE(){
          return SIAPE;
      }
      public void setSIAPE(String _SIAPE){
          SIAPE = _SIAPE;
      }
      
      //email 
       public String getEmail() {
        return email;
    }  
    public void getEmail(String _email) {
        email = _email;
    }
    
    //telefone
     public String gettelefone() {
        return telefone;
    } 
    public  String setTelefone(String _telefone){
        return telefone = _telefone;
    }
    
    //titulacaoAcademica
    public String gettitulacaoAcademica(){
        return titulacaoAcademica;
    }
    public void settitulacaoAcademica(String _titulacaoAcademica){
        titulacaoAcademica = _titulacaoAcademica;
    }
    
    //areaAtuacao
    public String getareaAtuacao(){
        return areaAtuacao;
    }
    public void setareaAtuacao(String _areaAtuacao){
        areaAtuacao = _areaAtuacao;
    }
    
    //regimeTrabalho
    public String getregimeTrabalho(){
        return regimeTrabalho;
    }
    public void setregimeTrabalho(String _regimeTrabalho){
        regimeTrabalho = _regimeTrabalho;
    }
    
    //anoIngresso
    public Date getanoIngresso(){
        return anoIngresso;
    }
    public void setanoIngresso(Date _anoIngresso){
        anoIngresso = _anoIngresso;
    }
    
    //formacao
    public String getformacao(){
        return formacao;
    }
    public void setformacao(String _formacao){
        formacao = _formacao;
    }
      
}
