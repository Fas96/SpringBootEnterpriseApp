package com.example.classes;

import com.example.utils.PrimeGenerator;

import java.io.PrintStream;

public class PrimePrinter {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 1000;
        int[] primes = PrimeGenerator.generatePrimes(NUMBER_OF_PRIMES);
        final int ROWS_PER_PAGE = 50;
        final int COLUMNS_PER_PAGE = 4;
        RowColumnPagePrinter tablePrinter =   new RowColumnPagePrinter(ROWS_PER_PAGE,
                        COLUMNS_PER_PAGE,
                        "The First " + NUMBER_OF_PRIMES +
                                " Prime Numbers");
        tablePrinter.print(primes);
    }

}