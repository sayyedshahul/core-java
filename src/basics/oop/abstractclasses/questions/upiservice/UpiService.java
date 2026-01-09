package basics.oop.abstractclasses.questions.upiservice;

public abstract class UpiService {
    public final void transferMoney(double amount, int remitterAccno, int beneficiaryAccno) {
        debitFromSender(amount, remitterAccno);
        creditToReceiver(amount, beneficiaryAccno);
    }

    protected abstract void debitFromSender(double amount, int remitterAccno);

    protected abstract void creditToReceiver(double amount, int beneficiaryAccno);
}

class PaymentMain{
    public static void main(String[] args){
        UpiService airtelUpi = new  AirtelUpiService();
        airtelUpi.transferMoney(234.25, 1234257623, 223757623);
    }
}