package d_combinatorPattern;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "mcm90hotmail.it",
                "+03891503678",
                LocalDate.of(200, 1,1)
        );

     //   CustomerValidatorService validatorService= new CustomerValidatorService();

      //  System.out.println(validatorService.isValid(customer));

        //if valid we can store customer in db

        //using combinator pattern

        CustomerRegistrationValidator.ValidationResult result= CustomerRegistrationValidator
                .isEmailValid()
                .and(CustomerRegistrationValidator.isPhoneValid())
                .and(CustomerRegistrationValidator.isAdult())
                .apply(customer); //<- se non ci metti apply non vengono lanciate le function

        System.out.println(result);

        if(result != CustomerRegistrationValidator.ValidationResult.SUCCESS){
            throw  new IllegalStateException(result.name());
        }

    }
}
