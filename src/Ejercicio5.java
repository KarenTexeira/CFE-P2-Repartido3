public class Ejercicio5 {
    public static void main(String[] args){

        int matriz[][]= {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println("Diagonal principal: ");
        for(int i=0; i<matriz.length; i++){
            System.out.print(matriz[i][i] + " ");
        }
    }
}