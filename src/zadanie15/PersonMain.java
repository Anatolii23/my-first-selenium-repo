package zadanie15;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

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
      // String olders = personList.stream();

    }




}
