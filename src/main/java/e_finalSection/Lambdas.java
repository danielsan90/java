package e_finalSection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {

    public static void main(String[] args) {


        //quando la funzione fa solo qualcosa puoi scrive come segue (nome è la stringa in input alla funzione )
        Function<String, String> upperCaseName= (name) -> name.toUpperCase(); //<- se a name non ci metti la parentesi è uguale quando hai un argomento

        //se vuoi aggiunge logica fai cosi
        Function<String, String> upperCaseNameTwo= name -> {
            //logic
            if(name.isBlank()) throw new IllegalArgumentException("");
            return  name.toUpperCase();
        };

        //se la funzione accetta piu parametri

        BiFunction<String, Integer, String> upperCaseNameThree = (name, age) ->{
            if(name.isBlank()) throw new IllegalArgumentException("");
            System.out.println(age);
            return name.toUpperCase();

        };

        String result= upperCaseNameThree.apply("Daniele", 31);

        System.out.println(result);


    }




}
