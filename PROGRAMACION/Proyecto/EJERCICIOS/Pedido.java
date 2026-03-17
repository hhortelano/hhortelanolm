public class Pedido {

    private static final String NORMAL = "NORMAL";
    private static final String VIP = "VIP";

    public void procesarPedido(String tipoCliente, double totalCompra) {

        double descuento = calcularDescuento(tipoCliente, totalCompra);

        if (descuento < 0) {
            System.out.println("Tipo de cliente desconocido");
            return;
        }

        mostrarResultado(descuento, totalCompra);
    }

    private double calcularDescuento(String tipoCliente, double totalCompra) {

        if (NORMAL.equals(tipoCliente)) {
            return totalCompra > 100 ? 0.05 : 0.0;
        }

        if (VIP.equals(tipoCliente)) {
            return totalCompra > 100 ? 0.20 : 0.10;
        }

        return -1;
    }

    private void mostrarResultado(double descuento, double totalCompra) {

        if (descuento == 0) {
            System.out.println("Sin descuento");
        } else {
            System.out.println("Descuento " + (int) (descuento * 100) + "%");
        }

        double totalFinal = totalCompra - totalCompra * descuento;
        System.out.println("Total: " + totalFinal);
    }
}
