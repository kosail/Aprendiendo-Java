package com.pruebaDiagnostica;

public class SalaryCalcPerTimeframe {
    private final int workedDays;

    public SalaryCalcPerTimeframe(int workedDays) {
        this.workedDays = workedDays;
    }

    public int getJob1Salary() {
        int ratePerHour = 10;
        return ratePerHour * workedDays;
    }

    public int getJob2Salary() {
        int wage = 0;
        for (int i=0;i<=workedDays;i++) {
            wage+=i;
        }
        return wage;
    }
}
