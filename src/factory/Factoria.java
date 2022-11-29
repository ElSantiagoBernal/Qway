package factory;

public class Factoria {

    public static Factura createFactura(String tipo) {

        if (tipo.equals("Cliente normal")) {
            return new FacturaCliente();
        } else {
            return new FacturaClienteHabitual();
        }
    }
}
