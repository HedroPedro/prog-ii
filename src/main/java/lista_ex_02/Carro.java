/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_ex_02;

/**
 *
 * @author pedro
 */
public class Carro {
    int velocidade, anoDeFab;
    String modelo, marca;
    
    Carro(int anoDeFab, String modelo, String marca){
        this.velocidade = 0;
        this.anoDeFab = anoDeFab;
        this.modelo = modelo;
        this.marca = marca;
    }
    
    void acelerar(){
        if(this.velocidade < 200){
            this.velocidade++;
        }
    }
    
    void frear(){
        if(this.velocidade > 0){
            this.velocidade--;
        }
    }
}
