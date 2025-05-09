import java.util.Scanner;

public class Media{
    public static void main(String[] args) {
        //Variáveis
        double media = 0.0;
        //double n1, n2;

        //Declaração do vetor
        double[] nota = new double[4];

        //Objeto de entrada
        Scanner entrada = new Scanner(System.in);

        //Apresentação
        System.out.println("\n\t\t\t -- Média -- \n");

        //Entradas
        for(int i = 0; i <= 3; i++){
            System.out.print("Informe a " + (i+1) + "ª nota: ");
            nota[i] = entrada.nextDouble();
        }

        /*
        System.out.print("Informe a 1ª nota: ");
        n1 = entrada.nextDouble();

        System.out.print("Informe a 2ª nota: ");
        n2 = entrada.nextDouble();
        */

        //Processamento
        for(int i = 0; i <= 3; i++){
            media += nota[i];
        }
        media /= 4; 

        //double media = (n1 + n2)/2;

        //Saída
        System.out.println("\n\n");
        for(int i = 0; i <= 3; i++){
            System.out.printf("Nota %d: %.2f\n", (i+1), nota[i]);
        }
        System.out.printf("\n\nMédia: %.2f\n\n", media);
        
        //System.out.printf("\n\nNota 1: %.2f;\nNota 2: %.2f\n\n Média: %.2f", n1, n2, media);
    }
}