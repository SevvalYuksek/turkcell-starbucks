package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EdevletService {
    private static List<Person> personList = new ArrayList<>();
    static{
        personList.add(new Person("Sevval", "Yuksek", 2000, "12345"));
        personList.add(new Person("Eren", "Yuksek", 1990, "98765"));
        personList.add(new Person("Emre", "Yuksek", 2000, "14785"));
    }
    public boolean verify(String name, String lastName, int birthYear, String nationalId){
        for (Person person : personList) {
            if(person.getName().equals(name)&&
                    person.getLastName().equals(lastName)&&
                    person.getBirthYear()==birthYear&&
                    person.getNationalId().equals(nationalId))       {
                return true;
            }
        }
        return false;
    }
}
