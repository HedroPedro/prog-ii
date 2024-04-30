/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patterns;

/**
 *
 * @author pedro
 */
public class AlunoBuilder {
    Aluno aluno;
    
    public AlunoBuilder(){
        aluno = new Aluno();
    }
    
    public AlunoBuilder nome(String nome){
        aluno.setNome(nome);
        return this;
    }
    
    public AlunoBuilder matricula(Integer matricula){
        aluno.setMatricula(matricula);
        return this;
    }
    
    public Aluno getAluno(){
        return this.aluno;
    }
}
