package b_streams;

import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _Stream {

    public static void main(String [] args){

        List<Person> people= List.of(
                new Person("Anna", Gender.FEMALE),
                new Person("John", Gender.MALE),
                new Person("Rita", Gender.FEMALE),
                new Person("Marco",Gender.MALE),
                new Person("Ric", Gender.MALE),
                new Person("Nadia", Gender.MALE)
        );

        /*
        Set Java
        Set in Java è un'interfaccia che fa parte di Java Collection Framework e implementa l'interfaccia Collection.
        Una raccolta di set fornisce le caratteristiche di un set matematico.
        Un set può essere definito come una raccolta di oggetti non ordinati e non può contenere valori duplicati.
         */
        System.out.println("Collectors.toSet");
        Set<Gender> genders=people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet()); //<- *stamperà FEMALE e MALE
        genders.stream().forEach(System.out::println);


        System.out.println("Collectors.tolist");
        List<Gender> g=people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toList()); //<- stamperà un gender per ogni occorrenza
        g.stream().forEach(System.out::println);


        //sapere se la lista contiene solo donne con allMatch
        Predicate<Person> personPredicate=person -> Gender.FEMALE.equals(person.gender);

        boolean containsOnlyFemales= people.stream()
                .allMatch(personPredicate); //allMatch()  returns true if all the elements of the stream match the provided predicate condition

        System.out.println("Only famels all match? " + containsOnlyFemales);

        //sapere se la lista contiene solo donne con anyMatch

        boolean containsAtLeastOneFemalesAnyMatch= people.stream()
                .anyMatch(person -> Gender.FEMALE.equals(person.gender)); // anyMatch()  returns true if at least 1 of the elements of the stream match the provided predicate condition


        System.out.println("contains at least one female? " + containsAtLeastOneFemalesAnyMatch);


    }

    static class Person{
        private final String name;
        private final Gender gender;


        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender{
        MALE, FEMALE
    }
}
