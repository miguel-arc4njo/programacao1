/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacao01;

/**
 *
 * @author aluno
 */

public class Disciplina {
    private String codigoDisciplina;
    private String nomeDisciplina;
    private int cargaHoraria;
    private String ementa;
    private String objetivos;
    
    //codigoDisciplina
    public String getcodigoDisciplina(){
        return codigoDisciplina;
    }
    public void setcodigoDisciplina(String _codigoDisciplina){
        codigoDisciplina = _codigoDisciplina;
    }
    
    //noomeDisciplina
    public String getnomeDisciplina(){
        return nomeDisciplina;
    }
    public void setnoomeDisciplina(String _noomeDisciplina){
        nomeDisciplina = _noomeDisciplina;
    }
    
    //cargaHoraria
    public int getcargaHoraria(){
        return cargaHoraria;
    }
    public void setcargaHoraria(int _cargaHoraria){
        cargaHoraria = _cargaHoraria;
    }
    
    //ementa
    public String getementa(){
        return ementa;
    }
    public void setementa(String _ementa){
        ementa = _ementa;
    }
    
    //objetivos
    public String getobjetivos(){
        return objetivos;
    }
    public void setobjetivos(String _objetivos){
        objetivos = _objetivos;
    }
    
}
