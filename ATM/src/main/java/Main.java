import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Customer alex = new Customer("Nedieanu Alexandru", "4123431234562343", 4321, 500, Currency.LEI);
        ATM atm = new ATM();
        atm.welcome(alex);
    }



}


