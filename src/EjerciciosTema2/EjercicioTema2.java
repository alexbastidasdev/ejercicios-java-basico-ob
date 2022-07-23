package EjerciciosTema2;

public class EjercicioTema2 {
    public static void main(String[] args) {
        double precioConIva = precioConIva(200.0);
        System.out.println("El precio con iva es: " + precioConIva);
    }

    static double precioConIva(double precio) {
        double iva = precio * 0.19;
        double precioConIva = precio + iva;
        return precioConIva;
    }

}
