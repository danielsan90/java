import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args){
        List<Person> people= List.of(
                new Person("Anna", Gender.FEMALE),
                new Person("John", Gender.MALE),
                new Person("Rita", Gender.FEMALE),
                new Person("Marco", Gender.MALE),
                new Person("Ric", Gender.MALE),
                new Person("Nadia", Gender.MALE)
        );

        //IMPERATIVE: definiamo ogni singolo dettaglio
        List<Person> females= new ArrayList<>();
        for(Person person: people){
            if(Gender.FEMALE.equals(person.gender)){
                females.add(person);
            }
        }
        for(Person person : females){
            System.out.println(person);
        }

        //DICHIARATIVA: +corta, +ordinata: gli diciamo cosa vogliamo fare
        //stream e collection sono alla base
        System.out.println("Dichiarativa");

        List<Person> femalesTwo = people.stream().
                filter(person->Gender.FEMALE.equals(person.gender))
                .collect(Collectors.toList());
        //in pratica filtra le donne e raccoglie in una lista
        femalesTwo.forEach(System.out::println);

        //NB-> nota il predicato, lo stream è lo stesso
        //il predicato torna true o false
        Predicate<Person> personPredicate= person -> Gender.FEMALE.equals(person.gender);
        List<Person> females3 = people.stream().
                filter(personPredicate)
                .collect(Collectors.toList());
        //in pratica filtra le donne e raccoglie in una lista
        females3.forEach(System.out::println);

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
