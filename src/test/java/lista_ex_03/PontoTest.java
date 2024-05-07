/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_ex_03;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
/**
 *
 * @author pedro
 */
public class PontoTest {
    @Test
    public void testPonto(){
        Ponto ponto1 = new Ponto();
        Ponto ponto2 = new Ponto(-2, 2);
        System.out.println(String.format("(%d, %d)", ponto1.getX(), ponto1.getY()));
        System.out.println(String.format("(%d, %d)", ponto2.getX(), ponto2.getY()));
        Assertions.assertNotEquals(ponto1, ponto2);
    }
}
