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
public class Assosiacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        Produto p1 = new Produto();
        p1.preco = 20;
        Produto p2 = new Produto();
        p2.preco = 30;
        
        pedido.inicia();
        pedido.adicionaProduto(p1, 0);
        System.out.println(pedido.calculaValor());
        pedido.adicionaProduto(p2, 1);
        System.out.println(pedido.calculaValor());
    }
    
}
