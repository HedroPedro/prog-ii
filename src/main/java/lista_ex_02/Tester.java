/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_ex_02;

/**
 *
 * @author pedro
 */
public class Tester {
    public static void main(String[] args){
        Programador programador1 = new Programador("Carls", 2500.5, 8);
        System.out.println(programador1.nome + " ira receber por " + programador1.horasExtrasTrabalhadas + " horas trabalhas o valor de " + programador1.calcularSalario(500));
    }
}
