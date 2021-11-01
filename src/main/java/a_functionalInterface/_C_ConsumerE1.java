package a_functionalInterface;

import java.util.function.Consumer;

/*
Consumer<T>  Represents an operation that accepts a single input argument and returns no result.
 */
public class _C_ConsumerE1 {

    public static void main(String [] args){

        Customer maria=new Customer("maria", "3483487");
        //normal java function
        greetCustomer(maria);

        //functional interface
        greetCustomerConsumer.accept(maria);
    }

    static Consumer<Customer> greetCustomerConsumer= customer->
            System.out.println("Hello "+ customer.customerName + ", phone : "+ customer.customerPhoneNumber);

    static void greetCustomer(Customer c){
        System.out.println("Hello "+ c.customerName + ", phone : "+ c.customerPhoneNumber);

    }
//classe innestata
    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
