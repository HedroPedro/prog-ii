package lista_ex_02;

public class TrabalhadorHorista {
    double valorHora;
    int horasTrabalhadas;
    
    TrabalhadorHorista(){
        this.valorHora = 0;
        this.horasTrabalhadas = 0;
    }
    
    TrabalhadorHorista(double valorHora, int horasTrabalhadas){
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    double calcularSalario(){
        return valorHora * horasTrabalhadas;
    }
}
