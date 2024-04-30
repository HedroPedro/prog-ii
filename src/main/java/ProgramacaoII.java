
import patterns.Aluno;
import patterns.AlunoBuilder;
import patterns.Singleton;

public class ProgramacaoII {
    public static void main(String[] args) {
        Aluno aluno1 = new AlunoBuilder().nome("Carlos").matricula(12).getAluno();
        Singleton s = new Singleton();
        System.out.println(aluno1.toString());
        System.out.println(s.getTest());
        System.out.println(Singleton.getTest());
    }
}
