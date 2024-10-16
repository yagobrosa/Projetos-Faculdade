import java.util.Scanner;

public class BarConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo os preços
        final double HOMEM = 10.0;
        final double MULHER = 8.0;
        final double CERVEJA = 5.0;
        final double REFRIGERANTE = 3.0;
        final double ESPETINHO = 7.0;
        final double COUVERT = 4.0;

        // Lendo os dados do cliente
        System.out.print("Informe o sexo (M ou F): ");
        char sexo = scanner.next().toUpperCase().charAt(0);
        
        System.out.print("Quantidade de cervejas: ");
        int numCervejas = scanner.nextInt();
        
        System.out.print("Quantidade de refrigerantes: ");
        int numRefrigerantes = scanner.nextInt();
        
        System.out.print("Quantidade de espetinhos: ");
        int numEspetinhos = scanner.nextInt();

        // Ingresso diferente pro "M" ou "F"
        double ingresso;
        if (sexo == 'M') {
            ingresso = HOMEM;
        } else {
            ingresso = MULHER;
        }

        double consumo = (numCervejas * CERVEJA) + (numRefrigerantes * REFRIGERANTE) + (numEspetinhos * ESPETINHO);
        
        // Verificando a taxa de couvert
        double totalPagar = ingresso + consumo;
        if (consumo <= 30) {
            totalPagar += COUVERT;
        }

        // Exibindo o relatório
            System.out.println();
        System.out.printf("### RELATÓRIO DO BAR ###");
            System.out.println();
        System.out.printf("Consumo = R$ %.2f%n", consumo);
        if (consumo <= 30) {
            System.out.printf("Couvert = R$ %.2f%n", COUVERT);
        } else {
            System.out.printf("Couvert Isento%n");
        }
        System.out.printf("Ingresso = R$ %.2f%n", ingresso);
        System.out.printf("Valor a pagar = R$ %.2f%n", totalPagar);
        
        scanner.close();
    }
}