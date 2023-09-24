import java.util.Scanner;

public class FPU2Prob28_DFPS {

    private static void inventoryPrinter(int[] itemPrices, String[] itemInventory) {
        /* El método debe ser static porque en la forma en la que esperamos que trabaje, y la forma de llamarlo, es comportamiento static.
        De no ser así, tendría yo que crear un nuevo objeto de tipo inventoryPrinter.
        */
        for (byte i=0;i<4;i++) {
            System.out.println(i+1 + ") " + itemInventory[i] + " - " + itemPrices[i]);
        }
        System.out.print("> ");
    }

    public static void main (String[] args) {
        byte userChoice=-1;
        float discountedPrice=0;
        String[] itemInventory = new String[] {"Zanahoria (KG)","Limones (KG)","Kiwi (KG)","Sillones"};
        int[] itemPrices = new int[] {40,3500,100,20000};

        Scanner scannedUserChoice = new Scanner(System.in);
        System.out.println("+--------------------------------------+\nCalculadora de descuentos V2.5\n+--------------------------------------+\nQué artículos deseas añadir a tu carrito de compras?");
        inventoryPrinter(itemPrices, itemInventory);
        userChoice += (scannedUserChoice.nextByte()); // De esta forma, estamos seguros que si el usuario quiere el artículo 4 e ingresa 4, no va a generar un error outOfIndex. De no ser de esta forma, tendríamos que usar int en lugar de byte usando más memoría.

        scannedUserChoice.close();
        if (itemPrices[userChoice]>=200) {
            discountedPrice = itemPrices[userChoice] * 0.80F;
        } else if (itemPrices[userChoice]<200 && itemPrices[userChoice]>100) {
            discountedPrice = (float) itemPrices[userChoice] * 0.90F;
        } else {
            discountedPrice = itemPrices[userChoice] * 1F;
        }

        System.out.printf("El total a pagar por %s es de %.2f MXN.",itemInventory[userChoice],discountedPrice);
    }
}
