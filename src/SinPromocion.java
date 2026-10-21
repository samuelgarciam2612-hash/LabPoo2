public class SinPromocion implements EstrategiaPromocion {

    public SinPromocion() {
        System.out.println("Estrategia creada: sin promoción");
    }

    @Override
    public double aplicar(double subtotal) {
        return subtotal;
    }

    @Override
    public String getDescripcion() {
        return "Sin promoción";
    }
}