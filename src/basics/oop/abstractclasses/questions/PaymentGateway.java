package basics.oop.abstractclasses.questions;

public abstract class PaymentGateway {

    public final void processPayment(double amount){
        if(amount < 1){
            System.out.println("Amount cannot be lesser than 1");
        }
        else{
            deductAmount(amount);
            System.out.println("Payment Successful");
        }
    }

    public abstract void deductAmount(double amount);
}

class DebitCardPayment extends PaymentGateway{
    @Override
    public void deductAmount(double amount) {
        System.out.println("Deducting " + amount + " from debit card...");
        System.out.println("Amount deducted successfully");
    }
}

class UpiPayment extends PaymentGateway{
    @Override
    public void deductAmount(double amount) {
        System.out.println("Intiating UPI collect request for " + amount);
        System.out.println("Amount deducted successfully");
    }
}

class Main{
    public static void main(String[] args){
        PaymentGateway debitCard = new DebitCardPayment();
        PaymentGateway upi = new UpiPayment();

        debitCard.processPayment(459.87);
        upi.processPayment(523.87);
    }
}