/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojaartesanato;

/**
 *
 * @author danielleite
 */
public class Produto {
    private String nome_produto, nome_artista, serie_relacionada;
    private int ano;
    private double preco;

     public Produto(String nome_produto, String nome_artista, String serie_relacionada, int ano, double preco) {
        this.nome_produto = nome_produto;
        this.nome_artista = nome_artista;
        this.serie_relacionada = serie_relacionada;
        this.ano = ano;
        this.preco = preco;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public String getNome_artista() {
        return nome_artista;
    }

    public String getSerie_relacionada() {
        return serie_relacionada;
    }

    public int getAno() {
        return ano;
    }

    public double getPreco() {
        return preco;
    }
    
    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public void setNome_artista(String nome_artista) {
        this.nome_artista = nome_artista;
    }

    public void setSerie_relacionada(String serie_relacionada) {
        this.serie_relacionada = serie_relacionada;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
           
    
}
