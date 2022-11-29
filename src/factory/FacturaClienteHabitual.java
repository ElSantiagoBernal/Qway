package factory;

public class FacturaClienteHabitual extends Factura{
    @Override
    public double getImporteCliente() {
    return getImporte()*2.7;
    }
}
