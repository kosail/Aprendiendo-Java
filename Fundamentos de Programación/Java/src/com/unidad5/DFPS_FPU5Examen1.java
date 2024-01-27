/* Construir un método o función que reciba como parámetro un vector de 12 enteros y que regrese el elemento mayor del vector.
Genere los valores aleatoriamente. Muestre el contenido del arreglo y su elemento mayor, para que el usuario pueda
corroborar los resultados.
*/

public class DFPS_FPU5Examen1 {

    private static void arrayFiller(int[] vector) {
        for (int i=0; i<vector.length;i++) {
            vector[i] = (int) (Math.random() * 1000);
        }
    }

    private static int biggestNumberFinder(int[] vector, int biggestNumber) {
        for (int i=0; i<vector.length; i++) {
            if (biggestNumber<vector[i]) {
                biggestNumber = vector[i];
            }
        }
        return biggestNumber;
    }
    
    public static void main(String[] args) {
        int biggestNumber=0;
        int[] vector = new int[12];

        arrayFiller(vector);
        biggestNumber = biggestNumberFinder(vector, biggestNumber);

        System.out.print("Vector: ");
        for (int i=0;i<vector.length;i++) {
            System.out.printf("%d ", vector[i]);
        }
        System.out.println();

        System.out.printf("Número mayor: %d\n", biggestNumber);
    }
}
