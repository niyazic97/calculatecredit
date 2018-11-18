package ru.itpark.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateCreditServiceTest {

    @Test
    void calculateMonthlyPayment() {
        CalculateCreditService service = new CalculateCreditService();
        double monthlyPayment = service.calculateMonthlyPayment(1000, 10, 2);
        assertEquals(506.2586445366537, monthlyPayment);
    }

    @Test
    void calculateOverPayment() {
        CalculateCreditService service = new CalculateCreditService();
        double overPayment = service.calculateOverPayment(1000, 10, 2);
        assertEquals(12.517289073307438, overPayment);
    }

    @Test
    void calculateWholeTerm() {
        CalculateCreditService service = new CalculateCreditService();
        double wholeTerm = service.calculateWholeTerm(1000, 10, 2);
        assertEquals(1012.5172890733074, wholeTerm);
    }
}