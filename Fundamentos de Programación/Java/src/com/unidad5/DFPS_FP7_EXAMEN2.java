public class DFPS_FP7_EXAMEN2 {

    public static void arrayFiller(int[][] mainArray) {
        for (int i=0; i<mainArray.length;i++) {
            for (int j=0;j<mainArray[i].length;j++) {
                mainArray[i][j] = (int) (Math.random() * 1000);
            }
        }
    }

    public static int digitFiveOcurrence(int [][] mainArray) {
        int counter = 0;

        for (int i=0; i<mainArray.length;i++) {
            for (int j=0;j<mainArray[i].length;j++) {
                if (mainArray[i][j]%5 == 0) {
                    counter++;
                }
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        int[][] mainArray = new int[3][5];

        arrayFiller(mainArray);

        System.out.println("Contenido arreglo: ");
        for (int i=0; i<mainArray.length;i++) {
            for (int j=0;j<mainArray[i].length;j++) {
                System.out.print(mainArray[i][j] + " ");
            }
            System.out.println();
        }

        System.out.printf("Cantidad múltiplos de cinco: %d\n", digitFiveOcurrence(mainArray));
    }
}