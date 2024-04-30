/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_ex_02;

/**
 *
 * @author pedro
 */
public class Programador {
    String nome;
    double salarioMes;
    int horasExtrasTrabalhadas;
    
    Programador(String nome, double salarioMes, int horasExtrasTrabalhadas){
        this.nome = nome;
        this.salarioMes = salarioMes;
        this.horasExtrasTrabalhadas = horasExtrasTrabalhadas;
    }
    
    double calcularSalario(double valorExtra){
        return salarioMes + horasExtrasTrabalhadas * valorExtra;
    }
}
