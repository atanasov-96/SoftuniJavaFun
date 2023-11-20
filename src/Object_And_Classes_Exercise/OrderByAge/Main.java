package Object_And_Classes_Exercise.OrderByAge;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();
        while (true) {
            String[] personalInfo = scanner.nextLine().split(" ");
            if (personalInfo[0].equals("End")){
                break;
            }
            String name = personalInfo[0];
            String id = personalInfo[1];
            int age = Integer.parseInt(personalInfo[2]);

            Person person = new Person(name,id,age);
            people.add(person);
        }
        Collections.sort(people, Comparator.comparingInt(Person::getAge));
        for (Person person : people) {
            System.out.printf("%s with ID: %s is %d years old.\n",person.getName(),person.getId(),person.getAge());
        }
    }
}
