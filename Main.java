package clases;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArmaCorta armaCorta1 = null; // Definir fuera del switch
        ArmaLarga armaLarga1 = null;

        // SALUDO DE BIENVENIDA
        System.out.println("Bienvenido a mi programa");
        System.out.println("Ingrese el tipo de arma: 1:corta , 2:larga");

        int tipoArma = scanner.nextInt(); // Lee la opción del usuario

        switch (tipoArma) {
            case 1:
                // Crear un objeto ArmaCorta
                System.out.println("Ingrese la cantidad de municiones");
                int cantMunicionesCorta = scanner.nextInt();

                System.out.println("Ingrese el alcance");
                double alcanceCorta = scanner.nextDouble();

                System.out.println("Ingrese la marca");
                String marcaCorta = scanner.next();

                System.out.println("Ingrese el calibre");
                int calibreCorta = scanner.nextInt();

                System.out.println("Ingrese el estado en MAYUSCULAS");
                String estadoCorta = scanner.next();
                scanner.nextLine();
                armaCorta1 = new ArmaCorta(cantMunicionesCorta, alcanceCorta, marcaCorta, calibreCorta, estadoCorta);

                System.out.println("¿El arma es automática? (true/false)");
                String esAutomaticaStr = scanner.next().toLowerCase(); // Convertir a minúsculas para manejar diferentes casos de entrada
                boolean esAutomatica;
                if (esAutomaticaStr.equals("true")) {
                    esAutomatica = true;
                } else if (esAutomaticaStr.equals("false")) {
                    esAutomatica = false;
                } else {
                    System.out.println("El valor ingresado no es válido. Se asumirá que el arma no es automática.");
                    esAutomatica = false;
                }

                armaCorta1.setAutomatica(esAutomatica);

                // Cargar datos del policía
                cargarDatosPolicia(armaCorta1, scanner);
                break;

            case 2:
                // Crear un objeto ArmaLarga
                System.out.println("Ingrese la cant de municiones");
                int cantMunicionesLarga = scanner.nextInt();

                System.out.println("Ingrese el alcance");
                double alcanceLarga = scanner.nextDouble();

                System.out.println("Ingrese la marca");
                String marcaLarga = scanner.next();

                System.out.println("Ingrese el calibre");
                int calibreLarga = scanner.nextInt();

                System.out.println("Ingrese el estado en MAYUSCULAS");
                String estadoLarga = scanner.next();

                armaLarga1 = new ArmaLarga(cantMunicionesLarga, alcanceLarga, marcaLarga, calibreLarga, estadoLarga);

                // Cargar datos del policía
                cargarDatosPolicia(armaLarga1, scanner);
                break;

            default:
                System.out.println("La opción ingresada no es válida");
                break;
        }

        // Mostrar los detalles del arma
        if (tipoArma == 1) {
            ArmaCorta armaCorta = armaCorta1;
            mostrarDetallesArma(armaCorta);
        } else if (tipoArma == 2) {
            ArmaLarga armaLarga = armaLarga1;
            mostrarDetallesArma(armaLarga);
        }
    }

    // Método para cargar los datos del policía asociado al arma
    private static void cargarDatosPolicia(Arma arma, Scanner scanner) {
        scanner.nextLine();
        System.out.println("A continuación le solicitamos los datos del Policía");
        System.out.println("Ingrese el nombre del Policía");
        String nombrePolicia = scanner.next();

        System.out.println("Ingrese el apellido del Policía");
        String apellidoPolicia = scanner.next();

        System.out.println("Ingrese el número de legajo del Policía");
        int legajoPolicia = scanner.nextInt();

        Policia policia = new Policia(nombrePolicia, apellidoPolicia, legajoPolicia);
        arma.setPolicia(policia);
    }

    // Método para mostrar los detalles del arma
    private static void mostrarDetallesArma(Arma arma) {
        System.out.println("Cantidad de Municiones: " + arma.getCantMuniciones());
        System.out.println("Alcance: " + arma.getAlcance());
        System.out.println("Marca: " + arma.getMarca());
        System.out.println("Calibre: " + arma.getCalibre());
        System.out.println("Estado: " + arma.getEstado());
        if (arma instanceof ArmaCorta) {
            ArmaCorta armaCorta = (ArmaCorta) arma;
            System.out.println("¿El arma es automática? " + armaCorta.getAutomatica());
        }
    }
}
