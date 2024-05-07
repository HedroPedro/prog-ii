/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_ex_03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author pedro
 */
public class Util {
    public static String formatarData(LocalDate data){
        return data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
