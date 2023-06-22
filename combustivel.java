import java.util.Scanner;

public class combustivel {

    public static void main(String[] args) {

        char combustivel;
        double litros, valor;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Bem-vindo à calculadora de combustível!");
            System.out.print("Digite A para álcool e G para gasolina: ");
            combustivel = sc.next().charAt(0);

            if (combustivel == 'A' || combustivel == 'G') {
                System.out.print("Com quantos litros de combustível você abasteceu? ");
                litros = sc.nextDouble();

                double precoAlcool = 3.15;
                double precoGasolina = 4.49;
                double desconto = 0;

                if (litros <= 20) {
                    desconto = (combustivel == 'A') ? 0.03 : 0.04;
                } else {
                    desconto = (combustivel == 'A') ? 0.05 : 0.06;
                }

                valor =  (combustivel == 'A') ? (precoAlcool * litros) - ((precoAlcool * litros) * desconto)
                        : (precoGasolina * litros) - ((precoGasolina * litros) * desconto);

                System.out.println("O valor total a ser pago será de " + valor);
            } else {
                System.out.println("Opção inválida! Digite A para álcool ou G para gasolina.");
            }

        } while (combustivel == 'A' || combustivel == 'G');

        System.out.println("Programa encerrado.");
    }
}