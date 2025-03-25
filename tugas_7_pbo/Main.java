package com.mycompany.tugas_7_pbo;

/**
 *
 * @author alvin
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan nilai a, b, c, d, e, f: \n");
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
            double d = input.nextDouble();
            double e = input.nextDouble();
            double f = input.nextDouble();1
            
            LinearEquation equation = new LinearEquation(a, b, c, d, e, f);
            
            if (equation.isSolvable()) {
                System.out.println("Nilai x: " + equation.getX());
                System.out.println("Nilai y: " + equation.getY());
            } else {
                System.out.println("Persamaan tidak memiliki solusi");
            }
        }
    }
}

