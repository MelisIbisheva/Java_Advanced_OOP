package DefiningClasses_exercise.OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int countOfPeople = Integer.parseInt(scanner.nextLine());
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < countOfPeople; i++) {
            String[] personInfo = scanner.nextLine().split(" ");
            String name = personInfo[0];
            int age = Integer.parseInt(personInfo[1]);
            Person person = new Person(name, age);

            persons.add(person);
        }

        persons.stream()
                .filter(person -> person.getAge()>30)
                .sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);

    }
}
