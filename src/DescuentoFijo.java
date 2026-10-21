public class DescuentoFijo implements EstrategiaPromocion {

    private final double monto;

    public DescuentoFijo(double montoDescuento) {
        if (montoDescuento < 0) {
            throw new IllegalArgumentException("El monto no puede ser negativo");
        }
        monto = montoDescuento;
        System.out.println("Estrategia creada: descuento fijo de $" + monto);
    }

    @Override
    public double aplicar(double subtotal) {
        return Math.max(0, subtotal - monto);
    }

    @Override
    public String getDescripcion() {
        return "Descuento fijo de $" + monto;
    }
    }