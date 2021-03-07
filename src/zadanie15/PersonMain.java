package zadanie15;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class PersonMain {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        try {
            BufferedReader  reader = new BufferedReader(new FileReader("src/zadanie15/List.csv"));
            String line = reader.readLine();
            line = reader.readLine();

            while (line != null) {
                String[] split= line.split(",");
                Person person = new Person(split[0].trim(),split[1].trim(),Integer.parseInt(split[2].trim()),Integer.parseInt(split[3].trim()),Integer.parseInt(split[4].trim()));
                System.out.println(line);
                personList.add(person);
                line= reader.readLine();
            }
            reader.close();
        }
         catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
      Person olders = personList.stream()
              .max(Comparator.comparing(person -> person.getAge()))
              .get();
        Person yonger = personList.stream()
                .min(Comparator.comparing(person -> person.getAge()))
                .get();
        Person maxH = personList.stream()
                .max(Comparator.comparing(person -> person.getHeight()))
                .get();
        Person minH = personList.stream()
                .min(Comparator.comparing(person -> person.getHeight()))
                .get();
        Person maxW = personList.stream()
                .max(Comparator.comparing(person -> person.getWeight()))
                .get();
        Person minW = personList.stream()
                .min(Comparator.comparing(person -> person.getWeight()))
                .get();
        List<Person> personListJan = personList.stream()
                .filter(person -> person.getFirstName().equals("Jan"))
                .collect(Collectors.toList());
        List<Person> personListWateusz = personList.stream()
                .filter(person -> person.getFirstName().equals("Vateusz"))
                .collect(Collectors.toList());
        Set<String> personnameSet = personList.stream()
                .map(Person::getFirstName)
                .collect(Collectors.toSet());
        Set<String> personSurnameSet = personList.stream()
                .map(Person::getLastName)
                .collect(Collectors.toSet());
//       Map<String, List<Person>> map = personList.stream()
//               .map(Person::getLastName)
    }






}
