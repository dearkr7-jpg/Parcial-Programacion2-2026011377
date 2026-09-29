public class ComisionPersonalizada implements EstrategiaComision {

    @Override
    public double calcularComision(double montoVenta) {
        int N = 5;
        double porcentaje = (5 + N) / 100.0;
        return montoVenta * porcentaje;
    }
}