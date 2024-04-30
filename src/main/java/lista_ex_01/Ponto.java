package lista_ex_01;

public class Ponto {
    int x, y;
    
    public Ponto(){
        x = 0;
        y = 0;
    }
    
    public Ponto(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    void plotar(){
        System.out.println("O ponto está na coordenada (" + x + ", " + y + ")");
    }
    
    void setarXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void demo(){
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto(7, 4);
        p1.plotar();
        p2.plotar();
    }
}
