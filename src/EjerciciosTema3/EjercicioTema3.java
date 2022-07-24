package EjerciciosTema3;

public class EjercicioTema3 {

    public static void main(String[] args) {
        String[] nombres = {"Juan", "Pedro", "Maria", "Pablo"};
        String texto = "";
        for (int i = 0; i < nombres.length; i++) {
            texto += nombres[i] + ", ";
            if (i == nombres.length - 1) {
                texto += nombres[i];
            }
        }
        System.out.println(texto);
    }
}
