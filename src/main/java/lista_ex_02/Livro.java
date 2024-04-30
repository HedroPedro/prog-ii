/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_ex_02;

/**
 *
 * @author pedro
 */
public class Livro {
    Autor autor;
    String titulo;
    String editora;
    int quantidadePaginas;
    
    Livro(String titulo, String editora, int quantidadePaginas, String nomeAutor, char genero){
        this.titulo = titulo;
        this.editora = editora;
        this.quantidadePaginas = quantidadePaginas;
        this.autor = new Autor(nomeAutor, genero);
    }
    
    Livro(){
        this.autor = new Autor();
    }
}
