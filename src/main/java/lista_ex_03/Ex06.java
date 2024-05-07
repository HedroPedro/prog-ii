/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_ex_03;

/**
 *
 * @author pedro
 */
public class Ex06 {
    private static Integer quantidadeDeObjetos = 0;
    public Ex06(){
        super();
        quantidadeDeObjetos++;
    }
    
    public static Integer getQuantidadeDeObjetos(){
        return quantidadeDeObjetos;
    }
}
