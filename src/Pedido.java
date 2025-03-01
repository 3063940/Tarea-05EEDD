public class Pedido {
    private Cliente cliente;
    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void procesarPedido(double total) {
        double descuento = cliente.isEsVip() ? total * 0.15 : total * 0.10;
        double precioFinal = (total > 100) ? total - descuento : total;

        String tipoPedido = cliente.isEsVip() ? "Pedido VIP" : "Pedido Normal";

        System.out.println(tipoPedido + " aprobado. Total: " + precioFinal + ((total > 100) ? " (descuento aplicado: " + descuento +")" : ""));
    }
}
