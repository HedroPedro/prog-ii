
import java.time.LocalDate;
import lista_ex_03.Calculadora;
import lista_ex_03.Ex04;
import lista_ex_03.Ex06;
import lista_ex_03.Util;

/**
 @author Pedro
 */
public class ProgramacaoII {
    public static void main(String[] args) {
        Ex04 ex04 = new Ex04();
        Calculadora calc1 = new Calculadora();
        LocalDate data = LocalDate.now();
        new Ex06();
        new Ex06();
        data = ex04.mudarData(data, 2023);
        System.out.println(data.toString());
        data = ex04.mudarData(data, 12, 1);
        System.out.println(data.toString());
        data = ex04.mudarData(data, 10, 2, 2012);
        System.out.println(data.toString());
        System.out.println(Util.formatarData(data));
        System.out.println(""+Ex06.getQuantidadeDeObjetos());
        System.out.println(""+calc1.calculaValores("SOM", 1, 2, 3, 4));
        System.out.println(""+calc1.calculaValores("MUL", 1, 2, 3, 4));
    }
}
