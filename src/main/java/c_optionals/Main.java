package c_optionals;

/*

java 8

 le classi optional sono delle classi wrapper che consentono di evitare nullPointerException in alcune situazioni.
Queste infatti possono incapsulare valori di un certo tipo e sfruttare i propri metodi affinchè l'eccezione non sia lanciata, SENZA DOVER
RICORRERE AI SOLITI CONTROLLI DI NULLITà

ES

	String getTitolo(String titolo){
	    if(titolo != null){
		return(titolo)
		}
	   return "nessun titolo"
	}

	String getTitolo(String titolo){
	   Option<String> opt= Optional.ofNullable(titolo);
	   return opt.orElse("nessun titolo")
	}
*/


import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        //se scrivi qualcosa al posto di null torna quella stringa
        Object value=Optional.ofNullable(null)
                .orElseGet(()-> "default value"); //orElseGet vuole un supplier
        System.out.println(value);

        Object value2= Optional.ofNullable("ciao")
                .orElseThrow(()-> new IllegalArgumentException("exception"));

        System.out.println(value2);


        Optional.ofNullable("mcm90@hotmail.it")
                .ifPresent(email -> System.out.println("Sending email to "+ email) );

        Optional.ofNullable("mcm90@hotmail.it")
                .ifPresentOrElse(email -> System.out.println("Sending email to "+ email),
                        ()-> System.out.println("non posso invia l'email"));

    }


}
