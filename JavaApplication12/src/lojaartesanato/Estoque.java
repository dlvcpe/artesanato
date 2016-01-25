/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojaartesanato;

import java.util.ArrayList;

/**
 *
 * @author danielleite
 */
public class Estoque {
    //Estoque 
    ArrayList<Produto> estoque = new ArrayList<Produto>();
    
    public void adicionarProduto(Produto produto_novo){
        estoque.add(produto_novo);
    }
    
    public void removeProduto (Produto produto_remover){
        estoque.remove(produto_remover);
    }
    
    public Produto getProdutoNome(String nome){
        for (int i = 0; i < estoque.size(); i++) {
            if(estoque.get(i).getNome_produto().equals(nome)){
                return estoque.get(i);
            }
        }
        return null;
    }
    
    public ArrayList<Produto> getProdutoArtista(String nome){
        ArrayList<Produto> listaArtista = new ArrayList<>();
        for (int i = 0; i < estoque.size(); i++) {
            if(estoque.get(i).getNome_artista().equals(nome)){
                 listaArtista.add(estoque.get(i));
            }
        }
        return listaArtista;
    }
    
    public ArrayList<Produto> getProdutoMesmaSerie(String nome){
        ArrayList<Produto> listaSerie = new ArrayList<>();
        for (int i = 0; i < estoque.size(); i++) {
            if(estoque.get(i).getSerie_relacionada().equals(nome)){
                 listaSerie.add(estoque.get(i));
            }
        }
        return listaSerie;
    }    
    
    public 
            
            
}
