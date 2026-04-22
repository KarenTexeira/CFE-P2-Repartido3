public class Ejercicio4 {
    public static void main(String[] args) {

        int matriz[][] = {
                {2, 4, 1},
                {5, 3, 2},
                {6, 7, 1}
        };

        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("]");
        }

        for (int i = 0; i < matriz.length; i++) {
            int suma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
            System.out.println("Suma fila " + (i + 1) + ": " + suma);
        }
    }
} // En este ejercicio tuve varios errores al intentar hacerlo sin ayuda, primero me salia asi
//  Matriz : 2Matriz : 4Matriz : 1, utilice mal la matriz.length para las columnas, System.out.println("Suma fila " + (i + 1) + ": " + suma); esta parte también me costo entenderla

//ya que escribia (i) en vez de (i+1).
// suma += matriz[i][j]; esta parte tambien me costo, escribia mal el codigo y no llegaba al resultado deseado
