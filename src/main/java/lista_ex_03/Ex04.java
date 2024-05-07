/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_ex_03;

import java.time.LocalDate;

/**
 *
 * @author pedro
 */
public class Ex04{
    
    public Ex04(){}
    
    public LocalDate mudarData(LocalDate data, int ano){
        return data.withYear(ano);
    }
    
    public LocalDate mudarData(LocalDate data, int mes, int ano){
        return data.withMonth(mes).withYear(ano);
    }
    
    public LocalDate mudarData(LocalDate data, int dia, int mes, int ano){
        
        return data.withDayOfMonth(dia).withMonth(mes).withYear(ano);
    }
}
