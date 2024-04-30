package lista_ex_02;

public class Linha {
    int comprimento;
    
    Linha(int comprimento){
        this.comprimento = comprimento;
    }
    
    void desehar(){
        for(int i = 0; i < comprimento; i++){
            System.out.print("_");
        }
        System.out.println("");
    }
}
