import java.util.Scanner;

public class FPU2Prob19_DFPS {
    public static void main(String[] args) {
        short[] numArray, numOrderedArray;
        numArray = new short[3]; numOrderedArray = new short[3];
        Scanner numScanner = new Scanner(System.in);

        for (int i=0;i<3;i++) {
            System.out.printf("Ingresa el %d número: ",i+1);
            numArray[i] = numScanner.nextShort();
        }
    
        if (numArray[0] < numArray[1]) {
            if (numArray[1] < numArray[2]) {
                numOrderedArray[0] = numArray[2];
                numOrderedArray[1] = numArray[1];
                numOrderedArray[2] = numArray[0];
            } else {
                numOrderedArray[0] = numArray[1];

                if (numArray[0] < numArray[2]) {
                    numOrderedArray[1] = numArray[2];
                    numOrderedArray[2] = numArray[0];
                } else {
                    numOrderedArray[1] = numArray[0];
                    numOrderedArray[2] = numArray[2];
                }
            }
        } else {
            if (numArray[0] < numArray[2]) {
                numOrderedArray[0] = numArray[2];
                numOrderedArray[1] = numArray[0];
                numOrderedArray[2] = numArray[1];
            } else {
                numOrderedArray[0] = numArray[0];

                if (numArray[1] < numArray[2]) {
                    numOrderedArray[1] = numArray[2];
                    numOrderedArray[2] = numArray[1];
                } else {
                    numOrderedArray[1] = numArray[1];
                    numOrderedArray[2] = numArray[2];
                }
            }
        }

        System.out.println("El orden ascendente de los números es:");

        for (int i=2;i>=0;i--) {
            System.out.println("-> " + numOrderedArray[i]);
        }
        numScanner.close();
    }
}
