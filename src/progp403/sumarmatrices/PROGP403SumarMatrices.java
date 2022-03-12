package progp403.sumarmatrices;
/**
 *
 * @author Jose Miguel Muñoz Canales
 */
public class PROGP403SumarMatrices {
    public static void main(String[] args) {
        final int LONG=4;
        int matrizP[][]= crearMatriz(LONG);
        int matrizD[][]= crearMatriz(LONG);
        int sumada[][]= sumarMatriz(matrizP,matrizD);
        System.out.println("Array 1");
        mostrar(matrizP);
        System.out.println("Array 2");
        mostrar(matrizD);
        System.out.println("Array sumada");
        mostrar(sumada);
       
    }
//Prueba de commit
    public static int[][] crearMatriz(int tamano) {
        int matriz[][] = new int[tamano][tamano];
        int valor = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = valor;
                valor++;
            }

        }
        return matriz;
    }
    public static int[][] sumarMatriz(int matriz[][], int matrizS[][]) {
        int matrizSuma[][]= new int [matriz.length][matriz[0].length];
        for (int i = 0; i < matrizSuma.length; i++) {
            for (int j = 0; j < matrizSuma[0].length; j++) {
                matrizSuma[i][j] = (matriz[i][j]+ matrizS[i][j]);
            }

        }
    return matrizSuma;}
    
    public static void mostrar(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("\t" + matriz[i][j]);
            }
            System.out.println("");
        }
    }
}
