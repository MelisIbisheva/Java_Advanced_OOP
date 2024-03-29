package FunctionalProgramming_lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Predicate<String> startWithUpperCase = w->Character.isUpperCase(w.charAt(0));

        List<String> upperCaseWords = Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(startWithUpperCase).collect(Collectors.toList());

        System.out.println(upperCaseWords.size());
        System.out.println(String.join(System.lineSeparator(), upperCaseWords));

    }
}
