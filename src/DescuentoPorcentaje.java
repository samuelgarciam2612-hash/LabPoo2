public class DescuentoPorcentaje implements EstrategiaPromocion {

    private final double porcentaje;

    public DescuentoPorcentaje(double porcentajeDescuento) {
        if (porcentajeDescuento < 0 || porcentajeDescuento > 100) {
            throw new IllegalArgumentException("El porcentaje debe estar entre 0 y 100");
        }
        porcentaje = porcentajeDescuento;
        System.out.println("Estrategia creada: descuento del " + porcentaje + "%");
    }

    @Override
    public double aplicar(double subtotal) {
        return subtotal - (subtotal * porcentaje / 100);
    }

    @Override
    public String getDescripcion() {
        return "Descuento del " + porcentaje + "%";
    }
}