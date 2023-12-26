import java.util.Scanner;

public class MatrizExercicio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas da matriz: ");
        Integer  linhas = scanner.nextInt();

        System.out.println("Digite a quantidade de colunas da matriz");
        Integer colunas = scanner.nextInt();

        Integer[][] matriz = new Integer[linhas][colunas];

        for ( int i = 0 ; i < linhas ; i++){
            for ( int j = 0; j < colunas ; j++){
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Digite um número da matriz: ");
        Integer numeroMatriz = scanner.nextInt();

        for ( int i = 0 ; i < linhas  ; i++){
            for ( int j = 0; j < colunas ; j++){
                if (matriz[i][j] == numeroMatriz) {
                    System.out.println();
                    System.out.println("Posição: " + i +", " + j);
                    if ( j > 0) {
                        System.out.println("Esquerda: "+ matriz[i][j-1]);
                    }
                    if ( i > 0) {
                        System.out.println("Acima: "+ matriz[i-1][j]);
                    }
                    if ( j < matriz[i].length-1) {
                        System.out.println("direita: "+ matriz[i][j+1]);
                    }
                    if ( i < matriz.length-1) {
                        System.out.println("Abaixo: "+ matriz[i+1][j]);
                    }
                }
            }
        }
        scanner.close();
    }
}
