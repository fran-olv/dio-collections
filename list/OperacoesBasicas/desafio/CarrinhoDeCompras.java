package list.OperacoesBasicas.desafio;

import java.util.ArrayList;
import java.util.List;
public class CarrinhoDeCompras {
    private List<Item> itemLista;

    public CarrinhoDeCompras() {
        this.itemLista = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemLista.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> ItensParaRemover = new ArrayList<>();
        if (!itemLista.isEmpty()) {
            for (Item i : itemLista) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    ItensParaRemover.add(i);
                }
            }
            itemLista.removeAll(ItensParaRemover);
        } else {
            System.out.println("Lista Vazia!");
        }
    }

    public double calcularValorTotal() {
            double valorTotal = 0.00;
            if (!itemLista.isEmpty()) {
                for (Item i : itemLista) {
                    double valorItem = i.getPreco() * i.getQuantidade();
                    valorTotal += valorItem;
                }
                return valorTotal;
            } else {
                throw new RuntimeException("Lista Vazia!");
            }
        }

    public void exibirItens(){
            if (!itemLista.isEmpty()) {
                System.out.println(this.itemLista);
            }else{
                System.out.println("Lista Vazia!");
            }
        }

    @Override
    public String toString() {
        return "CarrinhoDeCompra{" +
                "itemLista=" + itemLista +
                '}';
    }

    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }
}
