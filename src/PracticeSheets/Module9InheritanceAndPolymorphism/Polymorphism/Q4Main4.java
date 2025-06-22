package PracticeSheets.Module9InheritanceAndPolymorphism.Polymorphism;

//Write a class Bank with method getInterestRate().
// Inherit it in SBI, ICICI, override the method in each.
// Call using parent reference to show runtime polymorphism.
class Bank {
    double getInterestRate() {
        return 0.0;
    }
}

class SBI extends Bank {
    @Override
    double getInterestRate() {
        return 6.5;
    }
}

class ICICI extends Bank {
    @Override
    double getInterestRate() {
        return 7.0;
    }
}

public class Q4Main4 {
    public static void main(String[] args) {
        Bank bank;

        bank = new SBI();
        System.out.println("SBI Interest Rate: " + bank.getInterestRate());

        bank = new ICICI();
        System.out.println("ICICI Interest Rate: " + bank.getInterestRate());
    }
}
