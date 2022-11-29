package factory;

import modelo.Cliente;
import modelo.Pedido;

public class FacturaCliente extends Factura{

    @Override
    public double getImporteCliente() {
    return getImporte()*1.2;
    }
}
