package FunctionalProgramming_lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class AddVAT {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        UnaryOperator<Double> addVat = p-> p * 1.20;
        Consumer<Double> printer = e-> System.out.printf("%.2f%n", e);
        System.out.println("Prices with VAT:");
        Arrays.stream(scanner.nextLine().split(", "))
                .map(Double::parseDouble)
                .map(addVat)
                .forEach(printer);


    }
}
