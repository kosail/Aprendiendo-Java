public class SeriesCalculator {
    static double calculate(int limit, double radDegree) {
        double sinX = 0;

        for (int i=1, j=1 ; i < limit; i++, j+=2) {
            if (i % 2 == 0) {
                sinX -= Math.pow(radDegree, j) / factorialCalculator(j);
            } else {
                sinX += Math.pow(radDegree, j) / factorialCalculator(j);
            }
        }

        return sinX;
    }

    static long factorialCalculator(int limit) {
        long fact = 1;
        for (int i = 1; i <= limit ; i++) {
            fact *= i;
        }

        return fact;
    }
}
