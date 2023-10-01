package testsAndLearnings;

public class BPrinter {
    public static void main(String[] args) {
        for (int j=0;j<2;j++) {
            for (int i=0;i<5;i++) {
                System.out.printf("%s","*");
            }
    
            System.out.println("");
    
            for (int i=0;i<3;i++) {
                System.out.printf("%1$s    %1$s\n", "*");
            }
        }
        for (int i=0;i<5;i++) {
            System.out.printf("%s","*");
        }
    }
}
