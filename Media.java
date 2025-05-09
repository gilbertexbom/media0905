import java.util.Scanner;

public class Media{
    public static void main(String[] args) {
        //Variáveis
        double n1, n2;

        //Objeto de entrada
        Scanner entrada = new Scanner(System.in);

        //Apresentação
        System.out.println("\n\t\t\t -- Média -- \n");

        //Entradas
        System.out.print("Informe a 1ª nota: ");
        n1 = entrada.nextDouble();

        System.out.print("Informe a 2ª nota: ");
        n2 = entrada.nextDouble();

        //Processamento
        double media = (n1 + n2)/2;

        //Saída
        System.out.printf("\n\nNota 1: %.2f;\nNota 2: %.2f\n\n Média: %.2f", n1, n2, media);
    }
}