import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private ArrayList<PedidoCookie> cookies;

    public Pedido() {
        this.cookies = new ArrayList<>();
    }

    public void adicionarPedidoCookie(PedidoCookie pedidoCookie) {
        cookies.add(pedidoCookie);
    }

    public int obterTotalCaixas() {
        int total = 0;
        for (PedidoCookie pedidoCookie : cookies) {
            total = total + pedidoCookie.getQuantidadeCaixas();
        }
        return total;
    }

    public int removerSabor(String sabor) {
        int total = obterTotalCaixas();
        cookies.removeIf(x -> x.getSabor().equalsIgnoreCase(sabor));
        int totalDepois = obterTotalCaixas();
        int totalRemovido = total - totalDepois;
        return totalRemovido;
    }

}
