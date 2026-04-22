import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){

        String Nombres[] = {"Ana","Luis","Marta","Pedro","Juan"};
        Scanner leer= new Scanner(System.in);

        System.out.println("Ingrese un nombre:");
        String nombre = leer.nextLine();

        boolean encontre = false;
        int i=0;

        while(i<Nombres.length &&! encontre) {
            if (Nombres[i].equalsIgnoreCase(nombre)) {
                encontre = true;
            }
            i++;
        }
        if (encontre) {
            System.out.println("El nombre " + nombre + " se encuentra en el arreglo");
           } else{
            System.out.println("El nombre " + nombre + " no se encuentra en el arreglo");

        }
    }
}