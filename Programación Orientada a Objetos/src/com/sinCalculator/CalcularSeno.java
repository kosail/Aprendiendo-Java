import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CalcularSeno {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingresa el número de términos a calcular: ");
        int limit = Integer.parseInt(br.readLine());
        
        System.out.print("Ingresa el ángulo en grados: ");
        double radDegree = Integer.parseInt(br.readLine()) / 57.3;

        double sin = SeriesCalculator.calculate(limit, radDegree);

        System.out.printf("Seno de %.2f radianes: %f\n", radDegree, sin);
        br.close();
    }
}
