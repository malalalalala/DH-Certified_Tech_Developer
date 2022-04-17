package c7;

public class Pedido {
    private String fechaPedido;
    private String codigo;
    private Item[] items;

    public Pedido(String fechaPedido, String codigo) {
        this.fechaPedido = fechaPedido;
        this.codigo = codigo;
        items = new Item[0];
    }
}
