package lista_ex_02;

public class Aluno {
    int matricula;
    String nome;
    
    public Aluno(int matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    }
    
    void showNome(){
        System.out.println("Nome: " + nome);
    }
}
