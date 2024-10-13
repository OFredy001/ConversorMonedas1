import java.util.Scanner;

public class principal {

        public static void principal(String[] args) {
            Scanner scanner = new Scanner(System.in);
            CurrencyConverter currencyConverter = new CurrencyConverter();

            boolean continueConversion = true;

            while (continueConversion) {
                // Mostrar opciones
                System.out.println(" _________________________________________________");
                System.out.println("| Elige la conversión que deseas realizar         |");
                System.out.println("|-------------------------------------------------|");
                System.out.println("| 1: Dólar (USD) a Peso Colombiano (COP)          |");
                System.out.println("| 2: Euro (EUR) a Peso Mexicano (MXN)             |");
                System.out.println("| 3: Dólar (USD) a Real Brasileño (BRL)           |");
                System.out.println("| 4: Peso Colombiano (COP) a Dólar (USD)          |");
                System.out.println("| 5: Peso Mexicano (MXN) a Euro (EUR)             |");
                System.out.println("| 6: Real Brasileño (BRL) a Peso Colombiano (COP) |");
                System.out.println("|-------------------------------------------------|");
                System.out.println("| 7: Salir                                        |");
                System.out.println(" -------------------------------------------------");

                // Leer la opción del usuario
                int option = scanner.nextInt();

                if (option == 7) {
                    continueConversion = false;
                    System.out.println("Saliendo...");
                    break;
                }

                // Pedir la cantidad a convertir
                System.out.println("Ingresa la cantidad que desea convertir:");
                double amount = scanner.nextDouble();

                // Llamar al convertidor basado en la opción seleccionada
                switch (option) {
                    case 1:
                        System.out.println(currencyConverter.convert("USD", "COP", amount));
                        break;
                    case 2:
                        System.out.println(currencyConverter.convert("EUR", "MXN", amount));
                        break;
                    case 3:
                        System.out.println(currencyConverter.convert("USD", "BRL", amount));
                        break;
                    case 4:
                        System.out.println(currencyConverter.convert("COP", "USD", amount));
                        break;
                    case 5:
                        System.out.println(currencyConverter.convert("MXN", "EUR", amount));
                        break;
                    case 6:
                        System.out.println(currencyConverter.convert("BRL", "COP", amount));
                        break;
                    default:
                        System.out.println("Opción no válida. Intenta nuevamente.");
                }

                // Separador visual para la siguiente iteración
                System.out.println("-----------------------------------");
            }

            scanner.close();
        }
    }
}
