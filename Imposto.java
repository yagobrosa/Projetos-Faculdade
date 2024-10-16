import java.util.Scanner;

public class Imposto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Usuário inserir os números
        System.out.print("Digite a renda anual com salário: ");
        double rendaAnualSalario = scanner.nextDouble();

        System.out.print("Digite a renda anual com prestação de serviços: ");
        double rendaAnualServicos = scanner.nextDouble();

        System.out.print("Digite a renda anual com ganho de capital: ");
        double rendaAnualGanhoCapital = scanner.nextDouble();

        System.out.print("Digite os gastos médicos no ano: ");
        double gastosMedicos = scanner.nextDouble();

        System.out.print("Digite os gastos educacionais no ano: ");
        double gastosEducacionais = scanner.nextDouble();
        
        // Cálculo da renda mensal
        double salarioMensal = rendaAnualSalario / 12;

        // Cálculo do impostoSalario
        double impostoSalario;
        if (salarioMensal < 3000) {
            impostoSalario = 0;
        } else if (salarioMensal < 5000) {
            impostoSalario = rendaAnualSalario * 0.10;
        } else {
            impostoSalario = rendaAnualSalario * 0.20;
        }

        // Cálculo do impostoServicos
        double impostoServicos = rendaAnualServicos * 0.15;

        // Cálculo do imposto Capital
        double impostoGanhoCapital = rendaAnualGanhoCapital * 0.20;

        // Cálculo do imposto Bruto
        double impostoBruto = impostoSalario + impostoServicos + impostoGanhoCapital;

        // Cálculo do Abatimento
        double totalGastos = gastosMedicos + gastosEducacionais;
        double limiteAbatimento = impostoBruto * 0.30;

        double abatimento = Math.min(totalGastos, limiteAbatimento);

        // Cálculo do imposto total
        double impostoTotal = impostoBruto - abatimento;


        //Mensagens que vai aparecer no final
        System.out.println("\n### RELATÓRIO DE IMPOSTO DE RENDA ###");
        System.out.println("\n# CONSOLIDADO DE RENDA:");
        System.out.printf("Imposto sobre salário: R$%.2f%n", impostoSalario);
        System.out.printf("Imposto sobre serviços: R$%.2f%n", impostoServicos);
        System.out.printf("Imposto sobre ganho de capital: R$%.2f%n", impostoGanhoCapital);
        
        System.out.println("\n# DEDUÇÕES:");
        System.out.printf("Máximo dedutível: R$%.2f%n", limiteAbatimento);
        System.out.printf("Gastos dedutíveis: R$%.2f%n", totalGastos);

        System.out.println("\n# RESUMO:");
        System.out.printf("Imposto bruto total: R$%.2f%n", impostoBruto);
        System.out.printf("Abatimento: R$%.2f%n", abatimento);
        System.out.printf("Imposto devido: R$%.2f%n", impostoTotal);

        scanner.close();
    }
}