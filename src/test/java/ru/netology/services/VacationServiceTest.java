package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/vacation.csv")
    public void calculateVacationMonth(int income, int expenses, int threshold, int expected){
        VacationService service = new VacationService();

//        int income = 10_000;
//        int expenses = 3_000;
//        int threshold = 20_000;
//        int expected = 3;
        int actual = service.vacationCalculate(income,expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    void calculateVacationMonthBigIncome(){
//        VacationService service = new VacationService();
//
//        int income = 100_000;
//        int expenses = 60_000;
//        int threshold = 150_000;
//
//        int expected = 2;
//        int actual = service.vacationCalculate(income,expenses, threshold);
//
//        Assertions.assertEquals(expected, actual);
//    }
}
