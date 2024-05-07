package lista_ex_03;

/**
 *
 * @author pedro
 */
public class Calculadora {
    public Integer calculaValores(String opcao, Integer ...nums){
        Integer resultado = 0;
        switch (opcao) {
            case "SOM":
                for(Integer num : nums){
                    resultado += num;
                }
                break;
            case "MUL":
                resultado = 1;
                for(Integer num : nums){
                    resultado *= num;
                }
                break;
            default:
                return -1;
        }
        return resultado;
    }
}
