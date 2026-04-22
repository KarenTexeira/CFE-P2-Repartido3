
public class Ejercicio5 {
    public static void main(String[] args){

        int matriz[][]= {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int primerElemento=matriz[0][0];
        int elementoSegundo=matriz [1][1];
        int elementoTercero=matriz [2][2];
        int ultimoElemento= matriz[matriz.length - 1][matriz[0].length-1];
        System.out.println("Diagonal principal: " + primerElemento + " " + elementoSegundo + " " + elementoTercero + "  " + ultimoElemento);
    }
}