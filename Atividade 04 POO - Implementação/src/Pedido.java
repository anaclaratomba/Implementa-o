/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alunos
 */
import java.util.ArrayList;

public class Pedido {
    private String dataDeCriacao;
    private String status;
    private ArrayList<PedidoItem> lista = new ArrayList<>;
    
    public void addItens(PedidoItem pedidoItem) {
        this.lista.add(e: pedidoItem);
    }
}   public Produto removeItens (PedidoItem pedidoItem) throws Exception {

} 