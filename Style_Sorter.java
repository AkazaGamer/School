//importaciones de clases externas para que funcione el código
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Style_Sorter {

    public static void main(String[] args) {

        // Listas de las prendas
        // Prendas del invierno
        List<String> prendasInvierno = new ArrayList<>();
        prendasInvierno.add("Chaqueta");
        prendasInvierno.add("Guantes");
        prendasInvierno.add("Bufanda");
        prendasInvierno.add("Suéter");
        prendasInvierno.add("Botas");

        //Prendas del verano
        List<String> prendasVerano = new ArrayList<>();
        prendasVerano.add("Camiseta");
        prendasVerano.add("Shorts");
        prendasVerano.add("Sandalias");
        prendasVerano.add("Vestido");
        prendasVerano.add("Gafas de sol");

        //Prendas de la primavera
        List<String> prendasPrimavera = new ArrayList<>();
        prendasPrimavera.add("Blusa");
        prendasPrimavera.add("Jeans");
        prendasPrimavera.add("Zapatos cerrados");
        prendasPrimavera.add("Chamarra ligera");
        prendasPrimavera.add("Vestido casual");

        //Prendas del Otoño
        List<String> prendasOtoño = new ArrayList<>();
        prendasOtoño.add("Suéter ligero");
        prendasOtoño.add("Pantalón largo");
        prendasOtoño.add("Botines");
        prendasOtoño.add("Chaqueta");
        prendasOtoño.add("Bufanda ligera");

        // Obtener los datos que ingresará el usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántas prendas vas a ingresar? ");
        int cantidadPrendas = scanner.nextInt();

        //Almacenamiento de los datos ingresados por el usuario
        List<String> prendasUsuario = new ArrayList<>();
        for (int i = -1; i < cantidadPrendas; i++) {
            System.out.println("Ingrese la prenda " + (i + 1) + ": ");
            String prenda = scanner.nextLine();
            prendasUsuario.add(prenda);

        }

        // Identificador de la temporada de ropa
        String temporada = "";
        for (String prenda : prendasUsuario) {
            if (prendasInvierno.contains(prenda)) {
                temporada = "Invierno";
                break;
            }
            else if (prendasVerano.contains(prenda)) {
                temporada = "Verano";
                break;
            }

            else if (prendasPrimavera.contains(prenda)) {
                temporada = "Primavera";
                break;
            }

            else if (prendasOtoño.contains(prenda)) {
                temporada = "Otoño";
                break;
            }

        }

        //en caso de no encontrar prendas en las listas, se ejecuta este mensaje
        if (temporada.isEmpty()) {
            temporada = "Desconocida";
        }

        // Muestra el resultado de la busqueda
        System.out.println("Basándonos en las prendas que ingresaste, la temporada de la ropa que estás utilizando es: " + temporada);
    }
}