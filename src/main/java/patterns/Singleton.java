/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patterns;

/**
 *
 * @author pedro
 */
public class Singleton {
    private static final Test test = new Test();
    
    public static Test getTest(){
        return Singleton.test;
    }
    
    private static class Test {
        
        private Test(){
            super();
        }
    }
}
