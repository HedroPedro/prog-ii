package lista_ex_02;

public class Dupla {
    Aluno aluno1, aluno2;
    
    public Dupla(Aluno aluno1, Aluno aluno2) {
        this.aluno1 = aluno1;
        this.aluno2 = aluno2;
    }
    
    public void showData(){
        aluno1.showNome();
        aluno2.showNome();
    }
}
