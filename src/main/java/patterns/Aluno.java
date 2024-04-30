/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patterns;

/**
 *
 * @author pedro
 */
public class Aluno {
    private Integer matricula;
    private String nome;
    
    Aluno(){
        matricula = 0;
        nome = "";
    }
    
    public void setMatricula(Integer matricula){
        this.matricula = matricula;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public Integer getMatricula(){
        return this.matricula;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String toString(){
        return String.format("{Matricula: %d; Nome: %s}", this.matricula, this.nome);
    }
}
