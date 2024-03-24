import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temperatura;
        double somaTemperaturas = 0;
        int contador = 0;
        double menorTemperatura = Double.MAX_VALUE;
        double maiorTemperatura = Double.MIN_VALUE;

        System.out.println("Digite as temperaturas (digite 0 para encerrar):");

        do {
            System.out.print("Temperatura " + (contador + 1) + ": ");
            temperatura = scanner.nextDouble();

            if (temperatura != 0) {
                somaTemperaturas += temperatura;
                contador++;

                if (temperatura < menorTemperatura) {
                    menorTemperatura = temperatura;
                }

                if (temperatura > maiorTemperatura) {
                    maiorTemperatura = temperatura;
                }
            }
        } while (temperatura != 0);

        scanner.close();

        if (contador > 0) {
            double mediaTemperaturas = somaTemperaturas / contador;
            System.out.println("\nMenor temperatura: " + menorTemperatura);
            System.out.println("Maior temperatura: " + maiorTemperatura);
            System.out.println("Média das temperaturas: " + mediaTemperaturas);
        } else {
            System.out.println("Nenhuma temperatura foi informada.");
        }
    }
}
