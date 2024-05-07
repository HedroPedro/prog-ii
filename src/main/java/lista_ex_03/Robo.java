/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_ex_03;

/**
 *
 * @author pedro
 */
public class Robo {
    Ponto posicao;
    String name;
    
    public Robo(){
        this.name = "";
        posicao = new Ponto();
    }
    
    public Robo(String name, Ponto posicao){
        this.name = name;
        this.posicao = posicao;
    }
    
    public String getName(){
        return this.name;
    }
    
    public Ponto getPosicao(){
        return this.posicao;
    }
    
    public void andarParaDireita(){
        posicao.setX(posicao.getX()+1);
    }
    
    public void andarParaEsquerda(){
        posicao.setX(posicao.getX()-1);
    }
    
    public void andarParaCima(){
        posicao.setY(posicao.getY()+1);
    }
    
    public void andarParaBaixo(){
        posicao.setY(posicao.getY()-1);
    }
    
    public void teleportar(int x, int y){
        posicao.setX(x);
        posicao.setY(y);
    }
    
    public void falarPosicao(){
        System.out.println(String.format("Eu robo '%s' estou no ponto: (%d, %d)!", this.name, this.posicao.getX(), this.posicao.getY()));
    }
    
    public boolean colidiu(Robo outroRobo){
        return outroRobo.getPosicao().getX() == this.posicao.getX() && 
                outroRobo.getPosicao().getY() == this.posicao.getY();
    }
}
