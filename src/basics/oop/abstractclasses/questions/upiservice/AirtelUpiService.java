package basics.oop.abstractclasses.questions.upiservice;

public class AirtelUpiService extends UpiService{
    @Override
    protected void debitFromSender(double amount, int remitterAccno) {
        System.out.println("Debiting " + amount + " from account no. " + remitterAccno);
    }

    @Override
    protected void creditToReceiver(double amount, int beneficiaryAccno) {
        System.out.println("Crediting " + amount + " to account no. " + beneficiaryAccno);
    }
}
