/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assosiacao;

/**
 *
 * @author 3086926
 */
public class Pedido {
    Produto produtos[];
    
    public void inicia(){
        this.produtos = new Produto[10];
    }
    
    public void adicionaProduto(Produto p, int posicao){
        this.produtos[posicao] = p;
    }
    
    public double calculaValor(){
        double soma = 0;
        for (int i = 0; i < this.produtos.length; i++) {
            soma += this.produtos[i].preco;
        }
        return soma;
    }
}
