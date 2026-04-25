public class Ejercicio2 {
    public static void main(String[] args) {

        int vec1[] = {2, 6, 4, 5, 8, 9, 6, 4};
        int vec2[] = {10, 2, 5, 10, 4, 7, 5, 6};

        int aux;

        for (int i = 1; i < vec1.length; i += 2) {
            aux = vec1[i];
            vec1[i] = vec2[i];
            vec2[i] = aux;
        }

        System.out.print("vec1: ");
        for (int i = 0; i < vec1.length; i++) {
            System.out.print(vec1[i] + " ");
        }

        System.out.println();

        System.out.print("vec2: ");
        for (int i = 0; i < vec2.length; i++){
            System.out.print(vec2[i] + " ");
        }
    }
}