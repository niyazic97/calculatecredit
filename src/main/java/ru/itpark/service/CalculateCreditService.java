package ru.itpark.service;

public class CalculateCreditService {
    public double calculateMonthlyPayment(int sumCredit, double percentCredit, int termCredit) {
        double a = percentCredit / 12 / 100;
        double power = Math.pow(1 + a, -termCredit);
        double monthlyPayment = sumCredit * (a / (1 - power));
        return monthlyPayment;
    }

    public double calculateOverPayment(int sumCredit, double percentCredit, int termCredit) {
        double methodMonthlyPayment = calculateMonthlyPayment(sumCredit, percentCredit, termCredit);
        double paymentPerMonth = sumCredit / termCredit;
        double overPayment = (methodMonthlyPayment - paymentPerMonth) * 2;
        return overPayment;

    }

    public double calculateWholeTerm(int sumCredit, double percentCredit, int termCredit) {
        double entireLoanTerm = calculateMonthlyPayment(sumCredit, percentCredit, termCredit);
        double wholeTerm = entireLoanTerm * termCredit;
        return wholeTerm;
    }
}